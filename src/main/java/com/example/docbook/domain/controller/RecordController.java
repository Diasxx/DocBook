package com.example.docbook.domain.controller;

import com.example.docbook.domain.model.Doctor;
import com.example.docbook.domain.model.Patient;
import com.example.docbook.domain.model.Record;
import com.example.docbook.domain.service.DoctorService;
import com.example.docbook.domain.service.PatientService;
import com.example.docbook.domain.service.RecordService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class RecordController {
    private final RecordService recordService;
    private final PatientService patientService;
    private final DoctorService doctorService;

    public RecordController(RecordService recordService, PatientService patientService, DoctorService doctorService) {
        this.recordService = recordService;
        this.patientService = patientService;
        this.doctorService = doctorService;
    }

    @PostMapping("/saveRecords")
    public String saveRecord(@ModelAttribute Record record, @RequestParam long doctorId,@RequestParam long patientId){
        record.setPatient(patientService.getPatient(patientId));
        record.setDoctor(doctorService.getDoctor(doctorId));
        recordService.saveRecord(record);
        return "redirect:/records";
    }


    @GetMapping("/records")
    public String getAllRecords(Model model){
        Record record = new Record();
        model.addAttribute("record",record);
        model.addAttribute("records", recordService.getAllRecords());
        return "records";
    }

}