package com.projects.praticandoAPI.controller.form;

import com.projects.praticandoAPI.modelo.Moeda;
import com.projects.praticandoAPI.repository.MoedaRepository;


public class MoedaForm {
	
	private double valor;

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public Moeda converter(MoedaRepository moedaRepository) {
		
		return new Moeda(valor);
	}

}
