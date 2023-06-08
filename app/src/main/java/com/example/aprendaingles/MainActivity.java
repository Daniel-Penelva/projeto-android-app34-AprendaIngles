package com.example.aprendaingles;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.aprendaingles.Fragments.BichosFragment;
import com.example.aprendaingles.Fragments.NumerosFragment;
import com.example.aprendaingles.Fragments.VogaisFragment;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

public class MainActivity extends AppCompatActivity {

    private SmartTabLayout smartTabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Remove a sombra do ActionBar
        getSupportActionBar().setElevation(0);

        smartTabLayout = findViewById(R.id.smartTabLayout);
        viewPager = findViewById(R.id.viewPager);

        // Implementado o SmartTabLayout com o FragmentPagerItemAdapter
        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(),
                FragmentPagerItems.with(this)
                        .add("Bichos", BichosFragment.class)
                        .add("Números", NumerosFragment.class)
                        .add("Vogais", VogaisFragment.class)
                        .create());

        // Configurando o adapter na viewPager.
        viewPager.setAdapter(adapter);

        // Configurando a viewPager no smartTabLayout.
        smartTabLayout.setViewPager(viewPager);

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
*
* 5º Criando os atributos dos componentes e capturando o id dos componentes no MainActivity.java
*
* 6º Implementando o smartTabLayout utilizando o FragmentPagerItemAdapter.
*
* 7º Criando os packages do fragments para organização.
*
* 8º Criando o fragments Bichos, números e vogais.
*    Em cima do package Fragments (botão direito do mouse):
*    New > Fragment > Fragment Blank > add nome BichosFragment > desmarcar:
*    'include fragment factory methody' e 'include interface callbacks'.
*
* 9º Configurando o adapter na viewPager.
*
* 10º Configurando a viewPager no smartTabLayout.
*
* 11º Customizando os componentes do layout e as cores.
* */