package com.example.aprendaingles.Fragments;


import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.aprendaingles.R;


public class NumerosFragment extends Fragment implements View.OnClickListener{

    private ImageButton buttonUm, buttonDois, buttonTres, buttonQuatro, buttonCinco, buttonSeis;

    private MediaPlayer mediaPlayer;

    public NumerosFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_numeros, container, false);

        // Acessando os componentes ButtonImage
        buttonUm = view.findViewById(R.id.buttonUm);
        buttonDois = view.findViewById(R.id.buttonDois);
        buttonTres = view.findViewById(R.id.buttonTres);
        buttonQuatro = view.findViewById(R.id.buttonQuatro);
        buttonCinco = view.findViewById(R.id.buttonCinco);
        buttonSeis = view.findViewById(R.id.buttonSeis);

        // Criando os eventos de click no ButtonImage
        buttonUm.setOnClickListener(this);
        buttonDois.setOnClickListener(this);
        buttonTres.setOnClickListener(this);
        buttonQuatro.setOnClickListener(this);
        buttonCinco.setOnClickListener(this);
        buttonSeis.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        //Log.i("Elemento clicado", "item" + v.getId());

        switch (v.getId()){
            case R.id.buttonUm :
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.one);
                tocarSom();
                break;

            case R.id.buttonDois :
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.two);
                tocarSom();
                break;

            case R.id.buttonTres :
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.three);
                tocarSom();
                break;

            case R.id.buttonQuatro :
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.four);
                tocarSom();
                break;

            case R.id.buttonCinco :
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.five);
                tocarSom();
                break;

            case R.id.buttonSeis :
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.six);
                tocarSom();
                break;
        }
    }

    // Método para tocar o som
    public void tocarSom(){
        if(mediaPlayer != null){
            mediaPlayer.start();

            // Permite adicionar um evento quando a música finalizar
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {

                    mediaPlayer.release(); // para liberar os recursos utilizados ao ser finalizado o som.
                }
            });
        }
    }

    // Vamos utilizar o onDestroy que é para quando o nosso Fragment for destruido.
    @Override
    public void onDestroy() {
        super.onDestroy();

        if(mediaPlayer != null){
            mediaPlayer.release(); // para liberar o espaço de memória dos recursos utilizados para gerar o som.
            mediaPlayer = null; // para liberar os recursos de memória do próprio objeto mediaPlayer.
        }
    }
}
