package com.example.meninadobolo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class abaDiversos extends AppCompatActivity {

    private Button button_voltar_abaDiversos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aba_diversos);

        button_voltar_abaDiversos = findViewById(R.id.button_voltar_abaDiversos);
        button_voltar_abaDiversos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back();
            }
        });

    }

    public void pack() throws PackageManager.NameNotFoundException {
        createPackageContext("abaDiversos", Context.CONTEXT_INCLUDE_CODE);
    }

    public void back(){
        Intent intent = new Intent(this, menu.class);
        startActivity(intent);
        finish();
    }
}