package com.example.medicare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DoctorInfActivity extends AppCompatActivity {
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_inf);
        button2 = (Button) findViewById(R.id.DhButton);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dcIntent = new Intent(getApplicationContext(),DhakaActivity.class);
                startActivity(dcIntent);
            }
        });
    }
}
