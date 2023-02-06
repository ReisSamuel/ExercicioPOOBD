package br.ufjf.dcc.poo.model;

import java.util.ArrayList;

public class Cliente {
      private int pk_cliente;
      private String cod_cliente;
      private String nome;
      private String end_rua;
      private int end_numero;
      private String end_complemento;
      private String end_bairro;
      private String end_cidade;
      private ArrayList<Pedido> pedidos;
      
	public int getPk_cliente() {
		return pk_cliente;
	}
	public void setPk_cliente(int pk_cliente) {
		this.pk_cliente = pk_cliente;
	}
	public String getCod_cliente() {
		return cod_cliente;
	}
	public void setCod_cliente(String cod_cliente) {
		this.cod_cliente = cod_cliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEnd_rua() {
		return end_rua;
	}
	public void setEnd_rua(String end_rua) {
		this.end_rua = end_rua;
	}
	public int getEnd_numero() {
		return end_numero;
	}
	public void setEnd_numero(int end_numero) {
		this.end_numero = end_numero;
	}
	public String getEnd_complemento() {
		return end_complemento;
	}
	public void setEnd_complemento(String end_complemento) {
		this.end_complemento = end_complemento;
	}
	public String getEnd_bairro() {
		return end_bairro;
	}
	public void setEnd_bairro(String end_bairro) {
		this.end_bairro = end_bairro;
	}
	public String getEnd_cidade() {
		return end_cidade;
	}
	public void setEnd_cidade(String end_cidade) {
		this.end_cidade = end_cidade;
	}
	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(ArrayList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
      
	
      
}
