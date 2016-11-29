package com.uet.thang.day28november;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Thang on 11/28/2016.
 */

public class Main_Activity extends Activity{

    Button btn2,btn3,btnClick;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btnClick = (Button) findViewById(R.id.btnSettext);
        tv1 = (TextView) findViewById(R.id.tv1);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main_Activity.this,Second_Activity.class);
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main_Activity.this,Third_Activity.class);
                startActivity(intent);
            }
        });

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText("Trinh Thang");
                Intent i = new Intent(Main_Activity.this,Second_Activity.class);
                i.putExtra("username",tv1.getText());
                i.putExtra("password","22121996");
                startActivity(i);

            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.mnAdd:
                Toast.makeText(getApplicationContext(),"ADD Clicked!",Toast.LENGTH_SHORT).show();break;
            case R.id.mnDelete:
                Toast.makeText(getApplicationContext(),"Delete Clicked!",Toast.LENGTH_SHORT).show();break;
            case R.id.mnExit:
                Toast.makeText(getApplicationContext(),"Exit Clicked!",Toast.LENGTH_SHORT).show();break;
            default: Toast.makeText(getApplicationContext(),"None Clicked!",Toast.LENGTH_SHORT).show();break;
        }
        return super.onOptionsItemSelected(item);
    }
}
