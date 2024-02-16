package com.example.docbook.domain.repo;

import com.example.docbook.domain.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Long> {
    List<Doctor> getDoctorsByDepartmentId(long id);
}
