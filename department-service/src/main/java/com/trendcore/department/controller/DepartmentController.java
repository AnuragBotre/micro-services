package com.trendcore.department.controller;

import com.trendcore.department.entity.Department;
import com.trendcore.department.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;


    @GetMapping("/{departmentId}")
    public Department getDepartment(@PathVariable Long departmentId) {
        return departmentService.getDepartment(departmentId).orElse(new Department());
    }

    @PostMapping
    public Department save(@RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }

}
