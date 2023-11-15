package com.projects.praticandoAPI.controller.form;

import com.projects.praticandoAPI.modelo.Curso;
import com.projects.praticandoAPI.modelo.Moeda;
import com.projects.praticandoAPI.repository.CursoRepository;
import com.projects.praticandoAPI.repository.MoedaRepository;


public class CursoForm {
	
	private String nome;
	private String categoria;
	
	public String getNome() {
		return nome;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public Curso converter(CursoRepository cursoRepository) {
		
		return new Curso(nome, categoria);
	}

}
