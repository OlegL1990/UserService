package com.olegluzin.userservice.model;

import lombok.Value;


@Value
public class Stock {
    String ticker;
    String figi;
    String name;
    String type;
    Currency currency;
    String source;
    }
