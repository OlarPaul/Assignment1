package com.example.springdemo.dto;

public class MedicationDTO {
    private Integer medicationId;
    private String medicationName;
    private String sideEffects;
    private String dosage;

    public MedicationDTO() {
    }

    public MedicationDTO(Integer medicationId, String medicationName, String sideEffects, String dosage) {
        this.medicationId = medicationId;
        this.medicationName = medicationName;
        this.sideEffects = sideEffects;
        this.dosage = dosage;
    }

    public Integer getMedicationId() {
        return medicationId;
    }

    public void setMedicationId(Integer medicationId) {
        this.medicationId = medicationId;
    }

    public String getMedicationName() {
        return medicationName;
    }

    public void setMedicationName(String medicationName) {
        this.medicationName = medicationName;
    }

    public String getSideEffects() {
        return sideEffects;
    }

    public void setSideEffects(String sideEffects) {
        this.sideEffects = sideEffects;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }
}
