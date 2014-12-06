/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Jonathan
 */
public class Produto {

    private long id;
    private String nome;
    private String especificacao;
    private double precoCusto;
    private double precoVenda;
    private boolean habilitado;

    public Produto(long id, String nome, String especificacao, double precoCusto, double precoVenda, boolean habilitarVenda) {
        this.id = id;
        this.nome = nome;
        this.especificacao = especificacao;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.habilitado = habilitarVenda;
    }

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

    public String getEspecificacao() {
        return especificacao;
    }

    public void setEspecificacao(String especificacao) {
        this.especificacao = especificacao;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public boolean getHabilitado() {
        return this.habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

}
