package com.xsis.bootcamp.controller;

import com.xsis.bootcamp.services.RegionsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * RegionsController
 */
@Controller
@RequestMapping("/regions")
public class RegionsController {
    @Autowired
    private RegionsService regionsService;

    @GetMapping("/")
    public String showRegions(Model model){
        model.addAttribute("regions", regionsService.findAllRegions());
        return "pages/regions";
    }
    
}