package com.sanraphindustries.sanraph.breakfree;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class NotePad extends AppCompatActivity {
    EditText editText1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_pad);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        editText1 = findViewById(R.id.EditText1);
        editText1.setText(Open("Note.txt"));

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Note Saved!", Snackbar.LENGTH_LONG)
                        .setAction("Exception!", null).show();
            }
        });
    }

    public void Save(String fileName){
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(openFileOutput(fileName, 0));
            outputStreamWriter.write(String.valueOf(editText1));
            outputStreamWriter.close();
            Toast.makeText(this, "Note Saved!", Toast.LENGTH_SHORT).show();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Throwable throwable) {
            Toast.makeText(this, "Exception!" + throwable.toString(), Toast.LENGTH_SHORT).show();
        }

    }


    public boolean FileExist (String fname){
        File file = getBaseContext().getFileStreamPath(fname);
        return file.exists();
    }


    public String Open(String fileName){
        String content = "";

        if (FileExist(fileName)){
            try {
                InputStream inputStream = openFileInput(fileName);
                if (inputStream != null){
                    InputStreamReader tmp = new InputStreamReader(inputStream);
                    BufferedReader reader = new BufferedReader(tmp);
                    String string;

                    StringBuilder stringBuilder = new StringBuilder();
                    while ((string = reader.readLine()) != null){
                        stringBuilder.append(string + "\n");

                    }inputStream.close();

                    content = stringBuilder.toString();
                }


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (Throwable throwable) {
                Toast.makeText(this, "Exception: " + throwable.toString(), Toast.LENGTH_LONG).show();
            }
        }

        return content;
    }





}
