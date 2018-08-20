package com.cricxchange.admin.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class ShowInfo extends AppCompatActivity {

    TextView txtrollno,txtname,txtage,txtcollagename,txtaddress,txttrade;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_info);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Intent i = getIntent();
        Bundle b = i.getBundleExtra("personBdl");

        txtrollno = (TextView) findViewById(R.id.txtrollno);
        txtname = (TextView) findViewById(R.id.txtname);
        txtage= (TextView) findViewById(R.id.txtage);
        txtcollagename= (TextView) findViewById(R.id.txtcollagename);
        txtaddress= (TextView) findViewById(R.id.txtaddress);
        txttrade= (TextView) findViewById(R.id.txttrade);

        txtrollno.setText(String.valueOf(b.getString("rollno")));
        txtname.setText(String.valueOf(b.getString("name")));
        txtage.setText(String.valueOf(b.getString("age")));
        txtcollagename.setText(String.valueOf(b.getString("collagename")));
        txtaddress.setText(String.valueOf(b.getString("address")));
        txttrade.setText(String.valueOf(b.getString("trade")));



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
