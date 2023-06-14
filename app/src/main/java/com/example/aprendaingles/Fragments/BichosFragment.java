package com.example.aprendaingles.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.aprendaingles.R;

public class BichosFragment extends Fragment implements View.OnClickListener{

    private ImageButton buttonCao, buttonGato, buttonLeao, buttonMacaco, buttonOvelha, buttonVaca;


    public BichosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bichos, container, false);

        // Acessando os componentes ButtonImage
        buttonCao = view.findViewById(R.id.buttonCao);
        buttonGato = view.findViewById(R.id.buttonGato);
        buttonLeao = view.findViewById(R.id.buttonLeao);
        buttonMacaco = view.findViewById(R.id.buttonMacaco);
        buttonOvelha = view.findViewById(R.id.buttonOvelha);
        buttonVaca = view.findViewById(R.id.buttonVaca);

        // Criando os eventos de click no ButtonImage
        buttonCao.setOnClickListener(this);
        buttonGato.setOnClickListener(this);
        buttonLeao.setOnClickListener(this);
        buttonMacaco.setOnClickListener(this);
        buttonOvelha.setOnClickListener(this);
        buttonVaca.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        Log.i("Elemento clicado", "item" + v.getId());
    }
}


/* Anotação:
* Como são muitos eventos de click é preferível implementar a Classe OnClickListener, essa interface
* permite tratar todos os eventos de click em um mesmo local, em um único método. Por padrão é obrigatório
* add o método "onClick" que recebe como parâmetro um tipo View.
*
* Para isso vamos fazer um 'implements View.OnClickListener'.
*
* Vamos implementar o método onclick dentro do método setOnClickListener, onde vai ser implementado essa
* interface para a classe inteira e usar o evento de click diretamente.
* Nós vamos tratar no método de onClick, que no caso, agora é num método de onClick global da classe, antes
* sabiamos que no método onClick, ele recebia um parâmetro do tipo View e dentro dessa view ligavamos ao getId do
* componente para identificar qual era o componente que foi clicado, só que nesse caso estamos aplicando o onClick
* num único botão, com isso todos os componentes de interface que puderem ser clicados, nós iremos tratar agora no
* método de onClick, mas num onClick global da Classe, porque podemos pegar o id de cada um dos componentes e saber
* qual item foi clicado.
*
* Esse código: buttonCao.setOnClickListener(this);
* o "this" diz que o OnClickListener vai ser tratado dentro da própria classe.
* */