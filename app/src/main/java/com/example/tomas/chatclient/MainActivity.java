package com.example.tomas.chatclient;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Thread(new createSocket()).start();
    }

    // Noget med en Socket.
    class createSocket implements Runnable{
        @Override
        public void run() {
            try {
                Socket socket = new Socket("192.168.1.3", 2222);
            } catch (UnknownHostException e) {
                System.out.println("Unknown host");
            } catch (IOException ioe){
                ioe.printStackTrace();
            }
        }
    }
}
