package com.hello;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment1 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, container, false);

        ImageView btnHunter = view.findViewById(R.id.btnHunter);
        ImageView btnBleach = view.findViewById(R.id.btnbleach);
        ImageView btnNanatsu = view.findViewById(R.id.btnnanatsu);
        ImageView btnOnepiece = view.findViewById(R.id.btnonepiece);
        ImageView btnDigimon = view.findViewById(R.id.btndigimon);
        ImageView btnSamurai = view.findViewById(R.id.btnsamurai);
        ImageView btnNaruto = view.findViewById(R.id.btnnaruto);
        ImageView btnDororo = view.findViewById(R.id.btndororo);
        ImageView btnSpyx = view.findViewById(R.id.btnspyx);
        ImageView btnRezero = view.findViewById(R.id.btnrezero);
        ImageView btnSao = view.findViewById(R.id.btnsword);
        ImageView btnTate = view.findViewById(R.id.btntate);
        ImageView btnSlime = view.findViewById(R.id.btnslime);
        ImageView btnOverlord = view.findViewById(R.id.btnoverlord);
        ImageView btnNogame = view.findViewById(R.id.btnnogame);
        ImageView btnTsukimichi = view.findViewById(R.id.btntsikimichi);
        ImageView btnIsekaicheat = view.findViewById(R.id.btnisekaicheat);
        ImageView btnDeadmarch = view.findViewById(R.id.btndeadmarch);

        btnHunter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSinopsisActivity("Hunter X Hunter", R.drawable.huntersinopsis, R.string.Sinopsis_hunterx);
            }
        });

        btnBleach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSinopsisActivity("Bleach", R.drawable.bleachsinopsis, R.string.Sinopsis_bleach);
            }
        });

        btnNanatsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSinopsisActivity("Nanatsu No Taizai", R.drawable.nanatsusinopsis, R.string.Sinopsis_nanatsu);
            }
        });

        btnOnepiece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSinopsisActivity("One Piece", R.drawable.onepiecesinopsis, R.string.Sinopsis_onepiece);
            }
        });

        btnDigimon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSinopsisActivity("Digimon", R.drawable.digimonsinopsis, R.string.Sinopsis_digimon);
            }
        });

        btnSamurai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSinopsisActivity("Samurai X", R.drawable.samuraisinopsis, R.string.Sinopsis_samurai);
            }
        });

        btnNaruto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSinopsisActivity("Naruto", R.drawable.narutosinopsis, R.string.Sinopsis_naruto);
            }
        });

        btnDororo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSinopsisActivity("Dororo", R.drawable.dororosinopsis, R.string.Sinopsis_dororo);
            }
        });

        btnSpyx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSinopsisActivity("SPY X Family", R.drawable.spyxsinopsis, R.string.Sinopsis_spyxfamily);
            }
        });

        btnRezero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSinopsisActivity("Re Zero", R.drawable.rezerosinopsis, R.string.Sinopsis_rezero);
            }
        });

        btnSao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSinopsisActivity("Sword Art Online", R.drawable.saosinopsis, R.string.Sinopsis_sao);
            }
        });

        btnTate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSinopsisActivity("Tate No Yuusha", R.drawable.tatesinopsis, R.string.Sinopsis_tate);
            }
        });

        btnSlime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSinopsisActivity("Slime", R.drawable.slimesinopsis, R.string.Sinopsis_slime);
            }
        });

        btnOverlord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSinopsisActivity("Overlord", R.drawable.overlordsinopsis, R.string.Sinopsis_overlord);
            }
        });

        btnNogame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSinopsisActivity("No Game No Life", R.drawable.nogamesinopsis, R.string.Sinopsis_nogame);
            }
        });

        btnTsukimichi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSinopsisActivity("Tsukimichi", R.drawable.tsukimichisinopsis, R.string.Sinopsis_tsukimichi);
            }
        });

        btnIsekaicheat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSinopsisActivity("Isekai Cheat Magician", R.drawable.isekaicheatsinopsis, R.string.Sinopsis_isekaicheat);
            }
        });

        btnDeadmarch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSinopsisActivity("Death March", R.drawable.deadmarchsinopsis, R.string.Sinopsis_deadmarch);
            }
        });

        return view;
    }

    private void startSinopsisActivity(String title, int imageResId, int textResId) {
        Intent intent = new Intent(getActivity(), Fragment1_Sinopsis.class);
        intent.putExtra("title", title);
        intent.putExtra("imageResId", imageResId);
        intent.putExtra("textResId", textResId);
        startActivity(intent);
    }


}
