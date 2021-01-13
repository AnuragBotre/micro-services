package com.trendcore.department.service;

import com.trendcore.department.entity.Department;
import com.trendcore.department.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Optional<Department> getDepartment(Long departmentId) {
        Optional<Department> byId = departmentRepository.findById(departmentId);
        return byId;
    }

    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }
}
