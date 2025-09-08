package com.unifor.arquiteturas.Model;

import lombok.Data;

@Data
public class Stock {
    private long id;
    private long produtoId;
    private int quantidade;
}
