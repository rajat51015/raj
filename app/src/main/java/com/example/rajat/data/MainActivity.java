package com.example.rajat.data;

import android.content.Intent;
import android.database.SQLException;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;


public class MainActivity extends AppCompatActivity {
public static String p;

    Button b1;
     DatabaseHelper f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        p = getApplicationContext().getPackageName();
        f=new DatabaseHelper(this);
       /* try {

            f.createDataBase();

        } catch (IOException ioe) {

            throw new Error("Unable to create database");

        }

        try {

            f.openDataBase();

        }catch(SQLException sqle){

            throw sqle;

        }

       b1=(Button) findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent i=new Intent(MainActivity.this,Seasons.class);
                startActivity(i);

            }
        });*/
    }
}
