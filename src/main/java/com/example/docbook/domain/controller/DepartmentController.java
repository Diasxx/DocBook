package com.example.docbook.domain.controller;

import com.example.docbook.domain.model.Department;
import com.example.docbook.domain.service.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class DepartmentController {
    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping("/saveDepartment")
    public String saveDepartment(@ModelAttribute Department department){

        departmentService.saveDepartment(department);

        return "redirect:/department";
    }

    @GetMapping("/")
    public String getAllDepartments(Model model){
        Department department = new Department();
        model.addAttribute("department",department);
        model.addAttribute("departments",departmentService.getAllDepartments());
        return "departments";
    }

}