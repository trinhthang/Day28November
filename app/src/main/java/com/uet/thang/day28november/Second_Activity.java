package com.uet.thang.day28november;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Thang on 11/28/2016.
 */

public class Second_Activity extends Activity {


    TextView tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent mIntent = getIntent();
        String str = mIntent.getStringExtra("username");
        tv2 = (TextView) findViewById(R.id.tv2);
        tv2.setText(str);
    }
}
