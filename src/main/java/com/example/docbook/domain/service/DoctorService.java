package com.example.docbook.domain.service;

import com.example.docbook.domain.model.Doctor;

import java.util.List;

public interface DoctorService {
    List<Doctor> getAllDoctors();
    Doctor getDoctor(long id);
    Doctor saveDoctor(Doctor doctor);
    Doctor updateDoctor(Doctor doctor);
    void deleteDoctor(long id);

    List<Doctor> getAllDoctorsByDepartmentId(long id);
}
