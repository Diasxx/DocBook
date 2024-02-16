package com.example.docbook.domain.controller;

import com.example.docbook.domain.model.*;
import com.example.docbook.domain.service.DoctorService;
import com.example.docbook.domain.service.ScheduleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ScheduleController {
    private final ScheduleService scheduleService;
    private final DoctorService doctorService;

    public ScheduleController(ScheduleService scheduleService, DoctorService doctorService) {
        this.scheduleService = scheduleService;
        this.doctorService = doctorService;
    }

    @PostMapping("/saveSchedule")
    public String saveSchedule(@ModelAttribute Schedule schedule,@RequestParam(name = "doctorId") long doctorId){
        schedule.setDoctor( doctorService.getDoctor(doctorId));
        scheduleService.saveSchedule(schedule);
        return "redirect:/schedule";
    }

    @GetMapping("/doctor/{doctorId}")
    public String getAllSchedules(Model model,@PathVariable(name = "doctorId") long doctorId){
        Schedule schedule = new Schedule();
        model.addAttribute("schedule",schedule);
        model.addAttribute("schedules", scheduleService.getSchedulesByDoctorId(doctorId));
        return "schedule";
    }

}