package com.example.ayush.loginassignmentfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv1 = (TextView) findViewById(R.id.tv_homePageText);//decleration

        Intent intent = getIntent();
        String userName1 = intent.getStringExtra("username");//gets value from name edittext and puts it in the textview
        tv1.setText("Welcome " + userName1);//prints the textview

    }
}
