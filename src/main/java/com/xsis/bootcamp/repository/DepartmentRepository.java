package com.xsis.bootcamp.repository;

import com.xsis.bootcamp.model.Department;

import org.springframework.data.repository.CrudRepository;

/**
 * DepartmentRepository
 */
public interface DepartmentRepository extends CrudRepository<Department,Long>{

    
}