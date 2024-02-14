package com.example.docbook.domain.controller;

import com.example.docbook.domain.model.Doctor;
import com.example.docbook.domain.model.Patient;
import com.example.docbook.domain.model.Record;
import com.example.docbook.domain.service.DoctorService;
import com.example.docbook.domain.service.PatientService;
import com.example.docbook.domain.service.RecordService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecordController {
    private final RecordService recordService;
    private final PatientService patientService;
    private final DoctorService doctorService;

    public RecordController(RecordService recordService, PatientService patientService, DoctorService doctorService) {
        this.recordService = recordService;
        this.patientService = patientService;
        this.doctorService = doctorService;
    }

    @PostMapping("/records")
    public Record saveRecord(@RequestBody Record record){

        Patient patient = patientService.getPatient(record.getPatient().getId());
        Doctor doctor = doctorService.getDoctor(record.getDoctor().getId());


        record.setPatient(patient);
        record.setDoctor(doctor);

        return recordService.saveRecord(record);
    }


    @GetMapping("/records")
    public List<Record> getAllRecords(){
        return recordService.getAllRecords();
    }

}
