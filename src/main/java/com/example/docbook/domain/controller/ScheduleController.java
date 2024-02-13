package com.example.docbook.domain.controller;

import com.example.docbook.domain.model.*;
import com.example.docbook.domain.service.ScheduleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ScheduleController {
    private final ScheduleService scheduleService;

    public ScheduleController(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    @PostMapping("/schedule")
    public Schedule saveSchedule(@RequestBody Schedule schedule){
        return scheduleService.saveSchedule(schedule);
    }
    @GetMapping("/schedule")
    public List<Schedule> getAllSchedules(){
        return scheduleService.getAllSchedules();
    }



}
