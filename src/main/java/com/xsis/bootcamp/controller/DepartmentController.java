package com.xsis.bootcamp.controller;

import java.util.Optional;

import com.xsis.bootcamp.model.Department;
import com.xsis.bootcamp.services.DepartmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * DepartmentController
 */
@Controller
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService; 

    @GetMapping("/")
    public String showDepartment(Model model) {
        model.addAttribute("departments", departmentService.getDepartments());
        return "pages/department";
    }

     @GetMapping("add")
    public String addDept() {
        return "pages/addEditDept";
    }


    @GetMapping("/edit")
    @ResponseBody
    public Optional<Department> editDept(Long id) {
        return departmentService.findDeptById(id);
    }


    @PostMapping("/save")
    public String save(Department department) {
        departmentService.saveDept(department);
        return "redirect:/department/";
    }

    @GetMapping("/delete")
    public String delete(Long id) {
        departmentService.deleteDept(id);
        return "redirect:/department/";
    }
}