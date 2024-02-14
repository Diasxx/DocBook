package com.example.docbook.domain.controller;

import com.example.docbook.domain.model.Department;
import com.example.docbook.domain.service.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class DepartmentController {
    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

/*
    @PostMapping("/department")
    public Department saveDepartment(@RequestBody Department department){
        return  departmentService.saveDepartment(department);
    }
*/

    @GetMapping("/department")
    public String getAllDepartments(Model model){
        model.addAttribute("departments",departmentService.getAllDepartments());
        return "departments";
    }
}