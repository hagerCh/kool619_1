package com.example.kool619;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class Chefloginphone extends AppCompatActivity {

    EditText num;
    Button sendcode;
    TextView signup;
    FirebaseAuth Fauth;
    String number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chefloginphone);

        num = (EditText)findViewById(R.id.number);
        sendcode = (Button)findViewById(R.id.otp);
        Fauth = FirebaseAuth.getInstance();

        sendcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number = num.getText().toString().trim();
                Intent b = new Intent(Chefloginphone.this, Chefsendcode.class);

                b.putExtra("Phonenum","+216"+number);
                startActivity(b);
                finish();

            }
        });
    }
}