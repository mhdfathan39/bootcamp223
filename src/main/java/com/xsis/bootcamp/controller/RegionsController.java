package com.xsis.bootcamp.controller;

import javax.validation.Valid;

import com.xsis.bootcamp.dto.RegionsDto;
import com.xsis.bootcamp.model.Countries;
import com.xsis.bootcamp.model.Regions;
import com.xsis.bootcamp.services.RegionsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.validation.BindingResult;

import java.util.List;

/**
 * RegionsController
 */
@Controller
@RequestMapping("/regions")
public class RegionsController {
    @Autowired
    private RegionsService regionsService;

    @GetMapping("/")
    public String showRegions(Model model) {
        model.addAttribute("regions", regionsService.findAllRegions());
        return "pages/regions";
    }
    
    @GetMapping("/add")
    public String addRegions(Model model, RegionsDto regionsDto) {
        for (int i = 0; i < 3; i++) {
            regionsDto.getCountries().add(new Countries());
        }
        model.addAttribute("regionsDto", regionsDto);

        return "pages/addEditRegion";
    }

    @PostMapping("/save")
    public String saveRegion(@Valid RegionsDto regionsDto, BindingResult result) {

        List<Countries> listofCountries = regionsDto.getCountries();

        regionsService.saveRegion(new Regions(regionsDto.getRegionName(), listofCountries.toArray(new Countries[listofCountries.size()])));

        return "redirect:/regions/";
    }
    
}