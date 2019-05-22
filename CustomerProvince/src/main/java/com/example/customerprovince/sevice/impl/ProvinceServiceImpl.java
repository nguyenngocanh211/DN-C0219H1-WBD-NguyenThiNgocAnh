package com.example.customerprovince.sevice.impl;

import com.example.customerprovince.entity.Province;
import com.example.customerprovince.repository.ProvinceRepository;
import com.example.customerprovince.sevice.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinceServiceImpl implements ProvinceService {
    @Autowired
    ProvinceRepository provinceRepository;

    @Override
    public List<Province> findAllProvince() {
        return provinceRepository.findAll();
    }
}
