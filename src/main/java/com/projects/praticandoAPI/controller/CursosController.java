package com.projects.praticandoAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projects.praticandoAPI.controller.dto.CursoDto;
import com.projects.praticandoAPI.modelo.Curso;
import com.projects.praticandoAPI.repository.CursoRepository;

@RestController
@CrossOrigin
@RequestMapping("/cursos")

public class CursosController {
	
	@Autowired
	private CursoRepository cursoRepository;
	
	@GetMapping
	public List<CursoDto> lista() {
		List<Curso> cursos = cursoRepository.findAll();
		return CursoDto.converter(cursos);
	}
	

}
