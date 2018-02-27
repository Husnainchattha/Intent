package com.example.hussnain.intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

import java.net.URL;

public class MainActivity extends AppCompatActivity {
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
 public void onClick(View view){
     EditText editText=(EditText)findViewById(R.id.edittext1);
     String strl=editText.getText().toString();
     Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(strl));
     startActivity(intent);
 }
}
