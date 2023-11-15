package com.projects.praticandoAPI;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.projects.praticandoAPI.modelo.Curso;
import com.projects.praticandoAPI.repository.CursoRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
@ActiveProfiles("test")
public class CursoRepositoryTest {

	 @Autowired
	 private CursoRepository repository;

	 @Autowired
	 private TestEntityManager em;

	 	@Test
	 	public void testeORM(){
	 		
	 	}
	   
	 
	 @Test
	    public void deveriaCarregarUmCursoPeloNome() {
	        String nomeCurso = "Devops";

	        Curso python = new Curso();
	        python.setNome(nomeCurso);
	        python.setCategoria("python");
	        em.persist(python);

	        Curso curso = repository.findByNome(nomeCurso);
	        Assertions.assertNotNull(curso);
	        Assertions.assertEquals(nomeCurso, curso.getNome());
	    }

	    @Test
	    public void NaodeveriaCarregarUmCursoPeloNome() {
	        String nomeCurso2 = "Ms_Project";
	        Curso curso = repository.findByNome(nomeCurso2);
	        Assertions.assertNull(curso);
	        }


	
		
	
   
 }

    
  





