package com.tag.controller;

import com.tag.entity.Department;
import com.tag.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import javax.validation.Valid;


@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;


    @PostMapping("/department")
    public Department saveDepartment( @Valid @RequestBody Department department){

        return departmentService.SaveDepartment(department);



    }
    @GetMapping("/department")
    public List<Department> fetchDepartmentList()
    {
        return departmentService.fetchDepartmentList();
    }
@DeleteMapping("/department/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId){

        departmentService.deleteDepartmentById(departmentId);
        return "department deleted successfully";


    }
    @PutMapping("/department/{id}")
    public Department updateDepartment(@RequestBody Department department,
                                       @PathVariable("id") Long departmentId){


        return departmentService.updateDepartment(department, departmentId);
    }
    
    @GetMapping("/department/{id}")
    public Department findById(@PathVariable("id") Long departmentId) {
    	
    	return departmentService.findById(departmentId);
    	
    	
    }


}
