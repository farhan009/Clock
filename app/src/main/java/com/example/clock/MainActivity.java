package com.example.clock;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.DigitalClock;
import android.widget.TextClock;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private AnalogClock analogClock;
    private DigitalClock digitalClock;
    private TextClock textClock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        analogClock = findViewById(R.id.analogClock_id);
        digitalClock = findViewById(R.id.digitalClock_id);
        textClock = findViewById(R.id.textClock_id);

        analogClock.setOnClickListener(this);
        digitalClock.setOnClickListener(this);
        textClock.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.analogClock_id){
            Toast.makeText(MainActivity.this, "Analog Clock", Toast.LENGTH_SHORT).show();
        }
        if (v.getId()==R.id.digitalClock_id){
            Toast.makeText(MainActivity.this, "Digital Clock", Toast.LENGTH_SHORT).show();
        }
        if (v.getId()==R.id.textClock_id){
            Toast.makeText(MainActivity.this, "Text Clock", Toast.LENGTH_SHORT).show();
        }
    }
}
