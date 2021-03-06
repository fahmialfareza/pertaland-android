package com.rahmanarifofficial.pertaland.view.fragment;


import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.cardview.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rahmanarifofficial.pertaland.R;
import com.rahmanarifofficial.pertaland.view.activity.AnalisisActivity;
import com.rahmanarifofficial.pertaland.view.activity.MapsMarkingActivity;
import com.rahmanarifofficial.pertaland.view.activity.PublikasiAsetActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class BerandaFragment extends Fragment implements View.OnClickListener {

    public BerandaFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_beranda, container, false);
        CardView cvInput = v.findViewById(R.id.cv_input_asset);
        CardView cvAnalisis = v.findViewById(R.id.cv_analisis_asset);
        CardView cvPublikasi = v.findViewById(R.id.cv_publikasi_asset);
        cvInput.setOnClickListener(this);
        cvAnalisis.setOnClickListener(this);
        cvPublikasi.setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cv_input_asset:
                startActivity(new Intent(getActivity(), MapsMarkingActivity.class));
                break;
            case R.id.cv_analisis_asset:
                startActivity(new Intent(getActivity(), AnalisisActivity.class));
                break;
            case R.id.cv_publikasi_asset:
                startActivity(new Intent(getActivity(), PublikasiAsetActivity.class));
                break;
        }
    }
}
