package com.example.docbook.domain.service;

import com.example.docbook.domain.model.Department;
import com.example.docbook.domain.model.Doctor;
import com.example.docbook.domain.model.Patient;
import com.example.docbook.domain.repo.DepartmentRepository;
import com.example.docbook.domain.repo.DoctorRepository;
import com.example.docbook.domain.repo.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService{

    private final DepartmentRepository departmentRepository;
    private final DoctorRepository doctorRepository;

    private final PatientRepository patientRepository;

    public BookingServiceImpl(DepartmentRepository departmentRepository, DoctorRepository doctorRepository, PatientRepository patientRepository) {
        this.departmentRepository = departmentRepository;
        this.doctorRepository = doctorRepository;
        this.patientRepository = patientRepository;
    }


    //Department
    @Override
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Department getDepartment(long id) {
        return departmentRepository.getReferenceById(id);
    }

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Department updateDepartment(Department department) {
        return departmentRepository.save(department);
    }




    //Doctor
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



    //Patient
    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @Override
    public Patient getPatient(long id) {
        return patientRepository.getReferenceById(id);
    }

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Patient updatePatient(Patient patient) {
        return patientRepository.save(patient);
    }
}
