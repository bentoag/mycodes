package model;

import java.util.ArrayList;
import java.util.List;

public class Tarefa {
	private int id;
	private String nome, descricao;
	
	private List<Categoria> categorias;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	@Override
	public String toString() {		
		return String.format("%d: %s, %s\n", id, nome, descricao);
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(this == obj) {
			return true;
		}
		
		if(obj == null) {
			return false;
		}
		
		if(this.getClass()!= obj.getClass()) {
			return false;
		}
		
		Tarefa outraTarefa = (Tarefa) obj;
		return this.id == outraTarefa.id;		
	}
	
	public List<Categoria> getCategorias() {
		return categorias;
	}
	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}
	
}//fim da classe Tarefa