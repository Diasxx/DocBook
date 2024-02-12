package com.example.docbook.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "doctor")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "doctor_id")
    private long id;
    private String name;
    private String surname;
    private String speciality;
    private String phoneNumber;
    @ManyToOne
    @JoinColumn(name="department_id")
    private Department department;
    private String email;
    private String password;

    @OneToMany(mappedBy = "doctor")
    private List<Schedule> schedule;

    @OneToMany(mappedBy = "doctor")
    private List<Records> records;
}
