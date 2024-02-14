package com.example.docbook.domain.service.impl;

import com.example.docbook.domain.model.Doctor;
import com.example.docbook.domain.repo.DoctorRepository;
import com.example.docbook.domain.service.DoctorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {

    private final DoctorRepository doctorRepository;

    public DoctorServiceImpl(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    @Override
    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }
    @Override
    public Doctor getDoctor(long id) {
        return doctorRepository.getReferenceById(id);
    }

    @Override
    public Doctor saveDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    @Override
    public Doctor updateDoctor(Doctor doctor) {
        return updateDoctor(doctor);
    }

    @Override
    public void deleteDoctor(long id) {
        doctorRepository.deleteById(id);
    }
}
