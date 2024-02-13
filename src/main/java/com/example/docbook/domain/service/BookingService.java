package com.example.docbook.domain.service;

import com.example.docbook.domain.model.Department;
import com.example.docbook.domain.model.Doctor;
import com.example.docbook.domain.model.Patient;

import java.util.List;

public interface BookingService {

    //Department
    List<Department> getAllDepartments();
    Department getDepartment(long id);
    Department saveDepartment(Department department);
    Department updateDepartment(Department department);

    //Doctor
    List<Doctor> getAllDoctors();
    Doctor getDoctor(long id);
    Doctor saveDoctor(Doctor doctor);
    Doctor updateDoctor(Doctor doctor);

    //Patient

    List<Patient> getAllPatients();
    Patient getPatient(long id);
    Patient savePatient(Patient patient);
    Patient updatePatient(Patient patient);

}
