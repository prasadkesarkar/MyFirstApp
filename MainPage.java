package com.cricxchange.admin.myfirstapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainPage extends AppCompatActivity {

     TextView txtres;
     EditText edtfirstno,edtnumtwo;
     Button add;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

         txtres = (TextView) findViewById(R.id.txtres);
         edtfirstno = (EditText) findViewById(R.id.edtfirstno);
         edtnumtwo = (EditText) findViewById(R.id.edtnumtwo);
         add = (Button) findViewById(R.id.add);

         add.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 int a1 = Integer.parseInt(edtfirstno.getText().toString());
                 int a2 = Integer.parseInt(edtnumtwo.getText().toString());

                 int a3 = a1 +a2;
                 Toast.makeText(getApplicationContext(),"res"+a3,Toast.LENGTH_LONG).show();

//                 txtres.setText();
             }
         });

        System.out.println("called onCreate");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

        System.out.println("called onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("called onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("called onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("called onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("called onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("called onDestroy");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_page, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
