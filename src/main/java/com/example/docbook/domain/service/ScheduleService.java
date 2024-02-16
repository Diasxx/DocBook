package com.example.docbook.domain.service;

import com.example.docbook.domain.model.Schedule;

import java.time.LocalDate;
import java.util.List;

public interface ScheduleService {
    List<Schedule> getAllSchedules();
    List<Schedule> getSchedulesByDoctorId(long id);
    List<Schedule> getSchedulesByDateAndDoctor(LocalDate localDate, long doctorId);
    Schedule getSchedule(long id);
    Schedule saveSchedule(Schedule schedule);
    Schedule updateSchedule(Schedule schedule);
    void deleteSchedule(long id);

}
