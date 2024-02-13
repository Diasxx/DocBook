package com.example.docbook.domain.repo;

import com.example.docbook.domain.model.Department;
import com.example.docbook.domain.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Long> {
}
