package com.example.docbook.domain.controller;

import com.example.docbook.domain.model.Department;
import com.example.docbook.domain.service.BookingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {
    private final BookingService bookingService;

    public DepartmentController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping("/department")
    public Department saveDepartment(@RequestBody Department department){
        return  bookingService.saveDepartment(department);
    }

    @GetMapping("/department")
    public List<Department> getAllDepartments(){
        return bookingService.getAllDepartments();
    }
}
