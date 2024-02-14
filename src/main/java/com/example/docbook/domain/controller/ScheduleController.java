package com.example.docbook.domain.controller;

import com.example.docbook.domain.model.*;
import com.example.docbook.domain.service.DoctorService;
import com.example.docbook.domain.service.ScheduleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ScheduleController {
    private final ScheduleService scheduleService;
    private final DoctorService doctorService;

    public ScheduleController(ScheduleService scheduleService, DoctorService doctorService) {
        this.scheduleService = scheduleService;
        this.doctorService = doctorService;
    }

    @PostMapping("/schedule")
    public Schedule saveSchedule(@RequestBody Schedule schedule){
        Doctor doctor = doctorService.getDoctor(schedule.getDoctor().getId());
        schedule.setDoctor(doctor);
        return scheduleService.saveSchedule(schedule);
    }
    @GetMapping("/schedule")
    public List<Schedule> getAllSchedules(){
        return scheduleService.getAllSchedules();
    }



}
