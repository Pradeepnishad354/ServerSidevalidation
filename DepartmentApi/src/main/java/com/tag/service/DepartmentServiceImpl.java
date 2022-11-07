package com.tag.service;

import com.tag.entity.Department;
import com.tag.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImpl implements DepartmentService {

   @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department SaveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return (List<Department>) departmentRepository.findAll();
    }

    @Override
    public void deleteDepartmentById(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }

    @Override
    public Department updateDepartment(Department department, Long departmentId) {

        Department dp=departmentRepository.findById(departmentId).get();

        if(Objects.nonNull(department.getDepartmentName()) && !
                "".equalsIgnoreCase(department.getDepartmentName())){
            dp.setDepartmentName(department.getDepartmentName());
        }

        if(Objects.nonNull(department.getDepartmentAddress()) &&
               ! "" .equalsIgnoreCase(department.getDepartmentAddress())){
            dp.setDepartmentAddress(department.getDepartmentAddress());
        }

        if(Objects.nonNull(department.getDepartmentCode()) && !
                "".equalsIgnoreCase(department.getDepartmentCode())){
            dp.setDepartmentCode(department.getDepartmentCode());
        }
        return departmentRepository.save(dp);
    }

	@Override
	public Department findById(Long departmentId) {
		
		return departmentRepository.findById(departmentId).get();
	}


}
