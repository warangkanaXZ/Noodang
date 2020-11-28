package com.example.noodang;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ProfileActivity extends AppCompatActivity {


    Button b;
    Member member;
    RadioButton male,female,lgbtq;
    FirebaseDatabase database;
    DatabaseReference reference;
    int i = 0;
    EditText name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        b = findViewById(R.id.btgsave);
        member = new Member();
        male = findViewById(R.id.male);
        female = findViewById(R.id.female);
        lgbtq = findViewById(R.id.other);
        name = findViewById(R.id.fname);

        reference = database.getInstance().getReference().child("Users");

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                if (dataSnapshot.exists()) {
                    i = (int)dataSnapshot.getChildrenCount();
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {


                ////

            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String m1 = male.getText().toString();
                String m2 = female.getText().toString();
                String m3 = lgbtq.getText().toString();

                member.setName(name.getText().toString());

                if (male.isChecked()){
                    member.setGender(m1);
                    reference.child(String.valueOf(i+1)).setValue(member);
                }else {
                    member.setGender(m2);
                    reference.child(String.valueOf(i+1)).setValue(member);
                }
            }
        });
    }
}

