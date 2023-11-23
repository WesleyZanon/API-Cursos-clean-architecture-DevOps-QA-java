package com.projects.praticandoAPI.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
import com.projects.praticandoAPI.controller.dto.MoedaDto;
import com.projects.praticandoAPI.controller.form.MoedaForm;
import com.projects.praticandoAPI.modelo.Moeda;
import com.projects.praticandoAPI.repository.MoedaRepository;

@RestController
@CrossOrigin
@RequestMapping("/moedas-transations")
public class MoedaController {
	
	@Autowired
	private MoedaRepository moedaRepository;
	
	@GetMapping
	public List<MoedaDto> lista() {
		List<Moeda> moeda = moedaRepository.findAll();
		return MoedaDto.converter(moeda);
	}
	
	
	@PostMapping
	public ResponseEntity<MoedaDto> cadastrar(@RequestBody MoedaForm form, UriComponentsBuilder uriBuilder){
		Moeda moeda = form.converter(moedaRepository);
		moedaRepository.save(moeda);
		
		URI uri = uriBuilder.path("/moedas-transations/{id}").buildAndExpand(moeda.getId()).toUri();
		return ResponseEntity.created(uri).body(new MoedaDto(moeda));
		
	}


}