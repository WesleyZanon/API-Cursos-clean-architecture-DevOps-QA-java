package com.projects.praticandoAPI;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class TransationApiAplication{

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testCreateTransactionDefault() throws Exception {
        final int expectedIdUser = 1;
        final double expectedValue = 500.0;

        mockMvc.perform(MockMvcRequestBuilders.post("/moedas-transations")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"idUsuario\": 1, \"valor\": 500.0}")
            )
            .andExpect(MockMvcResultMatchers.status().is(201))
            .andExpect(jsonPath("idUsuario").value(expectedIdUser))
            .andExpect(jsonPath("valor").value(expectedValue));
    }
}

