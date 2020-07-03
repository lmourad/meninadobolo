package com.example.meninadobolo1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button_register;
    Button button_login;
    String nome, senha;
    String mainNome = "lmd", mainSenha = "meu1app", email = "luciano.mouralmd@gmail.com";
    EditText input_name, input_password;
    TextView text_forgotLogin, text_forgotPassword, text_versionApp;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_register = findViewById(R.id.button_register);
        button_login = findViewById(R.id.button_login);
        input_name = findViewById(R.id.input_name);
        input_password = findViewById(R.id.input_password);
        text_forgotLogin = findViewById(R.id.text_forgotLogin);
        text_forgotPassword = findViewById(R.id.text_forgotPassword);
        text_versionApp = findViewById(R.id.text_versionApp);


        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nome = input_name.getText().toString();
                senha = input_password.getText().toString();

                if((mainNome).equals(nome) && (mainSenha).equals(senha)){
                    Intent intent = new Intent(MainActivity.this, menu.class);
                    startActivity(intent);
                    toastLogIn();
                    finish();
                }else{
                    toastLoginError();
                }
            }
        });

        button_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, screen_login.class);
                startActivity(intent);
            }
        });

        text_forgotLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toastLoginHint();
            }
        });

        text_forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toastPasswordHint();
            }
        });

        text_versionApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_versionApp.setText(email);
            }
        });
    }

    public void toastLogIn(){
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.my_toast_layout, (ViewGroup) findViewById(R.id.custom_toast));

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.BOTTOM, 0, 120);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);

        toast.show();
    }

    public void toastLoginError(){
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_login_error, (ViewGroup) findViewById(R.id.toast_login_error));

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.BOTTOM, 0, 150);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);

        toast.show();
    }

    public void toastLoginHint(){
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_login_hint, (ViewGroup) findViewById(R.id.toast_login_hint));

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.BOTTOM, 0, 150);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);

        toast.show();
    }

    public void toastPasswordHint(){
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_password_hint, (ViewGroup) findViewById(R.id.toast_password_hint));

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.BOTTOM, 0, 150);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);

        toast.show();
    }

}