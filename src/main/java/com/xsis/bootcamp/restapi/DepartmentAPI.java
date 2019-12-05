package com.xsis.bootcamp.restapi;

import java.util.Optional;

import com.xsis.bootcamp.model.Department;
import com.xsis.bootcamp.services.DepartmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/department", produces = "application/json")
@CrossOrigin(origins = "*")
public class DepartmentAPI {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping
    public Iterable<Department> findAll() {
        return departmentService.getDepartments();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<?> deptById(@PathVariable("id") Long id) {
        Optional<Department> optDept = departmentService.findDeptById(id);
        if (optDept.isPresent()) {
            return new ResponseEntity<>(optDept.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @PostMapping(consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Department postDept(@RequestBody Department dept) {
        return departmentService.saveDepartment(dept);
    }

    @PutMapping(path = "/{id}", consumes = "application/json")
    public Department putDepartment(@RequestBody Department dept) {
        return departmentService.saveDepartment(dept);
    }

    @PatchMapping(path = "/{id}", consumes = "application/json")
    public Department patchDepartment(@RequestBody Department dept) {
        return departmentService.saveDepartment(dept);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteDepartment(@PathVariable("id") Long id) {
        try {
            departmentService.deleteDept(id);
        } catch (EmptyResultDataAccessException e) {
            // TODO: handle exception
        }
    }
}