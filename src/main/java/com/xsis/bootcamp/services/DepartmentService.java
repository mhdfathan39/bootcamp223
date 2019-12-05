package com.xsis.bootcamp.services;

import java.util.Optional;

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
    
    public Iterable<Department> getDepartments() {
        return departmentRepository.findAll();
    }
    
    public Optional<Department> findDeptById(Long deptId) {
        return departmentRepository.findById(deptId);
    }

    public void saveDept(Department department) {
        departmentRepository.save(department);
    }
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public void deleteDept(Long deptId) {
        departmentRepository.deleteById(deptId);
    }
    
}