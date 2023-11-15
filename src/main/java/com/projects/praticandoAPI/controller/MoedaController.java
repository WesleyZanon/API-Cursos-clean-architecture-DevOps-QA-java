package com.projects.praticandoAPI.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.projects.praticandoAPI.controller.dto.MoedaDto;
import com.projects.praticandoAPI.modelo.Moeda;
import com.projects.praticandoAPI.repository.MoedaRepository;

@RestController
@CrossOrigin
@RequestMapping("/moedas")
public class MoedaController {
	
	@Autowired
	private MoedaRepository moedaRepository;
	
	@GetMapping
	public List<MoedaDto> lista() {
		List<Moeda> moeda = moedaRepository.findAll();
		return MoedaDto.converter(moeda);
	}
	


}