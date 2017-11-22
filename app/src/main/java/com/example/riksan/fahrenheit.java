package com.example.riksan.suhu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class fahrenheit extends AppCompatActivity {

    Intent i ;
    EditText nilai;
    ImageView logo2;
    Button btnConvert;

    String a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fahrenheit);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);// untuk tombol back pojok atas

        //Deklarasi Variable Untuk menghubungkan layout dan java
        nilai = (EditText) findViewById(R.id.nilaif);
        logo2 = (ImageView) findViewById(R.id.logof);
        btnConvert = (Button) findViewById(R.id.btnConvert3);

        i = getIntent();
        //set Title
        a = i.getStringExtra("judul");
        setTitle(a);
        //set Gambar
        int b = i.getIntExtra("gambar", R.drawable.termometer);
        logo2.setImageResource(b);

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    i = new Intent(fahrenheit.this, Main3Activity.class);
                    double n = Double.parseDouble(nilai.getText().toString());
                    double C= (n-32)*5/9;
                    double r = (n-32)*4/9;
                    double K = C + 273;
                    i.putExtra("A", "" + C);
                    i.putExtra("B", "" + r);
                    i.putExtra("C", "" + K);
                    i.putExtra("g1", R.drawable.celcius1);
                    i.putExtra("g2", R.drawable.reamur);
                    i.putExtra("g3", R.drawable.kelvin);
                    startActivity(i);
                } catch (Exception ex) {
                }
            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {// Sebuah Fungsi Untuk Membuat tombol back
        if(item.getItemId()==android.R.id.home){
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}
