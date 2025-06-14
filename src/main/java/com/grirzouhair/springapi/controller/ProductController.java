package com.grirzouhair.springapi.controller;


import com.grirzouhair.springapi.dtos.ProductDto;
import com.grirzouhair.springapi.entities.Product;
import com.grirzouhair.springapi.mappers.ProductMapper;
import com.grirzouhair.springapi.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/products")
public class ProductController {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;
    @GetMapping
    public List<ProductDto> getAllProducts(
            @RequestParam(required = false, defaultValue = "", name = "id") Long catego
    ) {
        List<Product> products;
        if (catego != null) {
            products = productRepository.findByCategoryId(catego);
        }else {
            products = productRepository.findAll();
        }
        return products.stream().map(productMapper::toDto).toList();
    }
}
