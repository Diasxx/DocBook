package com.example.docbook.domain.controller;

import com.example.docbook.domain.model.Department;
import com.example.docbook.domain.model.Doctor;
import com.example.docbook.domain.model.Patient;
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
    public Department saveDepartment(@RequestBody Department department){
        return  bookingService.saveDepartment(department);
    }

    @GetMapping("/department")
    public List<Department> getAllDepartments(){
        return bookingService.getAllDepartments();
    }

    @PostMapping("/doctor")
    public Doctor saveDoctor(@RequestBody Doctor doctor){
        return bookingService.saveDoctor(doctor);
    }

    @GetMapping("/doctor")
    public List<Doctor> getAllDoctors(){
        return bookingService.getAllDoctors();
    }

    @PostMapping("/patient")
    public Patient savePatient(@RequestBody Patient patient){
        return bookingService.savePatient(patient);
    }
    @GetMapping("/patient")
    public List<Patient> getAllPatients(){
        return bookingService.getAllPatients();
    }

}
