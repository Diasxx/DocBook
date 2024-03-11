package com.example.docbook.view.controller;

import com.example.docbook.domain.model.*;
import com.example.docbook.domain.service.DoctorService;
import com.example.docbook.domain.service.ScheduleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
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
        //schedule.setDoctor( doctorService.getDoctor(doctorId));
        scheduleService.saveSchedule(schedule);
        return "redirect:/doctor/"+doctorId;
    }

    @GetMapping("/doctor/{doctorId}")
    public String getAllSchedules(Model model,@PathVariable(name = "doctorId") long doctorId){

        Schedule schedule = new Schedule();
        LocalDate dateBeforeToday = LocalDate.now().minusDays(1);

        model.addAttribute("schedule",schedule);
        model.addAttribute("schedules", scheduleService.getSchedulesByDateAndDoctor(dateBeforeToday,doctorId));

        return "schedule";
    }

}