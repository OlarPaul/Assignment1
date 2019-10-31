package com.example.springdemo.entities;

import javax.persistence.*;

import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "caregiver")
public class Caregiver {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "caregiverId", unique = true, nullable = false)
    private Integer caregiverId;

    @Column(name = "caregiverName", nullable = false, length = 100)
    private String caregiverName;

    @Column(name = "address", nullable = false, unique=true, length = 200)
    private String address;

    @Column(name = "birthDate")
    private String birthDate;

    @Column(name = "gender")
    private String gender;

    @OneToMany(mappedBy = "caregiver")
    private List<Patient> patientList;

    @ManyToOne
    @JoinColumn(name = "id_doctor")
    private Doctor doctor;

    public Caregiver(){
    }

    public Caregiver(Integer caregiverId,String caregiverName, String address, String birthDate, String gender) {
        this.caregiverId = caregiverId;
        this.caregiverName= caregiverName;
        this.address = address;
        this.birthDate = birthDate;
        this.gender = gender;
    }

    public Caregiver(Integer caregiverId, String caregiverName, String gender) {
        this.caregiverId = caregiverId;
        this.caregiverName = caregiverName;
        this.gender = gender;
    }


    public Integer getCaregiverId() {
        return caregiverId;
    }

    public void setCaregiverId(Integer caregiverId) {
        this.caregiverId = caregiverId;
    }

    public String getCaregiverName() {
        return caregiverName;
    }

    public void setCaregiverName(String caregiverName) {
        this.caregiverName = caregiverName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(List<Patient> patientList) {
        this.patientList = patientList;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}

