package com.example.docbook.domain.controller;

import com.example.docbook.domain.model.Department;
import com.example.docbook.domain.model.Doctor;
import com.example.docbook.domain.service.BookingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DoctorController {
    private final BookingService bookingService;

    public DoctorController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping("/doctor")
    public Doctor saveDoctor(@RequestBody Doctor doctor){
        return bookingService.saveDoctor(doctor);
    }

    @GetMapping("/doctor")
    public List<Doctor> getAllDoctors(){
        return bookingService.getAllDoctors();
    }

}
