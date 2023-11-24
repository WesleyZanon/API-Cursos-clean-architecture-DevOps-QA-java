package com.projects.praticandoAPI;
import com.projects.praticandoAPI.modelo.Moeda;
import com.projects.praticandoAPI.repository.MoedaRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.transaction.annotation.Transactional;
@DataJpaTest
@Transactional
public class MoedaRepositoryTest {
    @Autowired
    private MoedaRepository repository;
    @Test
    public void deveriaCarregarUmaMoedaPelaId() {
        int usuario01 = 1;
        Moeda transacao01 = new Moeda();
        transacao01.setIdUsuario(usuario01);
        transacao01.setValor(250);
        repository.save(transacao01);
        Moeda moeda = repository.findById(transacao01.getId()).orElse(null);
        Assertions.assertNotNull(moeda);
        Assertions.assertEquals(usuario01, moeda.getIdUsuario());
    }

}