package com.example.aprendaingles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

/*
* 1º Vamos add as dependências no app.build para utilizar a interface de abas.
*
* implementation 'com.ogaclejapan.smarttablayout:library:2.0.0@aar'
* implementation 'com.ogaclejapan.smarttablayout:utils-v4:2.0.0@aar'
*
* 2º Trocar para LinearLayout e orientation vertical.
*
* 3º Copiar e Colar o código pronto da inteface de abas:
* https://github.com/ogaclejapan/SmartTabLayout/
*
* 4º Na tag smartTagLayout Substituir o id por 'smartTabLayout'.
* */