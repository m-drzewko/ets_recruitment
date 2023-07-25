package com.example.ets_recruitment;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PrimeService {

    public List<Long> getPrimeNumbers(long boundary) {
        List<Long> primeNumbers = new ArrayList<>();

        for (int i = 2; i <= boundary; i++) {

            boolean flag = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) primeNumbers.add((long) i);
        }
        return primeNumbers;
    }
}
