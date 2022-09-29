package com.example.fragmentsactivity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class fragmentVerde extends Fragment {
    View viewVerde;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        viewVerde = inflater.inflate(R.layout.fragment_verde, container, false);
        return viewVerde;
    }
}