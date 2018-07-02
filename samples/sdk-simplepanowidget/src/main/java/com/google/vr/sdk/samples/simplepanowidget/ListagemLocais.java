package com.google.vr.sdk.samples.simplepanowidget;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListagemLocais extends Activity {
    List<String> opcoes;
    ArrayAdapter<String> adaptador;
    ListView list;
    private String opcaoEscolhida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listagem_locais);

        list = (ListView) findViewById(R.id.list);

        opcoes = new ArrayList<String>();

        opcoes.add("Portaria");
        opcoes.add("Estacionamento");
        opcoes.add("Hall de Entrada");
        opcoes.add("Biblioteca");
        opcoes.add("Cantina");
        opcoes.add("Secretaria");
        opcoes.add("Restaurante");
        opcoes.add("Sala de Aula");
        opcoes.add("Laboratório de Quimica");
        opcoes.add("Laboratório de Física");
        opcoes.add("Laboratório de Informatica");
        opcoes.add("Auditório");

        adaptador = new ArrayAdapter<String>(ListagemLocais.this, android.R.layout.simple_list_item_1, opcoes);
        list.setAdapter(adaptador);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                opcaoEscolhida = opcoes.get(i);
                trocaActivity();
            }
        });
    }

    public void trocaActivity(){
        Intent intent = new Intent(this, Galeria.class);
        intent.putExtra("option", opcaoEscolhida);
        startActivity(intent);
    }
}
