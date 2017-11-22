package com.example.riksan.suhu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    Intent i;
    ListView lsuhu;
    String[] menu= {"CELCIUS","REAMUR","FAHRENHEIT","KELVIN"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lsuhu = (ListView) findViewById(R.id.lsuhu);
        customlist adapter = new customlist(this,menu);
        lsuhu.setAdapter(adapter);
        lsuhu.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        switch (position){
            case 0:
                i = new Intent(this,Main2Activity.class);
                i.putExtra("judul",menu[0]);
                i.putExtra("gambar",R.drawable.celcius1);
                startActivity(i);
                break;
            case 1:
                i = new Intent(this,reamur.class);
                i.putExtra("judul",menu[1]);
                i.putExtra("gambar",R.drawable.reamur);
                startActivity(i);
                break;
            case 2:
                i = new Intent(this,fahrenheit.class);
                i.putExtra("judul",menu[2]);
                i.putExtra("gambar",R.drawable.fahrenheit);
                startActivity(i);
                break;
            case 3:
                i = new Intent(this,kelvin.class);
                i.putExtra("judul",menu[3]);
                i.putExtra("gambar",R.drawable.kelvin);
                startActivity(i);
                break;
            default: break;
        }
    }
}
