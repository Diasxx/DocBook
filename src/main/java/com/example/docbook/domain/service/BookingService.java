package com.example.docbook.domain.service;

import com.example.docbook.domain.model.Department;
import com.example.docbook.domain.model.Doctor;

import javax.print.Doc;
import java.util.List;

public interface BookingService {

    //Department
    List<Department> getAllDepartments();
    Department getDepartment(long id);
    void saveDepartment(Department department);
    Department ubdateDepartment(Department department);

    //Doctor
    List<Doctor> getAllDoctors();
    Doctor getDoctor(long id);
    void saveDoctor(Doctor doctor);
    Doctor ubdateDoctor(Doctor doctor);

}
