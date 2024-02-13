package com.example.docbook.domain.service;

import com.example.docbook.domain.model.Schedule;

import java.util.List;

public interface ScheduleService {
    List<Schedule> getAllSchedules();
    Schedule getSchedule(long id);
    Schedule saveSchedule(Schedule schedule);
    Schedule updateSchedule(Schedule schedule);

}
