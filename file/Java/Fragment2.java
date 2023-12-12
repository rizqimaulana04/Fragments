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

public class Fragment2 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment2, container, false);

        ImageView btnKnight = view.findViewById(R.id.btnKnight);
        ImageView btnGate = view.findViewById(R.id.btngate);
        ImageView btnHorizon = view.findViewById(R.id.btnhorizon);
        ImageView btnKonosuba = view.findViewById(R.id.btnkonosuba);
        ImageView btnSmartphone = view.findViewById(R.id.btnsmartphone);
        ImageView btnIruma = view.findViewById(R.id.btniruma);

        btnKnight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSinopsisActivity("Knight and Magic", R.drawable.knightsinopsis, R.string.Sinopsis_knight);
            }
        });

        btnGate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSinopsisActivity("Gate", R.drawable.gatesinopsis, R.string.Sinopsis_gate);
            }
        });

        btnHorizon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSinopsisActivity("Log Horizon", R.drawable.horizonsinopsis, R.string.Sinopsis_horizon);
            }
        });

        btnKonosuba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSinopsisActivity("Konosuba", R.drawable.konosubasinopsis, R.string.Sinopsis_konosuba);
            }
        });

        btnSmartphone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSinopsisActivity("Smartphone", R.drawable.smartphonesinopsis, R.string.Sinopsis_smartphone);
            }
        });

        btnIruma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSinopsisActivity("Iruma sama", R.drawable.irumasinopsis, R.string.Sinopsis_iruma);
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
