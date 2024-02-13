package com.example.docbook.domain.service;

import com.example.docbook.domain.model.Patient;

import java.util.List;

public interface PatientService {
    List<Patient> getAllPatients();
    Patient getPatient(long id);
    Patient savePatient(Patient patient);
    Patient updatePatient(Patient patient);
}
