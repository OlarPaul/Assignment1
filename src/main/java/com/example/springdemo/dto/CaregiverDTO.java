package com.example.springdemo.dto;

import com.example.springdemo.entities.Patient;

import java.util.List;
import java.util.Objects;

public class CaregiverDTO {
    private Integer caregiverId;
    private String caregiverName;
    private String birthDate;
    private String gender;
    private String address;
    private DoctorDTO doctor;
    private List<PatientDTO> patientList;

    public CaregiverDTO() {
    }

    public CaregiverDTO(Integer caregiverId, String address, String gender, String caregiverName, String birthDate, DoctorDTO doctor) {
        this.caregiverId = caregiverId;
        this.address = address;
        this.gender = gender;
        this.caregiverName = caregiverName;
        this.birthDate = birthDate;
        this.doctor = doctor;
    }


    public CaregiverDTO(Integer caregiverId, String caregiverName, String birthDate, String gender, String address) {
        this.caregiverId  = caregiverId;
        this.caregiverName = caregiverName;
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

    public String getCaregiverName() {
        return caregiverName;
    }

    public void setCaregiverName(String caregiverName) {
        this.caregiverName = caregiverName;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public DoctorDTO getDoctor() {
        return doctor;
    }

    public void setDoctor(DoctorDTO doctor) {
        this.doctor = doctor;
    }

    public List<PatientDTO> getPatientList() {
        return patientList;
    }

    public void setPatientList(List<PatientDTO> patientList) {
        this.patientList = patientList;
    }

    @Override
    public int hashCode() {
        return Objects.hash(caregiverId,caregiverName,gender,birthDate,address,doctor,patientList);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CaregiverDTO caregiverDTO = (CaregiverDTO) o;
        return Objects.equals(caregiverId, caregiverDTO.caregiverId) &&
                Objects.equals(caregiverName, caregiverDTO.caregiverName) &&
                Objects.equals(gender, caregiverDTO.gender) &&
                Objects.equals(birthDate, caregiverDTO.birthDate) &&
                Objects.equals(address, caregiverDTO.address) &&
                Objects.equals(doctor,caregiverDTO.doctor) &&
                Objects.equals(patientList,caregiverDTO.patientList);
    }
}

