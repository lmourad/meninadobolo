package com.example.meninadobolo1;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class menu_Fragment extends Fragment {

    Button button_boloDoce;
    Button button_boloSalgado;
    Button button_diversos;
    Button button_encomendas;

    public menu_Fragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View view = inflater.inflate(R.layout.fragment_menu_, container, false);

        button_boloDoce = view.findViewById(R.id.button_boloDoce);
        button_boloSalgado = view.findViewById(R.id.button_boloSalgado);
        button_diversos = view.findViewById(R.id.button_diversos);
        button_encomendas = view.findViewById(R.id.button_encomendas);

        button_boloDoce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), abaBoloDoce.class);
                startActivity(intent);
            }
        });

        button_boloSalgado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), abaBoloSalgado.class);
                startActivity(intent);
            }
        });

        button_diversos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), abaDiversos.class);
                startActivity(intent);
            }
        });

        button_encomendas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), abaEncomendas.class);
                startActivity(intent);
            }
        });

        return view;
    }


}