package com.example.customerprovince.sevice;

import com.example.customerprovince.entity.Province;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProvinceService {
    List<Province> findAllProvince();
}
