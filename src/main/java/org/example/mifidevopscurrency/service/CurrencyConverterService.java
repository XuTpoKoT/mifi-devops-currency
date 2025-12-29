package org.example.mifidevopscurrency.service;

import org.springframework.stereotype.Service;

@Service
public class CurrencyConverterService {

    private static final double USD_RATE = 90.0; // 1 USD = 90 RUB

    public double rubToUsd(double rub) {
        return rub / USD_RATE;
    }

    public double usdToRub(double usd) {
        return usd * USD_RATE;
    }
}

