package com.example.myfit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Button login = findViewById(R.id.login);
        login.setText("hhhh");
    }

    public void toRegister(View view) {
        setContentView(R.layout.register);
    }
}