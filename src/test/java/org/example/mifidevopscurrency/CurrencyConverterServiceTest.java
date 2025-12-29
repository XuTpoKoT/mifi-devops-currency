package org.example.mifidevopscurrency;

import org.example.mifidevopscurrency.service.CurrencyConverterService;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CurrencyConverterServiceTest {

    private final CurrencyConverterService service =
            new CurrencyConverterService();

    @Test
    void rubToUsd_shouldConvertCorrectly() {
        double result = service.rubToUsd(900);
        assertThat(result).isEqualTo(10.0);
    }

    @Test
    void usdToRub_shouldConvertCorrectly() {
        double result = service.usdToRub(5);
        assertThat(result).isEqualTo(450.0);
    }
}

