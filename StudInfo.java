package com.cricxchange.admin.myfirstapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class StudInfo extends AppCompatActivity {

    EditText edtrollno,edtname,edtage;
    RadioGroup radioGroup2;

    Button  btnnext,button2;
    int rollno,age,gender;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stud_info);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//
        edtrollno = (EditText) findViewById(R.id.edtrollno);
        edtname = (EditText) findViewById(R.id.edtname);
        edtage = (EditText) findViewById(R.id.edtage);
        radioGroup2 = (RadioGroup) findViewById(R.id.radioGroup2);
        btnnext = (Button) findViewById(R.id.btnnext);
        button2 = (Button) findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.javatpoint.com"));
                startActivity(intent);
            }
        });
        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollno = Integer.parseInt(edtrollno.getText().toString());
                name = edtname.getText().toString();
                age = Integer.parseInt(edtage.getText().toString());
                gender = radioGroup2.getCheckedRadioButtonId();



                        Intent collageintent = new Intent(StudInfo.this,CollageInfo.class);
                collageintent.putExtra("rollno",rollno);
                collageintent.putExtra("name",name);
                collageintent.putExtra("age",age);
                startActivity(collageintent);
                finish();

            }
        });

//
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

}
