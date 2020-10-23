package com.peterpham.firstspringrestfulapi.api.v1.model;

import lombok.Data;

@Data
public class CategoryDTO {

    private Long id;
    private String name;
    private String description;
}
