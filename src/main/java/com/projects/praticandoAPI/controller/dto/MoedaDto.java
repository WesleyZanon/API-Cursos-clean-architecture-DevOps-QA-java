package com.projects.praticandoAPI.controller.dto;


import java.util.List;
import java.util.stream.Collectors;

import com.projects.praticandoAPI.modelo.Moeda;

public class MoedaDto {
	
	private Long id;
	private int idUsuario;
	private double valor;
	
	public MoedaDto(Moeda moeda) {
		super();
		this.id = moeda.getId();
		this.idUsuario = moeda.getIdUsuario();
		this.valor = moeda.getValor();
	}

	public Long getId() {
		return id;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public double getValor() {
		return valor;
	}

	public static List<MoedaDto> converter(List<Moeda> moeda) {
		return moeda.stream().map(MoedaDto::new).collect(Collectors.toList());
	}
	
	

}
