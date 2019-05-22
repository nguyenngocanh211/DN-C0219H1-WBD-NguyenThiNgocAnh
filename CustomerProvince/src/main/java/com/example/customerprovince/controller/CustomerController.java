package com.example.customerprovince.controller;

import com.example.customerprovince.sevice.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @RequestMapping("/")
    public String test(Model model) {
        model.addAttribute("customerList",customerService.getAll());
        return "test";
    }
}
