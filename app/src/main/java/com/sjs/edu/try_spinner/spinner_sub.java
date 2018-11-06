package com.sjs.edu.try_spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class spinner_sub extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_sub);

        Bundle bundle = getIntent().getExtras();
        ((TextView)findViewById(R.id.textView)).setText(bundle.getString("singleName","NO Data"));
    }
}
