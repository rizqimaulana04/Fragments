package com.hello;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Fragment2_Sinopsis extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment2_sinopsis);

        // Mendapatkan data dari Intent
        String title = getIntent().getStringExtra("title");
        int imageResId = getIntent().getIntExtra("imageResId", 0);
        int textResId = getIntent().getIntExtra("textResId", 0);

        // Mendapatkan referensi ke ImageView dan TextView untuk Knight and Magic
        ImageView sinopsisImageViewKnight = findViewById(R.id.KnightSinopsis);
        TextView sinopsisTextViewKnight = findViewById(R.id.sinopsisKnight);
        // Mendapatkan referensi ke ImageView dan TextView untuk Gate
        ImageView sinopsisImageViewGate = findViewById(R.id.GateSinopsis);
        TextView sinopsisTextViewGate = findViewById(R.id.sinopsisGate);
        // Mendapatkan referensi ke ImageView dan TextView untuk Log Horizon
        ImageView sinopsisImageViewHorizon = findViewById(R.id.HorizonSinopsis);
        TextView sinopsisTextViewHorizon = findViewById(R.id.sinopsisHorizon);
        // Mendapatkan referensi ke ImageView dan TextView untuk Konosuba
        ImageView sinopsisImageViewKonosuba = findViewById(R.id.KonosubaSinopsis);
        TextView sinopsisTextViewKonosuba = findViewById(R.id.sinopsisKonosuba);
        // Mendapatkan referensi ke ImageView dan TextView untuk Smartphone
        ImageView sinopsisImageViewSmartphone = findViewById(R.id.SmartphoneSinopsis);
        TextView sinopsisTextViewSmartphone = findViewById(R.id.sinopsisSmartphone);
        // Mendapatkan referensi ke ImageView dan TextView untuk Iruma sama
        ImageView sinopsisImageViewIruma = findViewById(R.id.Irumasinopsis);
        TextView sinopsisTextViewIruma = findViewById(R.id.sinopsisIruma);



        // Menampilkan data sinopsis untuk Knight and Magic
        sinopsisImageViewKnight.setImageResource(imageResId);
        sinopsisTextViewKnight.setText(textResId);

        // Menampilkan data sinopsis untuk Gate
        sinopsisImageViewGate.setImageResource(imageResId);
        sinopsisTextViewGate.setText(textResId);

        // Menampilkan data sinopsis untuk Log Horizon
        sinopsisImageViewHorizon.setImageResource(imageResId);
        sinopsisTextViewHorizon.setText(textResId);

        // Menampilkan data sinopsis untuk Konosuba
        sinopsisImageViewKonosuba.setImageResource(imageResId);
        sinopsisTextViewKonosuba.setText(textResId);

        // Menampilkan data sinopsis untuk Smartphone
        sinopsisImageViewSmartphone.setImageResource(imageResId);
        sinopsisTextViewSmartphone.setText(textResId);

        // Menampilkan data sinopsis untuk Iruma sama
        sinopsisImageViewIruma.setImageResource(imageResId);
        sinopsisTextViewIruma.setText(textResId);


    }
}
