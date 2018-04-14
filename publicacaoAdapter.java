package br.com.maymer.mymer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by rosiel on 07/04/2018.
 */

public class publicacaoAdapter extends ArrayAdapter<publicacao> {

    private final Context context;
    private final ArrayList<publicacao> elementos;


    public publicacaoAdapter(Context context, ArrayList<publicacao> elementos){
        super(context, R.layout.linha, elementos);
        this.context = context;
        this.elementos = elementos;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.linha, parent, false);

        TextView tema = (TextView) rowView.findViewById(R.id.tema);
        TextView descricao = (TextView) rowView.findViewById(R.id.descricao);
        ImageView imagem = (ImageView) rowView.findViewById(R.id.imagem);

        tema.setText(elementos.get(position).getTema());
        descricao.setText(elementos.get(position).getDescricao());
        imagem.setImageResource(elementos.get(position).getImagem());

        return rowView;
    }
}
