package com.example.docbook.domain.controller;

import com.example.docbook.domain.model.Doctor;
import com.example.docbook.domain.model.Patient;
import com.example.docbook.domain.model.Records;
import com.example.docbook.domain.service.DoctorService;
import com.example.docbook.domain.service.PatientService;
import com.example.docbook.domain.service.RecordsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecordsController {
    private final RecordsService recordsService;
    private final PatientService patientService;
    private final DoctorService doctorService;

    public RecordsController(RecordsService recordsService, PatientService patientService, DoctorService doctorService) {
        this.recordsService = recordsService;
        this.patientService = patientService;
        this.doctorService = doctorService;
    }

    @PostMapping("/records")
    public Records saveRecords(@RequestBody Records records){
        return recordsService.saveRecords(records);
    }

    @GetMapping("/records")
    public List<Records> getAllRecords(){
        return recordsService.getAllRecords();
    }

}
