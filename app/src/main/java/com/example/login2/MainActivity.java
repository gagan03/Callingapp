package com.example.login2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
   EditText usernameet,passwordet;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        //onlogin();
        setContentView(R.layout.activity_main);
        usernameet = (EditText)findViewById(R.id.editText);
        passwordet =(EditText)findViewById(R.id.editText2);
    }
    public void onlogin(View view)
    {
     String username = usernameet.getText().toString();
     String pass = passwordet.getText().toString();
     String type="login";
     background bg = new background(this);
     bg.execute(type,username,pass);
    }
}
