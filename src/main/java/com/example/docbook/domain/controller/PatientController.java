package com.example.docbook.domain.controller;

import com.example.docbook.domain.model.Patient;
import com.example.docbook.domain.service.PatientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class PatientController {
    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @PostMapping("/patient")
    public Patient savePatient(@RequestBody Patient patient){
        return patientService.savePatient(patient);
    }

    @GetMapping("/patient")
    public String getAllPatients(Model model){
        model.addAttribute("patients", patientService.getAllPatients());
        return "patient";
    }
}
