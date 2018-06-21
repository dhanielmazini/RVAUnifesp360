package com.google.vr.sdk.samples.simplepanowidget;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ActionMenuView;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    Button btnUnifesp360, btnCreditos, btnSobre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnUnifesp360 = (Button) findViewById(R.id.btnUnifesp360);
        btnCreditos = (Button) findViewById(R.id.btnCreditos);
        btnSobre = (Button) findViewById(R.id.btnSobre);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case  R.id.btnUnifesp360: {
                System.out.println("Clicou Unifesp 360");
                Intent intent = new Intent(this, ListagemLocais.class);
                startActivity(intent);
                break;
            }

            case R.id.btnCreditos: {
                System.out.println("Clicou Creditos");
                Intent intent = new Intent(this, Creditos.class);
                startActivity(intent);
                break;
            }

            case R.id.btnSobre: {
                System.out.println("Clicou Sobre");
                Intent intent = new Intent(this, Sobre.class);
                startActivity(intent);
            }
        }
    }
}
