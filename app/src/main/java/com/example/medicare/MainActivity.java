package com.example.medicare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button2;
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button2 = (Button) findViewById(R.id.userButton);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dcIntent = new Intent(getApplicationContext(),UserActivity.class);
                startActivity(dcIntent);
            }
        });
        button2 = (Button) findViewById(R.id.infButton);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dcIntent = new Intent(getApplicationContext(),InfActivity.class);
                //startActivity(dcIntent);
            }
        });

    }
}
