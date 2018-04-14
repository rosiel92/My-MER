package br.com.maymer.mymer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;

public class ListaTrabalho extends AppCompatActivity {

    private String titulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_trabalho);

        Intent in = getIntent();
        titulo = in.getStringExtra("assunto");
        setTitle(titulo);


        final ListView lista = (ListView) findViewById(R.id.listP);
        final ArrayAdapter adapter = new publicacaoAdapter(this, adicionarPubli());
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(ListaTrabalho.this, apresentacao.class);
                intent.putExtra("itemList", (Serializable) adapter.getItem(position));
                startActivity(intent);
            }
        });

        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
    }

    private ArrayList<publicacao> adicionarPubli() {
        ArrayList<publicacao> atributo = new ArrayList<publicacao>();
        ArrayList<publicacao> relacao = new ArrayList<publicacao>();
        ArrayList<publicacao> agregacao = new ArrayList<publicacao>();


        publicacao
        e = new publicacao("Seguradora", "Elaborar um diagrama E-R para uma seguradora de automóveis", R.drawable.um,
                "Entidades: Cliente, Apólice, Carro e Acidentes.\n" +
                        "Requisitos:\n" +
                        "a) Um cliente pode ter várias apólices (no mínimo uma);\n" +
                        "b) Cada apólice somente dá cobertura a um carro;\n" +
                        "c) Um carro pode ter zero ou n registros de acidentes a ele.\n" +
                        "Atributos:\n" +
                        "a) Cliente: Número, Nome e Endereço;\n" +
                        "b) Apólice: Número e Valor;\n" +
                        "c) Carro: Registro e Marca;\n" +
                        "d) Acidente: Data, Hora e Local;",
                "http://www.noginfo.com.br/arquivos/CC_MDados_07", "Atributo");
        atributo.add(e);
        e = new publicacao("Clinica", "Elaborar um diagrama E-R de um consultório clínico", R.drawable.dois,
                "Entidades: Médico, Paciente e Exame.\n" +
                        "Requisitos: O banco de dados deverá armazenar informações sobre os vários exames de um " +
                        "determinado paciente, com o resultado e o valor pago (pode-se dar desconto para determinados pacientes);\n" +
                        "Atributos:\n" +
                        "a) Médico: Número, Nome e Especialidade;\n" +
                        "b) Paciente: Número, Nome, Endereço;\n" +
                        "c) Tipo Exame, Aceita Convênio, Requisitos, Valor exame.",
                "http://www.noginfo.com.br/arquivos/CC_MDados_07", "Atribut");
        atributo.add(e);
        e = new publicacao("Industria", "Elaborar um diagrama para uma Indústria. ", R.drawable.treis,
                "Entidades: Peças, Depósitos, Fornecedor, Projeto, Funcionário e Departamento.\n" +
                        "Requisitos:\n" +
                        "a) Cada Funcionário pode estar alocado a somente um Departamento;\n" +
                        "b) Cada Funcionário pode pertencer a mais de um Projeto;\n" +
                        "c) Um projeto pode utilizar-se de vários Fornecedores e de várias Peças;\n" +
                        "d) Uma Peça pode ser fornecida por vários Fornecedores e atender a vários Projetos;\n" +
                        "e) Um Fornecedor pode atender a vários Projetos e fornecer várias Peças;\n" +
                        "f) Um Depósito pode conter várias Peças;\n" +
                        "g) Deseja-se ter um controle do material utilizado por cada Projeto, identificando inclusive " +
                        "o seu Fornecedor. Gravar as informações de data de Início e Horas Trabalhadas no Projeto.\n" +
                        "Atributos:\n" +
                        "a) Peças: Número, Peso e Cor;\n" +
                        "b) Depósito: Número e Endereço;\n" +
                        "c) Fornecedor: Número e Endereço;\n" +
                        "d) Projeto: Número e Orçamento;\n" +
                        "e) Funcionário: Número, Salário e Telefone;\n" +
                        "f) Departamento: Número e Setor. ",
                "http://www.noginfo.com.br/arquivos/CC_MDados_07", "Atributo");
        atributo.add(e);

        e = new publicacao("Matricula", " O João está matriculado na disciplina de Banco de Dados",
                R.drawable.matricula, "• “João”: Elemento do conjunto de valores do atributo Nome do aluno da entidade Aluno;\n" +
                "• “Banco de Dados”: Elemento do conjunto de valores do atributo Nome da disciplina da entidade Disciplina;\n" +
                "• “Matriculado”: Ligação existente entre um aluno e uma disciplina. ", "http://www.noginfo.com.br/arquivos/CC_MDados_07",
                "Relacionamento");
        relacao.add(e);
        e = new publicacao("Casamento", "O João é casado com a Maria", R.drawable.casamento,
                "• “João”: Elemento do conjunto de valores do atributo Nome da entidade Homem.\n" +
                        "• “Maria”: Elemento do conjunto de valores do atributo Nome da entidade Mulher.\n" +
                        "• “Casado”: Ligação entre um homem e uma mulher, sendo que um homem pode ser casado " +
                        "com uma e apenas uma mulher, assim como uma mulher pode ser casada com um e " +
                        "apenas um homem.", "http://www.noginfo.com.br/arquivos/CC_MDados_07", "Relacionemento");
        relacao.add(e);

        e = new publicacao("Grau do Relacionamento", " Relacionamento Binário ", R.drawable.binario,
                "Um fornecedor comercializa materiais que são utilizados em diversos projetos.",
                "http://www.noginfo.com.br/arquivos/CC_MDados_07", "Grau");
        agregacao.add(e);
        e = new publicacao("Grau do Relacionamento", "Relacionamento Ternário", R.drawable.ternario,
                " Um fornecedor comercializa materiais que são utilizados em projetos específicos.",
                "http://www.noginfo.com.br/arquivos/CC_MDados_07", "Grau");
        agregacao.add(e);


        switch(titulo){
            case "Atributo": return atributo;
            case "Relacionamento": return relacao;
        }

        return agregacao;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}