package com.example.medicare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InfActivity extends AppCompatActivity {
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inf);
        button2 = (Button) findViewById(R.id.dcButton);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dcIntent = new Intent(getApplicationContext(),DoctorInfActivity.class);
               startActivity(dcIntent);
            }
        });
        button2 = (Button) findViewById(R.id.mdButton);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dcIntent = new Intent(getApplicationContext(),MedicineInfActivity.class);
                startActivity(dcIntent);
            }
        });
        button2 = (Button) findViewById(R.id.blButton);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dcIntent = new Intent(getApplicationContext(),BloodBankInfActivity.class);
                startActivity(dcIntent);
            }
        });
        button2 = (Button) findViewById(R.id.amButton);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dcIntent = new Intent(getApplicationContext(),CallAmbuLanceActivity.class);
                startActivity(dcIntent);
            }
        });

    }
}
