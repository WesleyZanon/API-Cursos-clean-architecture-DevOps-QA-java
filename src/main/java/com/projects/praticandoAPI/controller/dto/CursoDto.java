package com.projects.praticandoAPI.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.projects.praticandoAPI.modelo.Curso;
import com.projects.praticandoAPI.modelo.Usuario;

public class CursoDto {
	
	private Long id;
	private String nome;
	private String categoria;
	
	public CursoDto(Curso curso) {
		super();
		this.id = curso.getId();
		this.nome = curso.getNome();
		this.categoria = curso.getCategoria();
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getCategoria() {
		return categoria;
	}


	public static List<CursoDto> converter(List<Curso> curso) {
		return curso.stream().map(CursoDto::new).collect(Collectors.toList());
	}

	
	
}
