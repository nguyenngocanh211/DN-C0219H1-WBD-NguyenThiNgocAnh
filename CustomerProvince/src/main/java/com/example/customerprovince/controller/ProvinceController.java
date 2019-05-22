package com.example.customerprovince.controller;

import com.example.customerprovince.sevice.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProvinceController {
    @Autowired
    ProvinceService provinceService;

    @RequestMapping("/home")
    public String home(Model model){
       model.addAttribute("provinceList", provinceService.findAllProvince());
        return "home";
    }
}
