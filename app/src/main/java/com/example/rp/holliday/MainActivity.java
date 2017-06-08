package com.example.rp.holliday;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import custom_font.MyTextView;

public class MainActivity extends AppCompatActivity {
    TextView holliday;
    MyTextView createText;
    TextView loginText;
    TextView
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createText = (MyTextView)findViewById(R.id.create);


      //  Typeface custom_fonts = Typeface.createFromAsset(getAssets(), "fonts/ArgonPERSONAL-Regular.otf");
      //  holliday.setTypeface(custom_fonts);


    }

    public void onClick(View v){
        setContentView(R.layout.signup);
    }

    public void loginClick(View v){

    }
}
