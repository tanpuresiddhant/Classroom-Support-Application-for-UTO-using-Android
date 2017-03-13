package com.example.utopoly;
/* COPYRIGHTS GIVEN TO ASU TO USE THIS APPLICATION TO RUN AND EVALUATE THIS APPLICATION*/
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MorningActivity extends AppCompatActivity {
    final String activity = "morning";
    EditText txtDescription;
    RadioGroup radioGroup;
    RadioButton radioButton;
    int selectedId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morning);
        addListenerOnButton();
    }
    public void addListenerOnButton(){
        /*Intent intent = new Intent(MainActivity.this, MorningActivity.class);
        startActivity(intent);*/
        final Button go = (Button) findViewById(R.id.submit);
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<List<Object>> data = new ArrayList<List<Object>>();
                List<Object> data1 = new ArrayList<Object>();

                txtDescription = (EditText)findViewById(R.id.username);
                data1.add(txtDescription.getText().toString());

                txtDescription = (EditText)findViewById(R.id.classroomnum);
                data1.add(txtDescription.getText().toString());

                radioGroup = (RadioGroup) findViewById(R.id.radioGroup1);
                // get selected radio button from radioGroup
                selectedId = radioGroup.getCheckedRadioButtonId();
                // find the radiobutton by returned id
                radioButton = (RadioButton) findViewById(selectedId);
                data1.add(radioButton.getText().toString());

                radioGroup = (RadioGroup) findViewById(R.id.radioGroup2);
                // get selected radio button from radioGroup
                selectedId = radioGroup.getCheckedRadioButtonId();
                // find the radiobutton by returned id
                radioButton = (RadioButton) findViewById(selectedId);
                data1.add(radioButton.getText().toString());

                radioGroup = (RadioGroup) findViewById(R.id.radioGroup3);
                // get selected radio button from radioGroup
                selectedId = radioGroup.getCheckedRadioButtonId();
                // find the radiobutton by returned id
                radioButton = (RadioButton) findViewById(selectedId);
                data1.add(radioButton.getText().toString());

                radioGroup = (RadioGroup) findViewById(R.id.radioGroup4);
                // get selected radio button from radioGroup
                selectedId = radioGroup.getCheckedRadioButtonId();
                // find the radiobutton by returned id
                radioButton = (RadioButton) findViewById(selectedId);
                data1.add(radioButton.getText().toString());

                radioGroup = (RadioGroup) findViewById(R.id.radioGroup5);
                // get selected radio button from radioGroup
                selectedId = radioGroup.getCheckedRadioButtonId();
                // find the radiobutton by returned id
                radioButton = (RadioButton) findViewById(selectedId);
                data1.add(radioButton.getText().toString());

                radioGroup = (RadioGroup) findViewById(R.id.radioGroup6);
                // get selected radio button from radioGroup
                selectedId = radioGroup.getCheckedRadioButtonId();
                // find the radiobutton by returned id
                radioButton = (RadioButton) findViewById(selectedId);
                data1.add(radioButton.getText().toString());

                radioGroup = (RadioGroup) findViewById(R.id.radioGroup7);
                // get selected radio button from radioGroup
                selectedId = radioGroup.getCheckedRadioButtonId();
                // find the radiobutton by returned id
                radioButton = (RadioButton) findViewById(selectedId);
                data1.add(radioButton.getText().toString());

                radioGroup = (RadioGroup) findViewById(R.id.radioGroup8);
                // get selected radio button from radioGroup
                selectedId = radioGroup.getCheckedRadioButtonId();
                // find the radiobutton by returned id
                radioButton = (RadioButton) findViewById(selectedId);
                data1.add(radioButton.getText().toString());

                radioGroup = (RadioGroup) findViewById(R.id.radioGroup9);
                // get selected radio button from radioGroup
                selectedId = radioGroup.getCheckedRadioButtonId();
                // find the radiobutton by returned id
                radioButton = (RadioButton) findViewById(selectedId);
                data1.add(radioButton.getText().toString());

                radioGroup = (RadioGroup) findViewById(R.id.radioGroup10);
                // get selected radio button from radioGroup
                selectedId = radioGroup.getCheckedRadioButtonId();
                // find the radiobutton by returned id
                radioButton = (RadioButton) findViewById(selectedId);
                data1.add(radioButton.getText().toString());

                Calendar c = Calendar.getInstance();
                SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
                String formattedDate = df.format(c.getTime());
                data1.add(formattedDate);

                data.add (data1);

                Intent intent = new Intent(MorningActivity.this, PassDataToExl.class);
                intent.putExtra("message", (Serializable) data);
                intent.putExtra("activity", activity);
                startActivity(intent);
            }
        });


    }
}
