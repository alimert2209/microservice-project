package com.microservice.currencyconversion;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "*")
@RestController

public class CurrencyConversionController {
    private static final double EXCHANGE_RATE = 0.053;

    @GetMapping("/convert-back")
    public double convert(@RequestParam("amount") Double amount) {
        return amount * EXCHANGE_RATE;
    }
}
