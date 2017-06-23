package com.example.ayush.loginassignmentfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.R.attr.data;

public class LoginActivity extends AppCompatActivity {

    public static String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText et1 = (EditText) findViewById(R.id.et_name);
        final EditText et2 = (EditText) findViewById(R.id.et_email);
        final EditText et3 = (EditText) findViewById(R.id.et_password);
        Button bt1 = (Button) findViewById(R.id.bt_continue);//Declaration


        bt1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(et3.getText().length() < 6){
                    if(et2.getText().toString().isEmpty() || et3.getText().toString().isEmpty()){
                        Toast.makeText(getApplicationContext(),"Please enter password and email",Toast.LENGTH_LONG).show();//checks if email and password have been given
                    }
                    else {
                        Toast.makeText(getApplicationContext(), "Password must be greater then 6 characters", Toast.LENGTH_LONG).show();//checks if password is greater then 6 characters
                    }
                }
            else{
                    goToHomeScreen();

            }
            }
            public void goToHomeScreen(){
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);//new intent
                String username = et1.getText().toString();//saves the user's name as username
                intent.putExtra("username", username);//sends username to new activity
                startActivity(intent);
            }
    });
}}
