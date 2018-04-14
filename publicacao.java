package br.com.maymer.mymer;

import java.io.Serializable;

/**
 * Created by rosiel on 07/04/2018.
 */

public class publicacao implements Serializable {
    private String tema;
    private String descricao;
    private String desen;
    private String link;
    private String tipo;
    private int imagem;

    public publicacao(String Tema, String Descricao, int Imagem, String Desen, String Link, String Tipo) {
        this.tema = Tema;
        this.descricao = Descricao;
        this.imagem = Imagem;
        this.desen = Desen;
        this.link = Link;
        this.setTipo(Tipo);
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getDesen() {
        return desen;
    }

    public void setDesen(String desen) {
        this.desen = desen;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
