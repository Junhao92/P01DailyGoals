package com.example.a14049472.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       //get the button and set the OnClickListener

        Button btnOk=(Button)findViewById(R.id.button);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // get the text in the textView
                TextView tv1=(TextView)findViewById(R.id.textView1);
                // get the radioGroup 1
                RadioGroup rg1=(RadioGroup)findViewById(R.id.RadioGroup1);
                // get the id selected radio button in the radiogroup
                int selectedButtonId1=rg1.getCheckedRadioButtonId();
                // get the radio button object id we gooten above
                RadioButton rb1=(RadioButton) findViewById(selectedButtonId1);



                // get the text in the textView2
                TextView tv3=(TextView)findViewById(R.id.textView3);
                // get radio group2
                RadioGroup rg2=(RadioGroup)findViewById(R.id.RadioGroup2);
                // get the id selected radio button
                int selectedButtonId2=rg2.getCheckedRadioButtonId();
                // get the radio button object id we got above
                RadioButton rb2=(RadioButton)findViewById(selectedButtonId2);


                // get the text in textview3

                TextView tv5=(TextView)findViewById(R.id.textView5);
                // get radio group 3
                RadioGroup rg3=(RadioGroup)findViewById(R.id.RadioGroup3);
                // get id selected radio button
                int selectedButtonId3=rg3.getCheckedRadioButtonId();
                // get the button object id we got above
                RadioButton rb3=(RadioButton)findViewById(selectedButtonId3);

                // get the text in textview
                TextView tv7=(TextView)findViewById(R.id.textView7);
                // get the editText
                EditText et1=(EditText)findViewById(R.id.editText1);

                String [] info={tv1.getText().toString(),tv3.getText().toString(),tv5.getText().toString(),tv7.getText().toString(),et1.getText().toString()};
                String[] info2={rb1.getText().toString(),rb2.getText().toString(),rb3.getText().toString()};


                Intent intent=new Intent(MainActivity.this,Summary.class);

                intent.putExtra("info",info);
                intent.putExtra("info2",info2);
                startActivity(intent);

            }
        });

    }
}
