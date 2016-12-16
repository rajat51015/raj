package com.example.rajat.data;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.ListView;

public class Seasons extends AppCompatActivity {
ListView l1;public int h;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seasons);

        l1=(ListView)findViewById(R.id.l1);
String s[]=new String[]{"Season 1","Season 2","Season 3","Season 4"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(Seasons.this,android.R.layout.simple_expandable_list_item_1,s);
    l1.setAdapter(adapter);
l1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        h=i;
        Intent i1=new Intent(Seasons.this,Episodes.class);
        i1.putExtra("key",h);
        startActivity(i1);
    }
});}}