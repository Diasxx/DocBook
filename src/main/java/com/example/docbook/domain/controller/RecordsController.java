package com.example.docbook.domain.controller;

import com.example.docbook.domain.model.Doctor;
import com.example.docbook.domain.model.Patient;
import com.example.docbook.domain.model.Record;
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
    public Record saveRecords(@RequestBody Record record){

        Patient patient = patientService.getPatient(record.getPatient().getId());
        Doctor doctor = doctorService.getDoctor(record.getDoctor().getId());


        record.setPatient(patient);
        record.setDoctor(doctor);

        return recordsService.saveRecords(record);
    }


    @GetMapping("/records")
    public List<Record> getAllRecords(){
        return recordsService.getAllRecords();
    }

}
