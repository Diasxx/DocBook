package com.example.docbook.domain.service.impl;

import com.example.docbook.domain.model.Schedule;
import com.example.docbook.domain.repo.ScheduleRepository;
import com.example.docbook.domain.service.ScheduleService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService {
    private final ScheduleRepository scheduleRepository;

    public ScheduleServiceImpl(ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }


    @Override
    public List<Schedule> getAllSchedules() {
        return scheduleRepository.findAll();
    }

    @Override
    public List<Schedule> getSchedulesByDoctorId(long id) {
        return scheduleRepository.getSchedulesByDoctorId(id);
    }


    @Override
    public List<Schedule> getSchedulesByDateAndDoctor(LocalDate localDate, long doctorId) {
        return scheduleRepository.getSchedulesByDateIsGreaterThanAndDoctor_Id(localDate,doctorId);
    }

    @Override
    public Schedule getSchedule(long id) {
        return scheduleRepository.getReferenceById(id);
    }

    @Override
    public Schedule saveSchedule(Schedule schedule) {
        return scheduleRepository.save(schedule);
    }

    @Override
    public Schedule updateSchedule(Schedule schedule) {
        return scheduleRepository.save(schedule);
    }

    @Override
    public void deleteSchedule(long id) {
        scheduleRepository.deleteById(id);
    }
}
