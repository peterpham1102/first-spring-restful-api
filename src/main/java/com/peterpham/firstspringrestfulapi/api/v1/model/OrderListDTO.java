package com.peterpham.firstspringrestfulapi.api.v1.model;

import lombok.Data;

import java.util.List;

@Data
public class OrderListDTO {

    List<OrderListDTO> orders;

}
