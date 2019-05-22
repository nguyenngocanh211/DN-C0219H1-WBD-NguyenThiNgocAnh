package com.example.customerprovince.repository;

import com.example.customerprovince.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long>
{
    List<Customer> findByFirstNameContaining(String name);
}
