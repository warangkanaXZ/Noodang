package com.example.noodang;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class NotiActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    private Switch aSwitch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noti);

        aSwitch = findViewById(R.id.bn_switch1);
        aSwitch.setOnCheckedChangeListener(this);

        aSwitch = findViewById(R.id.bn_switch2);
        aSwitch.setOnCheckedChangeListener(this);

    }


    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch (buttonView.getId())
        {
            case R.id.bn_switch1:
                if (isChecked)
                    showMessage("เปิดการแจ้งเตือน");
                else
                    showMessage("ปิดการแจ้งเตือน");
                break;

            case R.id.bn_switch2:
                if (isChecked)
                    showMessage("เปิดการแจ้งเตือน");
                else
                    showMessage("ปิดการแจ้งเตือน");
                break;
        }
    }

    private void showMessage (String message){
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }
}