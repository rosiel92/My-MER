package br.com.maymer.mymer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class apresentacao extends AppCompatActivity {

    private publicacao itemList;
    private ImageView imageV;
    private TextView tvDesen;
    private TextView tvDesc;
    private TextView tvLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apresentacao);

        Intent in = getIntent();
        itemList = (publicacao) in.getSerializableExtra("itemList");
        setTitle(itemList.getTema());

        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        imageV = (ImageView) findViewById(R.id.img1);
        tvDesc = (TextView) findViewById(R.id.tvDescricao);
        tvDesen = (TextView) findViewById(R.id.tvDesen);
        tvLink = (TextView) findViewById(R.id.tvLink);

        tvDesc.setText(itemList.getDescricao());
        tvDesen.setText(itemList.getDesen());
        tvLink.setText(itemList.getLink());
        imageV.setImageResource(itemList.getImagem());

        imageV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(apresentacao.this, ImagemCom.class);
                intent.putExtra("imagem", itemList.getImagem());
                intent.putExtra("tema", itemList.getTema());
                startActivity(intent);
            }
        });

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
