package com.example.rajat.data;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.List;


public class MainActivity extends Activity {
public static String p;

    Button b1;
     DatabaseHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        p = getApplicationContext().getPackageName();
        db=new DatabaseHelper(this);
        // Inserting Contacts
        Log.d("Insert: ", "Inserting ..");


        db.addContact(new Contact(1, "Ravi", "a", "9100000000"));
        db.addContact(new Contact(2, "Srinivas", "b", "9199999999"));
        db.addContact(new Contact(3, "Tommy", "c", "9522222222"));
        db.addContact(new Contact(4, "Karthik", "d", "9533333333"));


       b1=(Button) findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent i=new Intent(MainActivity.this,Seasons.class);
                startActivity(i);

            }
        });



    }
}
