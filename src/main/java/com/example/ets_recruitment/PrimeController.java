package com.example.ets_recruitment;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class PrimeController {

    private final PrimeService primeService;

    @GetMapping
    public String index(Model model) {
        return "index";
    }

    @GetMapping("/prime")
    public String sendPrimeNumbers(@RequestParam long boundary, Model model) {
        List<Long> primeNumbers = primeService.getPrimeNumbers(boundary);
        model.addAttribute("visible", true);
        model.addAttribute("boundary", boundary);
        model.addAttribute("primes", primeNumbers);
        return "index";
    }
}
