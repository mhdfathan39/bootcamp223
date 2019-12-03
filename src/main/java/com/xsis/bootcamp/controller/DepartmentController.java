package com.xsis.bootcamp.controller;

import com.xsis.bootcamp.services.DepartmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * DepartmentController
 */
@Controller
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService; 

    @GetMapping("/department")
    public String showDepartment(Model model){
        model.addAttribute("departments", departmentService.getDepartments());
        return "pages/department";    
    }
}