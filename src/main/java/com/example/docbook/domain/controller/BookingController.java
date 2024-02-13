package com.example.docbook.domain.controller;

import com.example.docbook.domain.model.Department;
import com.example.docbook.domain.model.Doctor;
import com.example.docbook.domain.service.BookingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookingController {
    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping("/department")
    public String saveDepartment(@RequestBody Department department){
        bookingService.saveDepartment(department);
        return department.toString() +  " saved";
    }

    @GetMapping("/department")
    public List<Department> getAllDepartments(){
        return bookingService.getAllDepartments();
    }

    @PostMapping("/doctor")
    public String saveDoctor(@RequestBody Doctor doctor){
        bookingService.saveDoctor(doctor);
        return doctor.toString() +  " saved";
    }

    @GetMapping("/doctor")
    public List<Doctor> getAllDoctors(){
        return bookingService.getAllDoctors();
    }

}
