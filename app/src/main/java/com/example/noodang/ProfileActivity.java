package com.example.noodang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.google.firebase.database.FirebaseDatabase;

public class ProfileActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton male,female;
    FirebaseDatabase database;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        //
    }
}