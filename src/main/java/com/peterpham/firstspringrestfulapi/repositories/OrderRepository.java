package com.peterpham.firstspringrestfulapi.repositories;

import com.peterpham.firstspringrestfulapi.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
