package com.example.passwordmanagerapp.Controller;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.passwordmanagerapp.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Add account button
        Button btnAddAccount = (Button) findViewById(R.id.addAccountButton);
        btnAddAccount.setOnClickListener(this);
    }

    public void onClick(View v){
        int id = v.getId();
        if (id == R.id.addAccountButton){

        }
    }
}