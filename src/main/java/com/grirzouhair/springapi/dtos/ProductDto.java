package com.grirzouhair.springapi.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public class ProductDto {
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private Byte categoryId;
}
