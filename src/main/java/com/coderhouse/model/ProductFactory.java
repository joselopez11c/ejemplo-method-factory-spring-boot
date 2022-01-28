package com.coderhouse.model;

import com.coderhouse.builder.ProductBuilder;
import com.coderhouse.model.database.document.ProductDocument;
import com.coderhouse.model.database.document.concrete.ProductTangible;
import com.coderhouse.model.request.ProductRequest;
import lombok.Data;

@Data
public class ProductFactory {

    public ProductDocument createProduct(String type, ProductRequest request) {
        switch (type) {
            case "TANGIBLE":
                return ProductBuilder.requestToEntityTangible(request);
            case "INTANGIBLE":
                return ProductBuilder.requestToEntityIntangible(request);
            default:
                return null;
        }
    }

}
