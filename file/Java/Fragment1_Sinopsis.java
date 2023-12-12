package com.hello;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Fragment1_Sinopsis extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment1_sinopsis1);

        // Mendapatkan data dari Intent
        String title = getIntent().getStringExtra("title");
        int imageResId = getIntent().getIntExtra("imageResId", 0);
        int textResId = getIntent().getIntExtra("textResId", 0);

        // Mendapatkan referensi ke ImageView dan TextView untuk Hunter X Hunter
        ImageView sinopsisImageViewHunter = findViewById(R.id.HunterSinopsis);
        TextView sinopsisTextViewHunter = findViewById(R.id.sinopsisHunter);
        // Mendapatkan referensi ke ImageView dan TextView untuk Bleach
        ImageView sinopsisImageViewBleach = findViewById(R.id.BleachSinopsis);
        TextView sinopsisTextViewBleach = findViewById(R.id.sinopsisBleach);
        // Mendapatkan referensi ke ImageView dan TextView untuk Nanatsu No Taizai
        ImageView sinopsisImageViewNanatsu = findViewById(R.id.NanatsuSinopsis);
        TextView sinopsisTextViewNanatsu = findViewById(R.id.sinopsisNanatsu);
        // Mendapatkan referensi ke ImageView dan TextView untuk One Piece
        ImageView sinopsisImageViewOnepiece = findViewById(R.id.OnepieceSinopsis);
        TextView sinopsisTextViewOnepiece = findViewById(R.id.sinopsisOnepiece);
        // Mendapatkan referensi ke ImageView dan TextView untuk Digimon
        ImageView sinopsisImageViewDigimon = findViewById(R.id.DigimonSinopsis);
        TextView sinopsisTextViewDigimon = findViewById(R.id.sinopsisDigimon);
        // Mendapatkan referensi ke ImageView dan TextView untuk Samurai X
        ImageView sinopsisImageViewSamurai = findViewById(R.id.Samuraisinopsis);
        TextView sinopsisTextViewSamurai = findViewById(R.id.sinopsisSamurai);
        // Mendapatkan referensi ke ImageView dan TextView untuk Naruto
        ImageView sinopsisImageViewNaruto = findViewById(R.id.NarutoSinopsis);
        TextView sinopsisTextViewNaruto = findViewById(R.id.sinopsisNaruto);
        // Mendapatkan referensi ke ImageView dan TextView untuk Dororo
        ImageView sinopsisImageViewDororo = findViewById(R.id.DororoSinopsis);
        TextView sinopsisTextViewDororo = findViewById(R.id.sinopsisDororo);
        // Mendapatkan referensi ke ImageView dan TextView untuk SPY X Family
        ImageView sinopsisImageViewSpyx = findViewById(R.id.Spyxsinopsis);
        TextView sinopsisTextViewSpyx = findViewById(R.id.sinopsisSpyxfamily);
        // Mendapatkan referensi ke ImageView dan TextView untuk Re-zero
        ImageView sinopsisImageViewRezero = findViewById(R.id.Rezerosinopsis);
        TextView sinopsisTextViewRezero = findViewById(R.id.sinopsisRezero);
        // Mendapatkan referensi ke ImageView dan TextView untuk Sword Art Online
        ImageView sinopsisImageViewSao = findViewById(R.id.Saosinopsis);
        TextView sinopsisTextViewSao = findViewById(R.id.sinopsisSao);
        // Mendapatkan referensi ke ImageView dan TextView untuk Tate no Yuusha
        ImageView sinopsisImageViewTate = findViewById(R.id.Tatesinopsis);
        TextView sinopsisTextViewTate = findViewById(R.id.sinopsisTate);
        // Mendapatkan referensi ke ImageView dan TextView untuk Slime
        ImageView sinopsisImageViewSlime = findViewById(R.id.Slimesinopsis);
        TextView sinopsisTextViewSlime = findViewById(R.id.sinopsisSlime);
        // Mendapatkan referensi ke ImageView dan TextView untuk Overlord
        ImageView sinopsisImageViewOverlord = findViewById(R.id.Overlordsinopsis);
        TextView sinopsisTextViewOverlord = findViewById(R.id.sinopsisOverlord);
        // Mendapatkan referensi ke ImageView dan TextView untuk No Game No Life
        ImageView sinopsisImageViewNogame = findViewById(R.id.Nogamesinopsis);
        TextView sinopsisTextViewNogame = findViewById(R.id.sinopsisNogame);
        // Mendapatkan referensi ke ImageView dan TextView untuk Tsukimichi
        ImageView sinopsisImageViewTsukimichi = findViewById(R.id.Tsukimichisinopsis);
        TextView sinopsisTextViewTsukimichi = findViewById(R.id.sinopsisTsukimichi);
        // Mendapatkan referensi ke ImageView dan TextView untuk Isekai Cheat Magician
        ImageView sinopsisImageViewIsekaicheat = findViewById(R.id.Isekaicheatsinopsis);
        TextView sinopsisTextViewIsekaicheat = findViewById(R.id.sinopsisIsekaicheat);
        // Mendapatkan referensi ke ImageView dan TextView untuk Death March
        ImageView sinopsisImageViewDeadmarch = findViewById(R.id.Deadmarchsinopsis);
        TextView sinopsisTextViewDeadmarch = findViewById(R.id.sinopsisDeadmarch);


        // Menampilkan data sinopsis untuk Hunter X Hunter
        sinopsisImageViewHunter.setImageResource(imageResId);
        sinopsisTextViewHunter.setText(textResId);

        // Menampilkan data sinopsis untuk Bleach
        sinopsisImageViewBleach.setImageResource(imageResId);
        sinopsisTextViewBleach.setText(textResId);

        // Menampilkan data sinopsis untuk Nanatsu No Taizai
        sinopsisImageViewNanatsu.setImageResource(imageResId);
        sinopsisTextViewNanatsu.setText(textResId);

        // Menampilkan data sinopsis untuk Onepiece
        sinopsisImageViewOnepiece.setImageResource(imageResId);
        sinopsisTextViewOnepiece.setText(textResId);

        // Menampilkan data sinopsis untuk Digimon
        sinopsisImageViewDigimon.setImageResource(imageResId);
        sinopsisTextViewDigimon.setText(textResId);

        // Menampilkan data sinopsis untuk Samurai
        sinopsisImageViewSamurai.setImageResource(imageResId);
        sinopsisTextViewSamurai.setText(textResId);

        // Menampilkan data sinopsis untuk Naruto
        sinopsisImageViewNaruto.setImageResource(imageResId);
        sinopsisTextViewNaruto.setText(textResId);

        // Menampilkan data sinopsis untuk Dororo
        sinopsisImageViewDororo.setImageResource(imageResId);
        sinopsisTextViewDororo.setText(textResId);

        // Menampilkan data sinopsis untuk SPY X Family
        sinopsisImageViewSpyx.setImageResource(imageResId);
        sinopsisTextViewSpyx.setText(textResId);

        // Menampilkan data sinopsis untuk Re-zero
        sinopsisImageViewRezero.setImageResource(imageResId);
        sinopsisTextViewRezero.setText(textResId);

        // Menampilkan data sinopsis untuk Sword Art Online
        sinopsisImageViewSao.setImageResource(imageResId);
        sinopsisTextViewSao.setText(textResId);

        // Menampilkan data sinopsis untuk Tate No Yuusha
        sinopsisImageViewTate.setImageResource(imageResId);
        sinopsisTextViewTate.setText(textResId);

        // Menampilkan data sinopsis untuk Slime
        sinopsisImageViewSlime.setImageResource(imageResId);
        sinopsisTextViewSlime.setText(textResId);

        // Menampilkan data sinopsis untuk Overlord
        sinopsisImageViewOverlord.setImageResource(imageResId);
        sinopsisTextViewOverlord.setText(textResId);

        // Menampilkan data sinopsis untuk No Game No Life
        sinopsisImageViewNogame.setImageResource(imageResId);
        sinopsisTextViewNogame.setText(textResId);

        // Menampilkan data sinopsis untuk Tsukimichi
        sinopsisImageViewTsukimichi.setImageResource(imageResId);
        sinopsisTextViewTsukimichi.setText(textResId);

        // Menampilkan data sinopsis untuk Isekai Cheat Magician
        sinopsisImageViewIsekaicheat.setImageResource(imageResId);
        sinopsisTextViewIsekaicheat.setText(textResId);

        // Menampilkan data sinopsis untuk Death March
        sinopsisImageViewDeadmarch.setImageResource(imageResId);
        sinopsisTextViewDeadmarch.setText(textResId);
    }
}
