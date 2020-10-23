package com.peterpham.firstspringrestfulapi.repositories;

import com.peterpham.firstspringrestfulapi.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
