package model;

import java.util.Date;

public class evento {

    long id;
    String nome;
    Date data;
    String local;
    String descricao;
    categorias categoria;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public categorias getCategoria() {
        return categoria;
    }
    public void setCategoria(categorias categoria) {
        this.categoria = categoria;
    }


}
