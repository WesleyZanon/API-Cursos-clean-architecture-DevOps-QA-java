package com.projects.praticandoAPI.controller.dto;


import java.util.List;
import java.util.stream.Collectors;

import com.projects.praticandoAPI.modelo.Moeda;
import com.projects.praticandoAPI.modelo.Usuario;

public class MoedaDto {
	
	private Long id;
	private double valor;
	
	public MoedaDto(Moeda moeda) {
		super();
		this.id = moeda.getId();
		this.valor = moeda.getValor();
	}

	public Long getId() {
		return id;
	}

	public double getValor() {
		return valor;
	}

	public static List<MoedaDto> converter(List<Moeda> moeda) {
		return moeda.stream().map(MoedaDto::new).collect(Collectors.toList());
	}
	
	

}
