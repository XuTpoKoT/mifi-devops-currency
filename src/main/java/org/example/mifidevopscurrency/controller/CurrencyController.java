package org.example.mifidevopscurrency.controller;

import lombok.RequiredArgsConstructor;
import org.example.mifidevopscurrency.service.CurrencyConverterService;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping()
@RequiredArgsConstructor
public class CurrencyController {
    private final CurrencyConverterService service;

    @GetMapping("/rub-to-usd")
    public double rubToUsd(@RequestParam double amount) {
        return service.rubToUsd(amount);
    }

    @GetMapping("/usd-to-rub")
    public double usdToRub(@RequestParam double amount) {
        return service.usdToRub(amount);
    }
}

