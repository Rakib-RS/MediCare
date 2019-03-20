package com.example.medicare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserActivity extends AppCompatActivity {
    private Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        button2 = (Button) findViewById(R.id.dcButton);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dcIntent = new Intent(getApplicationContext(),FindDoctor.class);
                startActivity(dcIntent);
            }
        });
        button2 = (Button) findViewById(R.id.MButton);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dcIntent = new Intent(getApplicationContext(),FindMedicine.class);
                startActivity(dcIntent);
            }
        });
        button2 = (Button) findViewById(R.id.mdButton);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dcIntent = new Intent(getApplicationContext(),BloodBank.class);
                startActivity(dcIntent);
            }
        });
        button2 = (Button) findViewById(R.id.amButton);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dcIntent = new Intent(getApplicationContext(),CallAmbulance.class);
                startActivity(dcIntent);
            }
        });
        button2 = (Button) findViewById(R.id.pButton);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dcIntent = new Intent(getApplicationContext(),PrimaryTreatmentActivity.class);
                startActivity(dcIntent);
            }
        });
        button2 = (Button) findViewById(R.id.healButton);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dcIntent = new Intent(getApplicationContext(),HealthTipsActivity.class);
                startActivity(dcIntent);
            }
        });
    }
}
