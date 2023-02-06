package br.ufjf.dcc.poo.model;

import java.util.ArrayList;

public class Produto {
	private int pk_produto;
    private int cod_produto;
    private String nome;
    private String descricao;
    private String unidade;
    private float preco_unitario;
    private ArrayList<Pedido>pedidos;
    
	public int getPk_produto() {
		return pk_produto;
	}
	public void setPk_produto(int pk_produto) {
		this.pk_produto = pk_produto;
	}
	public int getCod_produto() {
		return cod_produto;
	}
	public void setCod_produto(int cod_produto) {
		this.cod_produto = cod_produto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	public float getPreco_unitario() {
		return preco_unitario;
	}
	public void setPreco_unitario(float preco_unitario) {
		this.preco_unitario = preco_unitario;
	}
	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(ArrayList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
    
	
}

