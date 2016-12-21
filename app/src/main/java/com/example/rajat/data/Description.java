package com.example.rajat.data;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.ByteArrayInputStream;
import java.sql.Blob;

public class Description extends AppCompatActivity {
    DatabaseHelper f;
    Bundle g;long p;
    TextView t1, t2, t3, t4;ImageView v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        f = new DatabaseHelper(this);
        t1 = (TextView) findViewById(R.id.t1);
        t2 = (TextView) findViewById(R.id.t2);
        t3 = (TextView) findViewById(R.id.t3);
        t4 = (TextView) findViewById(R.id.t4);
        v=(ImageView) findViewById(R.id.v);

        Intent q = getIntent();
        g = q.getExtras();
        String ep = g.getString("b");
        String se = g.getString("a");
        long a = Integer.parseInt(se);
        long b = Integer.parseInt(ep);
        if(a==0)
        {
            p=b;
        }
        if (a == 1) {
            b = b + 3;
        } else if (a == 2) {
            b = b + 6;
        } else if(a==3) {
            b = b + 9;
        }
        String s3 = String.valueOf(b+1);
        Cursor d = f.getData(s3);
        while (d.moveToNext()) {
            t1.setText(d.getString(0));
            t2.setText(d.getString(1));
            t3.setText(d.getString(2));
            t4.setText(d.getString(3));
 byte l[]=d.getBlob(4);
            Bitmap bp= BitmapFactory.decodeByteArray(l, 0, l.length);
v.setImageBitmap(bp);





        }
   /*     Contact e=f.getContact(1);
        t1.setText(e.getID());
        t2.setText(e.getName());
        t3.setText(e.getes());
        t4.setText(e.geted());
    }*/}
}