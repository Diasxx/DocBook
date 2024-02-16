package com.example.docbook.domain.repo;

import com.example.docbook.domain.model.Department;
import com.example.docbook.domain.model.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule,Long> {
    List<Schedule> getSchedulesByDoctorId(long id);
    List<Schedule> getSchedulesByDateIsGreaterThanAndAndDoctor_Id(LocalDate localDate,long doctorId);
}
