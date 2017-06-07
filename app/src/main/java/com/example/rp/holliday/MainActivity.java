package com.example.rp.holliday;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import custom_font.MyTextView;

public class MainActivity extends AppCompatActivity {
    TextView holliday;
    MyTextView create;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

      //  create = (MyTextView)findViewById(R.id.create);
      //  holliday = (TextView)findViewById(R.id.holliday);

      //  Typeface custom_fonts = Typeface.createFromAsset(getAssets(), "fonts/ArgonPERSONAL-Regular.otf");
      //  holliday.setTypeface(custom_fonts);

    }
}
