package com.coderhouse.model.request;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest {

    private String type;
    private String description;
    private Double price;
    private String serviceTime;
    private CategoryRequest category;
}
