package com.tag.service;

import com.tag.entity.Department;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface DepartmentService {


     Department SaveDepartment(Department department);

     List<Department> fetchDepartmentList();


     void deleteDepartmentById(Long departmentId);

      Department updateDepartment( Department department, Long departmentId);
      
      public Department findById(Long departmentId);



}
