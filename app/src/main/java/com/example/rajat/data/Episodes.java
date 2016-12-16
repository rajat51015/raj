/*package com.example.rajat.data;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Episodes extends AppCompatActivity {
ListView l2;public int k;Bundle e;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_episodes);


        l2=(ListView)findViewById(R.id.l2);
        String s[]=new String[]{"Episode 1","Episode 2","Episode 3"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(Episodes.this,android.R.layout.simple_expandable_list_item_1,s);
        l2.setAdapter(adapter);
        l2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                k=i;
Intent in=getIntent();
                Intent i2=new Intent(Episodes.this,Description.class);
                e=in.getExtras();
                String t=e.getString("key");
                int j=Integer.parseInt(t);
                i2.putExtra("a",k);
                i2.putExtra("b",j);
                startActivity(i2);
            }
        });}}
*/