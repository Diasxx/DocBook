package com.example.docbook.view.controller;

import com.example.docbook.domain.model.Department;
import com.example.docbook.domain.model.Doctor;
import com.example.docbook.domain.service.DepartmentService;
import com.example.docbook.domain.service.DoctorService;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class DoctorController {
    private final DoctorService doctorService;
    private final DepartmentService departmentService;

    public DoctorController(DoctorService doctorService, DepartmentService departmentService) {
        this.doctorService = doctorService;
        this.departmentService = departmentService;
    }

    @PostMapping("/saveDoctor")
    public String saveDoctor(@ModelAttribute Doctor doctor,@RequestParam(name = "departmentId") long departmentId){
        doctor.setDepartment(departmentService.getDepartment(departmentId));
        doctorService.saveDoctor(doctor);
        return "redirect:/doctors";
    }

    @GetMapping("/department/{departmentId}")
    public String getAllDoctors(Model model,@PathVariable(name = "departmentId") Long departmentId){
        Doctor doctor =  new Doctor();
        model.addAttribute("doctor", doctor);
        model.addAttribute("doctors", doctorService.getAllDoctorsByDepartmentId(departmentId));
        return "doctor";
    }

}
