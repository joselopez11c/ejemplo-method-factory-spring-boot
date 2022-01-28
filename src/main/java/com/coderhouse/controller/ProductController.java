package com.coderhouse.controller;

import com.coderhouse.model.database.document.ProductDocument;
import com.coderhouse.model.request.ProductRequest;
import com.coderhouse.model.response.ProductResponse;
import com.coderhouse.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/coder-house")
public class ProductController {

    private final ProductService service;

    @PostMapping("/product")
    public ProductResponse createProduct(
            @Validated @RequestBody ProductRequest product) {
        return service.create(product);
    }

    @GetMapping("/product/all")
    public List<ProductResponse> searchProduct() {
        return service.searchAll();
    }
}
