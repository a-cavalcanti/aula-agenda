package com.github.pinheiroo27.agenda;

public class Item {
	private Usuario dono;
	private String nome;
	private String descricao;
	
	public Item(Usuario dono, String nome, String descricao){
		this.dono=dono;
		this.nome=nome;
		this.descricao=descricao;
	}
	
	public Usuario getDono() {
		return dono;
	}
	public String getNome() {
		return nome;
	}
	public String getDescricao() {
		return descricao;
	}
	
}
