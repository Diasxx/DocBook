package com.example.docbook.domain.controller;

import com.example.docbook.domain.model.Department;
import com.example.docbook.domain.model.Doctor;
import com.example.docbook.domain.service.DepartmentService;
import com.example.docbook.domain.service.DoctorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DoctorController {
    private final DoctorService doctorService;
    private final DepartmentService departmentService;

    public DoctorController(DoctorService doctorService, DepartmentService departmentService) {
        this.doctorService = doctorService;
        this.departmentService = departmentService;
    }

    @PostMapping("/doctor")
    public Doctor saveDoctor(@RequestBody Doctor doctor){
        Department department = departmentService.getDepartment(doctor.getDepartment().getId());
        doctor.setDepartment(department);
        return doctorService.saveDoctor(doctor);
    }

    @GetMapping("/doctor")
    public List<Doctor> getAllDoctors(){
        return doctorService.getAllDoctors();
    }

}
