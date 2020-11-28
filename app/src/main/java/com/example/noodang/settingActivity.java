package com.example.noodang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class settingActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView logout, edit_Profile, noti;
    private ImageView setting_back;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        edit_Profile = (TextView) findViewById(R.id.edit_profile);
        edit_Profile.setOnClickListener(this);

        noti = (TextView) findViewById(R.id.edit_noti);
        noti.setOnClickListener(this);

        logout = (TextView) findViewById(R.id.signout);

        }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.edit_profile:
                startActivity(new Intent(this, ProfileActivity.class));
                break;
            case R.id.edit_noti:
                startActivity(new Intent(this, NotiActivity.class));
                break;
            }
        }

    }

