package com.galih.utspraktik_if5_10119175_mochamadgalihprasetya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/*
Kamis, 2 Juni 2022
10119175
Mochamad Galih Prasetya
IF5
*/

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnNext = findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent confirmActivity = new Intent(getApplicationContext(), ConfirmActivity.class);
                startActivity(confirmActivity);
            }
        });
    }
}