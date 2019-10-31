package com.example.springdemo.entities;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer idPatient;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "address", nullable = false, unique=true, length = 200)
    private String address;

    @Column(name = "birth_date")
    private String birthDate;

    @Column(name = "gender")
    private String gender;

    @Column(name = "medicalRecord")
    private String medicalRecord;

    @ManyToOne()
    @JoinColumn(name = "caregiver_id")
    private Caregiver caregiver;


    public Patient() {
    }

    public Patient(Integer idPatient, String name, String address, String birthDate, String gender, String medicalRecord) {
        this.idPatient = idPatient;
        this.name = name;
        this.address = address;
        this.birthDate = birthDate;
        this.gender = gender;
        this.medicalRecord = medicalRecord;
    }

    public Patient(Integer id, String name, String gender) {
        this.idPatient = id;
        this.name = name;
        this.gender = gender;
    }

    public Integer getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(Integer idPatient) {
        this.idPatient = idPatient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Caregiver getCaregiver() {
        return caregiver;
    }

    public void setCaregiver(Caregiver caregiver) {
        this.caregiver = caregiver;
    }

    public String getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(String medicalRecord) {
        this.medicalRecord = medicalRecord;
    }


}
