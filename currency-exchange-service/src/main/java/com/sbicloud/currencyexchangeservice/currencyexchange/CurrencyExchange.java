package com.sbicloud.currencyexchangeservice.currencyexchange;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CurrencyExchange {
    Long UUID;
    private String from;
    private String to;
    private BigDecimal conversationMultiple;
    private String environment;

    public CurrencyExchange(Long UUID, String from, String to, BigDecimal conversationMultiple) {
        this.UUID = UUID;
        this.from = from;
        this.to = to;
        this.conversationMultiple = conversationMultiple;
    }
}
