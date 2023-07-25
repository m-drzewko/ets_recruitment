package com.example.ets_recruitment;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest(PrimeController.class)
class PrimeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PrimeService primeService;

    @Test
    void sendPrimeNumbersTest() throws Exception {
        //given
        List<Long> expectedPrimes = Arrays.asList(2L, 3L, 5L, 7L, 11L, 13L);

        //when
        Mockito.when(primeService.getPrimeNumbers(15L)).thenReturn(expectedPrimes);

        //then
        mockMvc.perform(MockMvcRequestBuilders.get("/prime")
                        .param("boundary", "15"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("index"))
                .andExpect(MockMvcResultMatchers.model().attribute("primes", expectedPrimes));
    }

    @Test
    void indexTest() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("index"));
    }

}