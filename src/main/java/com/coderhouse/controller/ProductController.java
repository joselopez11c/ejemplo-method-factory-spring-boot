package com.coderhouse.controller;

import com.coderhouse.model.request.ProductRequest;
import com.coderhouse.model.response.ProductResponse;
import com.coderhouse.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/coder-house")
public class ProductController {

    private final ProductService service;

    @PostMapping("/product")
    public ProductResponse createProduct(@RequestBody ProductRequest product) {
        return service.create(product);
    }

    @GetMapping("/product/all")
    public List<ProductResponse> searchProduct() {
        return service.searchAll();
    }
}
