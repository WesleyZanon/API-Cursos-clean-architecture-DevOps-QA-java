package com.projects.praticandoAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projects.praticandoAPI.modelo.Moeda;

public interface MoedaRepository extends JpaRepository<Moeda, Long>{
	
	Moeda findById(int id);
}
