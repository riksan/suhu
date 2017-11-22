package com.example.riksan.suhu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    Intent i;
    TextView n1,n2,n3;
    ImageView g1,g2,g3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);// untuk tombol back pojok atas
        setTitle("Convert");
        n1= (TextView) findViewById(R.id.n1);
        n2= (TextView) findViewById(R.id.n2);
        n3= (TextView) findViewById(R.id.n3);
        g1= (ImageView) findViewById(R.id.g1);
        g2= (ImageView) findViewById(R.id.g2);
        g3= (ImageView) findViewById(R.id.g3);

        i = getIntent();
        n1.setText(i.getStringExtra("A"));
        n2.setText(i.getStringExtra("B"));
        n3.setText(i.getStringExtra("C"));

        g1.setImageResource(i.getIntExtra("g1",R.drawable.termometer));
        g2.setImageResource(i.getIntExtra("g2",R.drawable.termometer));
        g3.setImageResource(i.getIntExtra("g3",R.drawable.termometer));
    }

    public boolean onOptionsItemSelected(MenuItem item) {// Sebuah Fungsi Untuk Membuat tombol back
        if(item.getItemId()==android.R.id.home){
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}
