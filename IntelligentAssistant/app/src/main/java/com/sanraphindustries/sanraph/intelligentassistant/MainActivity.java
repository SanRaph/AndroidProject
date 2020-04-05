package com.sanraphindustries.sanraph.intelligentassistant;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    TextToSpeech textToSpeech;
    String string = "Hello, How are you? I am San Raph's Intelligent Assistant called robot teacher for Kids" +
            "I Help in task management, curate data, data extrapolation and analysis amongst many others."
            +"My Peculiar task is to read to you, how i do this is by reading the text to you provide in the edit text field"
            +"So make sure you provide me something to read to your kid and or kids" + "Thank you";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textToSpeech = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR){
                    textToSpeech.setLanguage(Locale.UK);
                }
            }
        });

    }

    @Override
    protected void onPause() {
        if (textToSpeech != null){
            textToSpeech.stop();
            textToSpeech.shutdown();
        }
        super.onPause();
    }


    public void speakText (View view){
        Toast.makeText(getApplicationContext(), string, Toast.LENGTH_LONG).show();
        textToSpeech.speak(string, TextToSpeech.QUEUE_FLUSH, null);
    }
}
