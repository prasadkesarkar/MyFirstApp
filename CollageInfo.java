package com.cricxchange.admin.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CollageInfo extends AppCompatActivity {
    EditText edtcollagename,edtaddress,edttrade;
    Button btnnextt;
    String collagename,address,trade;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collage_info);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

         i = getIntent();
        edtcollagename = (EditText) findViewById(R.id.edtcollagename);
        edtaddress = (EditText) findViewById(R.id.edtaddress);
        edttrade = (EditText) findViewById(R.id.edttrade);

        btnnextt = (Button) findViewById(R.id.btnnextt);

        btnnextt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                collagename = edtcollagename.getText().toString();
                address = edtaddress.getText().toString();
                trade = edttrade.getText().toString();

                Bundle b = new Bundle();
                b.putString("rollno",String.valueOf(i.getIntExtra("rollno",0)));
                b.putString("name",i.getStringExtra("name"));
                b.putString("age",String.valueOf(i.getIntExtra("age",0)));
                b.putString("collagename",collagename);
                b.putString("address",address);
                b.putString("trade",trade);
                Intent showInfo = new Intent(CollageInfo.this,ShowInfo.class);
                showInfo.putExtra("personBdl", b);
                startActivity(showInfo);
                finish();


            }
        });


        System.out.println(String.valueOf(i.getIntExtra("rollno",0)));
        System.out.println(String.valueOf(i.getStringExtra("name")));
        System.out.println(String.valueOf(i.getIntExtra("age",0)));

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
