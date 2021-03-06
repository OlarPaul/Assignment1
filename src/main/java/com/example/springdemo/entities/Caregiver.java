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

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "birthDate")
    private String birthDate;

    @Column(name = "gender")
    private String gender;

    @OneToMany(mappedBy = "caregiver")
    private List<Patient> patientList;

    /*@ManyToOne
    @JoinColumn(name = "id_doctor")
    private Doctor doctor;
    */
    public Caregiver(){
    }

    public Caregiver(Integer caregiverId,String name, String address, String birthDate, String gender) {
        this.caregiverId = caregiverId;
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.address = address;
    }


    public Integer getCaregiverId() {
        return caregiverId;
    }

    public void setCaregiverId(Integer caregiverId) {
        this.caregiverId = caregiverId;
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

    public List<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(List<Patient> patientList) {
        this.patientList = patientList;
    }
    /*
    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
     */
}

