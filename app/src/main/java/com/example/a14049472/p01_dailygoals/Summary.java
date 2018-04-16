package com.example.a14049472.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Summary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        // get the intent so as to get the "things" inside the intent

        Intent intent=getIntent();
        // get the String array
        String[] info= intent.getStringArrayExtra("info");
       String[] info2=intent.getStringArrayExtra("info2");
        // get the textview object
        TextView tv1=(TextView)findViewById(R.id.tv1);
        // display
        tv1.setText(info[0]+": "+info2[0]+"\n"+info[1]+": "+info2[1]+"\n"+info[2]+": "+ info2[2]+"\n"+info[3]+": "+info[4]);

    }
}
