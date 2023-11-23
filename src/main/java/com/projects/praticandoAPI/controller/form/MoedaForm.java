package com.projects.praticandoAPI.controller.form;

import com.projects.praticandoAPI.modelo.Moeda;
import com.projects.praticandoAPI.repository.MoedaRepository;


public class MoedaForm {
	
	private int idUsuario;
	private double valor;

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Moeda converter(MoedaRepository moedaRepository) {
		
		return new Moeda(idUsuario, valor);
	}

}
