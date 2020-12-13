package com.example.pratics;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnGiris ;
        btnGiris = (Button) findViewById(R.id.button3);

        btnGiris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startActivty(v);
            }
        });
    }

    public void startActivty(View view){
        Intent intent = new Intent(this, DegistirActivity.class);
        startActivity(intent);
    }
}