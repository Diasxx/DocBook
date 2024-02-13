package com.example.docbook.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="department_id")
    private Department department;
    private String email;
    private String password;

    @JsonIgnore
    @OneToMany(mappedBy = "doctor")
    private List<Schedule> schedule;

    @JsonIgnore
    @OneToMany(mappedBy = "doctor")
    private List<Records> records;
}
