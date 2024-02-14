package com.example.docbook.domain.service;

import com.example.docbook.domain.model.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> getAllDepartments();
    Department getDepartment(long id);
    Department saveDepartment(Department department);
    Department updateDepartment(Department department);
    void deleteDepartment(long id);
}
