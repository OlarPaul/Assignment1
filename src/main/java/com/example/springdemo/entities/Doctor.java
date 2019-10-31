package com.example.springdemo.entities;

import javax.persistence.*;

import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "doctor")
public class Doctor {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "doctorId", unique = true, nullable = false)
    private Integer doctorId;

    @OneToMany(mappedBy = "doctor")
    private List<Caregiver> caregiverList;

    private String doctorName;

    public Doctor(){

    }

    public Doctor(List<Caregiver> caregiverList, String doctorName) {
        this.caregiverList = caregiverList;
        this.doctorName = doctorName;
    }

    public Doctor(Integer doctorId, String doctorName) {
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public List<Caregiver> getCaregiverList() {
        return caregiverList;
    }

    public void setCaregiverList(List<Caregiver> caregiverList) {
        this.caregiverList = caregiverList;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
}
