package com.example.springdemo.entities;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;


@Entity
@Table(name = "medication")
public class Medication {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "medicationId", unique = true, nullable = false)
    private Integer medicationId;

    @Column(name = "medicatioName", length = 100, unique=true, nullable = false)
    private String medicationName;

    @Column(name = "dosage")
    private String dosage;

    @Column(name = "sideEffects")
    private String sideEffects;

    /*OneToMany(mappedBy = "medication")
    private intakeMedication intakeMedication;
    */

    public Medication() {
    }

    public Medication(Integer medicationId, String medicationName, String dosage, String sideEffects) {
        this.medicationName = medicationName;
        this.dosage = dosage;
        this.sideEffects = sideEffects;
        this.medicationId = medicationId;
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

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getSideEffects() {
        return sideEffects;
    }

    public void setSideEffects(String sideEffects) {
        this.sideEffects = sideEffects;
    }



    @Override
    public String toString() {
        return "Medication{" +
                "medicationId=" + medicationId +
                ", medicationName='" + medicationName + '\'' +
                ", dosage='" + dosage + '\'' +
                ", sideEffects='" + sideEffects + '\'' +
                '}';
    }
}
