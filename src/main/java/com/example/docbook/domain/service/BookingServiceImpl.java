package com.example.docbook.domain.service;

import com.example.docbook.domain.model.*;
import com.example.docbook.domain.repo.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService{

    private final DepartmentRepository departmentRepository;
    private final DoctorRepository doctorRepository;
    private final PatientRepository patientRepository;
    private final ScheduleRepository scheduleRepository;
    private final RecordsRepository recordsRepository;
    private final TherapyRepository therapyRepository;
    public BookingServiceImpl(DepartmentRepository departmentRepository,
                              DoctorRepository doctorRepository,
                              PatientRepository patientRepository,
                              ScheduleRepository scheduleRepository,
                              RecordsRepository recordsRepository,
                              TherapyRepository therapyRepository) {
        this.departmentRepository = departmentRepository;
        this.doctorRepository = doctorRepository;
        this.patientRepository = patientRepository;
        this.scheduleRepository = scheduleRepository;
        this.recordsRepository=recordsRepository;
        this.therapyRepository=therapyRepository;
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


    // Schedule


    @Override
    public List<Schedule> getAllSchedules() {
        return scheduleRepository.findAll();
    }

    @Override
    public Schedule getSchedule(long id) {
        return scheduleRepository.getReferenceById(id);
    }

    @Override
    public Schedule saveSchedule(Schedule schedule) {
        return scheduleRepository.save(schedule);
    }

    @Override
    public Schedule updateSchedule(Schedule schedule) {
        return scheduleRepository.save(schedule);
    }


    //Records

    @Override
    public List<Records> getAllRecords() {
        return recordsRepository.findAll();
    }

    @Override
    public Records getRecord(long id) {
        return recordsRepository.getReferenceById(id);
    }

    @Override
    public Records saveRecords(Records records) {
        return recordsRepository.save(records);
    }

    @Override
    public Records updateRecords(Records records) {
        return recordsRepository.save(records);
    }



    // Therapy
    @Override
    public List<Therapy> getAllTherapy() {
        return therapyRepository.findAll();
    }

    @Override
    public Therapy getTherapy(long id) {
        return therapyRepository.getReferenceById(id);
    }

    @Override
    public Therapy saveTherapy(Therapy therapy) {
        return therapyRepository.save(therapy);
    }

    @Override
    public Therapy updateTherapy(Therapy therapy) {
        return therapyRepository.save(therapy);
    }
}
