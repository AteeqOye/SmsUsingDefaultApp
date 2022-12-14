package com.example.smsusingdefaultapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        Button sendBtn = findViewById (R.id.sentBtn);
        sendBtn.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent iMsg = new Intent (Intent.ACTION_SENDTO);
                iMsg.setData (Uri.parse ("smsto: "+Uri.decode ("03107768350")));
                iMsg.putExtra ("sms_body" , "Hi!");
                startActivity (iMsg);
            }
        });
    }
}