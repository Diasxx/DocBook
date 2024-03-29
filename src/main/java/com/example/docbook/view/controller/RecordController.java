package com.example.docbook.view.controller;

import com.example.docbook.domain.model.Record;
import com.example.docbook.domain.service.DoctorService;
import com.example.docbook.domain.service.PatientService;
import com.example.docbook.domain.service.RecordService;
import com.example.docbook.domain.service.ScheduleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RecordController {
    private final RecordService recordService;
    private final PatientService patientService;
    private final DoctorService doctorService;

    private final ScheduleService scheduleService;

    public RecordController(RecordService recordService, PatientService patientService, DoctorService doctorService, ScheduleService scheduleService) {
        this.recordService = recordService;
        this.patientService = patientService;
        this.doctorService = doctorService;
        this.scheduleService = scheduleService;
    }

    @PostMapping("/saveRecords")
    public String saveRecord(@ModelAttribute Record record,@RequestParam long patientId,@RequestParam long scheduleId){
        record.setPatient(patientService.getPatient(patientId));
        record.setSchedule(scheduleService.getSchedule(scheduleId));
        recordService.saveRecord(record);
        return "redirect:/";
    }



/*    @GetMapping("/records")
    public String getAllRecords(Model model){
        Record record = new Record();
        model.addAttribute("doctorSchedule",scheduleService.getSchedulesByDoctorId(1));
        model.addAttribute("record",record);
        model.addAttribute("records",recordService.getRecordByScheduleId(8));
        return "records";
    }*/

}
