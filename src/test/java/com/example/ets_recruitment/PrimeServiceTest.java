package com.example.ets_recruitment;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrimeServiceTest {

    private PrimeService service = new PrimeService();

    @ParameterizedTest
    @ValueSource(longs = {0,1})
    void shouldReturnEmptyListIfNoPrime(long number) {
        assertEquals(0, service.getPrimeNumbers(number).size());
    }

    @Test
    void shouldReturnListOfPrimes() {
        //given
        long boundary = 30L;

        List<Long> expectedPrimes = Arrays.asList(2L, 3L, 5L, 7L, 11L, 13L, 17L, 19L, 23L, 29L);

        //when
        List<Long> result = service.getPrimeNumbers(boundary);

        //then
        assertEquals(expectedPrimes, result);
    }

    @ParameterizedTest
    @ValueSource(longs = {-15, -100})
    void shouldReturnEmptyListIfBoundaryNegative(long number) {
        assertEquals(0, service.getPrimeNumbers(number).size());
    }
}