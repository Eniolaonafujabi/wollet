package com.example.wollet.repositories;

import com.example.wollet.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustormerRepository extends JpaRepository<Customer,Long> {
}
