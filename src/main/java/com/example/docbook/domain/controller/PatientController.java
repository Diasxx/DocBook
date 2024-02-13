package com.example.docbook.domain.controller;

import com.example.docbook.domain.model.Doctor;
import com.example.docbook.domain.model.Patient;
import com.example.docbook.domain.service.BookingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientController {
    private final BookingService bookingService;
    public PatientController(BookingService bookingService) {
        this.bookingService = bookingService;
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
