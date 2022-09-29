package com.example.fragmentsactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnMorado,btnAzul,btnVerde;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMorado = findViewById(R.id.btnMorado);
        btnAzul = findViewById(R.id.btnAzul);
        btnVerde = findViewById(R.id.btnVerde);

        btnMorado.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                replaceFragment(new fragmentMorado());
            }


        });

        btnAzul.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                replaceFragment(new fragmentAzul());
            }


        });

        btnVerde.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                replaceFragment(new fragmentVerde());
            }


        });
    }
    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frLayPrincipal,fragment);
        fragmentTransaction.commit();

    }
}