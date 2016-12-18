package com.example.rajat.data;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Description extends AppCompatActivity {
    DatabaseHelper f;
    Bundle g;
    TextView t1, t2, t3, t4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        f = new DatabaseHelper(this);
        t1 = (TextView) findViewById(R.id.t1);
        t2 = (TextView) findViewById(R.id.t2);
        t3 = (TextView) findViewById(R.id.t3);
        t4 = (TextView) findViewById(R.id.t4);


        Intent q = getIntent();
        g = q.getExtras();
        String ep = g.getString("b");
        String se = g.getString("a");
        int a = Integer.parseInt(se);
        int b = Integer.parseInt(ep);
        if (a == 2) {
            b = b + 3;
        } else if (a == 3) {
            b = b + 6;
        } else {
            b = b + 9;
        }
        String s3 = String.valueOf(1);
        Cursor d = f.getData(s3);
        while (d.moveToNext()) {
            t1.setText(d.getString(0));
            t2.setText(d.getString(1));
            t3.setText(d.getString(2));
            t4.setText(d.getString(3));


        }
   /*     Contact e=f.getContact(1);
        t1.setText(e.getID());
        t2.setText(e.getName());
        t3.setText(e.getes());
        t4.setText(e.geted());


    }*/}
}