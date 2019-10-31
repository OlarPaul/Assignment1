package com.example.springdemo.dto;

import com.example.springdemo.entities.Caregiver;

import java.util.Objects;

public class PatientDTO {

    private Integer id;
    private String name;
    private String birthDate;
    private String gender;
    private String address;
    private String medicalRecord;
    private CaregiverDTO caregiverDTO;

    public PatientDTO() {
    }

    public PatientDTO(Integer id, String name, String address, String birthDate, String gender, String medicalRecord) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.birthDate = birthDate;
        this.gender = gender;
        this.medicalRecord = medicalRecord;
    }
    public PatientDTO(Integer id, String name, String address, String birthDate, String gender, String medicalRecord, CaregiverDTO caregiverDTO){
        this.id = id;
        this.name = name;
        this.address = address;
        this.birthDate = birthDate;
        this.gender = gender;
        this.medicalRecord = medicalRecord;
        this.caregiverDTO = caregiverDTO;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(String medicalRecord) {
        this.medicalRecord = medicalRecord;
    }

    public CaregiverDTO getCaregiverDTO() {
        return caregiverDTO;
    }

    public void setCaregiverDTO(CaregiverDTO caregiverDTO) {
        this.caregiverDTO = caregiverDTO;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PatientDTO patientDTO = (PatientDTO) o;
        return Objects.equals(id, patientDTO.id) &&
                Objects.equals(name, patientDTO.name) &&
                Objects.equals(gender, patientDTO.gender) &&
                Objects.equals(birthDate, patientDTO.birthDate) &&
                Objects.equals(address, patientDTO.address) &&
                Objects.equals(medicalRecord, patientDTO.medicalRecord) &&
                Objects.equals(caregiverDTO, patientDTO.caregiverDTO);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, gender, birthDate, address, medicalRecord, caregiverDTO);
    }
}
