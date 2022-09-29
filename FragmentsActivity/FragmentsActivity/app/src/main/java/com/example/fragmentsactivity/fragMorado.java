package com.example.fragmentsactivity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class fragMorado extends Fragment {
    View Morado;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        Morado = inflater.inflate(R.layout.fragment_frag_morado, container, false);
        return Morado;


    }
}