package com.example.fragmentsactivity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class fragmentMorado extends Fragment {
    View viewMorado;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        viewMorado = inflater.inflate(R.layout.fragment_morado, container, false);
        return viewMorado;


    }
}