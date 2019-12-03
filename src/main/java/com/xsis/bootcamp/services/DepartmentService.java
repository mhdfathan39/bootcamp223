package com.xsis.bootcamp.services;

import com.xsis.bootcamp.model.Department;
import com.xsis.bootcamp.repository.DepartmentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * DepartmentService
 */
@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;
    
    public Iterable<Department> getDepartments(){
        return departmentRepository.findAll();
    }
    
}