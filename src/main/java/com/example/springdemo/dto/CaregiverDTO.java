package com.example.springdemo.dto;

import java.util.List;
import java.util.Objects;

public class CaregiverDTO {
    private Integer caregiverId;
    private String name;
    private String birthDate;
    private String gender;
    private String address;
    //private DoctorDTO doctor;
    //private List<PatientDTO> patientList;

    public CaregiverDTO() {
    }

    public CaregiverDTO(Integer caregiverId, String name, String address,String birthDate, String gender) {
        this.caregiverId  = caregiverId;
        this.name = name;
        this.address = address;
        this.birthDate = birthDate;
        this.gender = gender;

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

    /*public DoctorDTO getDoctor() {
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
    */
    @Override
    public int hashCode() {
        return Objects.hash(caregiverId,name,address,birthDate,gender);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CaregiverDTO caregiverDTO = (CaregiverDTO) o;
        return Objects.equals(caregiverId, caregiverDTO.caregiverId) &&
                Objects.equals(name, caregiverDTO.name) &&
                Objects.equals(address, caregiverDTO.address)&&
                Objects.equals(birthDate, caregiverDTO.birthDate) &&
                Objects.equals(gender, caregiverDTO.gender);

    }
}

