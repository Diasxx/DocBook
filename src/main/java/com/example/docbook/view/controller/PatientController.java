package com.example.docbook.view.controller;

import com.example.docbook.domain.model.Patient;
import com.example.docbook.domain.service.PatientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PatientController {
    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @PostMapping("/savePatient")
    public String savePatient(@ModelAttribute Patient patient){
        patientService.savePatient(patient);
        return "redirect:/patient";
    }

    @GetMapping("/patient")
    public String getAllPatients(Model model){
        Patient patient = new Patient();
        model.addAttribute("patient",patient);
        model.addAttribute("patients", patientService.getAllPatients());
        return "patient";
    }
}
