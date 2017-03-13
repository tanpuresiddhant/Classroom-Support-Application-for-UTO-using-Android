package com.example.utopoly;
/* COPYRIGHTS GIVEN TO ASU TO USE THIS APPLICATION TO RUN AND EVALUATE THIS APPLICATION*/
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }

    public void addListenerOnButton() {
        /*Intent intent = new Intent(MainActivity.this, MorningActivity.class);
        startActivity(intent);*/
        final RadioButton morning = (RadioButton) findViewById(R.id.radioMorning);
        final RadioButton afternoon = (RadioButton) findViewById(R.id.radioAfternoon);
        final RadioButton Weekend = (RadioButton) findViewById(R.id.radioWeekend);
        //final RadioButton historical = (RadioButton) findViewById(R.id.radio4);
        //final RadioButton reli = (RadioButton) findViewById(R.id.radio5);

        final Button go = (Button) findViewById(R.id.btnDisplay);
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (morning.isChecked()) {
                    Intent intent = new Intent(MainActivity.this, MorningActivity.class);
                    startActivity(intent);

                    // Intent Intents = new Intent(India.this, MorningActivity.class); // <----- START "BEACHES" ACTIVITY
                    //startActivity(Intents);
                    //setContentView(R.layout.activity_sands);
                } else if (afternoon.isChecked()) {
                    Intent intent = new Intent(MainActivity.this, AfternoonActivity.class);
                    startActivity(intent);

                    //Intent Intentm = new Intent(getApplicationContext(), AfternoonActivity.class); // <----- START "HIll STATIONS" ACTIVITY
                    //startActivityForResult(Intentm, 0);
                } else if (Weekend.isChecked()) {
                    Intent intent = new Intent(MainActivity.this, WeekendActivity.class); // <----- START "WILDLIFE" ACTIVITY
                    startActivity(intent);
                } /*else if (historical.isChecked()) {
                    Intent Intenth = new Intent(getApplicationContext(), history.class); // <----- START "HISTORICAL MONUMENTS" ACTIVITY
                    startActivityForResult(Intenth, 0);
                } else if (reli.isChecked()) {
                    Intent Intentr = new Intent(getApplicationContext(), religious.class); // <----- START "RELIGIOUS LOCATIONS" ACTIVITY
                    startActivityForResult(Intentr, 0);
                }*/
            }
        });


    }
}
