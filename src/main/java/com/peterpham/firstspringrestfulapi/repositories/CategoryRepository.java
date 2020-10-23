package com.peterpham.firstspringrestfulapi.repositories;

import com.peterpham.firstspringrestfulapi.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
