package br.com.maymer.mymer;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class Mainmer extends AppCompatActivity {

    private Button btAtributo;
    private Button btRelacionamento;
    private Button btAgregaçao;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmer);


        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Banco de Dados");


        btAtributo = (Button) findViewById(R.id.btAtributo);
        btAtributo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent in = new Intent(Mainmer.this, ListaTrabalho.class);
                in.putExtra("assunto", "Atributo");
                startActivity(in);
            }
        });

        btRelacionamento = (Button) findViewById(R.id.btRelacao);
        btRelacionamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Mainmer.this, ListaTrabalho.class);
                in.putExtra("assunto", "Relacionamento");
                startActivity(in);
            }
        });

        btAgregaçao = (Button) findViewById(R.id.btAgregacao);
        btAgregaçao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Mainmer.this, ListaTrabalho.class);
                in.putExtra("assunto", "Grau");
                startActivity(in);
            }
        });

    }
}