package com.example.customerprovince.sevice.impl;

import com.example.customerprovince.entity.Customer;
import com.example.customerprovince.repository.CustomerRepository;
import com.example.customerprovince.sevice.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }
}
