package com.example.hussnain.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView textview=(TextView)findViewById(R.id.textview);
        Bundle bb;
        bb=getIntent().getExtras();
        textview.setText(bb.getString("text"));

    }
}
