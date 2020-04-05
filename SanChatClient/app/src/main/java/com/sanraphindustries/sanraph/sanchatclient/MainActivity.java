package com.sanraphindustries.sanraph.sanchatclient;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class MainActivity extends AppCompatActivity {
    EditText serverIp;
    EditText send_Message;
    TextView chat;
    Button connectPhones;
    Button send;
    String serverIpAddress = "";
    String message = "";
    String string;
    Handler handler = new Handler();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chat = findViewById(R.id.chat);
        serverIp = findViewById(R.id.server_ip);
        send_Message = findViewById(R.id.smessage);
        send = findViewById(R.id.sent_button);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Thread sendThread = new Thread(new sendMessage());
                sendThread.start();
            }
        });
        connectPhones = findViewById(R.id.connect_phones);
        connectPhones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                serverIpAddress = serverIp.getText().toString();
                if(!serverIpAddress.equals("")){
                    Thread clientThread = new Thread(new ClientThread());
                    clientThread.start();
                }
            }
        });


    }



    class sendMessage implements Runnable{

        @Override
        public void run() {
            try{
                InetAddress serverAddress = InetAddress.getByName(serverIpAddress);
                Socket socket = new Socket(serverAddress, 10000);
                //create client socket
                DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
                string = send_Message.getText().toString();
                string = string + "\n";
                message = message + "Client:" + string;
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        chat.setText(message);
                    }
                });

                dataOutputStream.writeBytes(string);
                dataOutputStream.flush();
                dataOutputStream.close();
                socket.close();
            } catch (UnknownHostException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }



    public class ClientThread implements Runnable{

        @Override
        public void run() {
            try {
                while (true){
                    InetAddress serverAddress = InetAddress.getByName(serverIpAddress);
                    Socket socket = new Socket(serverAddress, 10000);
                    //create client socket
                    /***********************************
                     * set IP streams
                     * written by Sani Raphael Enejo
                     ***********************************/
                    DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
                    String line = null;
                    while ((line = dataInputStream.readLine())  != null){
                        message = message + "Server:" + line + "\n";
                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                chat.setText(message);
                            }
                        });
                    }

                    dataInputStream.close();
                    socket.close();
                    Thread.sleep(100);
                }
            } catch (UnknownHostException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
