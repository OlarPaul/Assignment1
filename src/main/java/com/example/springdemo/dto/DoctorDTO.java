package com.example.springdemo.dto;

import java.util.List;

public class DoctorDTO {
    private Integer doctorId;
    private String doctorName;
    private List<CaregiverDTO> caregivers;

    public DoctorDTO(Integer doctorId, String doctorName, List<CaregiverDTO> caregivers) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.caregivers = caregivers;
    }

    public DoctorDTO() {
    }

    public DoctorDTO(Integer doctorId, String doctorName) {
        this.doctorName = doctorName;
        this.doctorId = doctorId;
    }


    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public List<CaregiverDTO> getCaregivers() {
        return caregivers;
    }

    public void setCaregivers(List<CaregiverDTO> caregivers) {
        this.caregivers = caregivers;
    }
}
