package com.example.docbook.domain.controller;

import com.example.docbook.domain.model.*;
import com.example.docbook.domain.service.BookingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ScheduleController {
    private final BookingService bookingService;

    public ScheduleController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping("/schedule")
    public Schedule saveSchedule(@RequestBody Schedule schedule){
        return bookingService.saveSchedule(schedule);
    }
    @GetMapping("/schedule")
    public List<Schedule> getAllSchedules(){
        return bookingService.getAllSchedules();
    }



}
