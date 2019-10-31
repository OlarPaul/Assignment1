package com.example.springdemo.dto.builders;

import com.example.springdemo.dto.PatientDTO;
import com.example.springdemo.entities.Patient;

import java.util.List;

public class PatientBuilder {

    private PatientBuilder() {
    }

    public static PatientDTO generateDTOFromEntity(Patient patient){
        return new PatientDTO(
                patient.getIdPatient(),
                patient.getName(),
                patient.getBirthDate(),
                patient.getGender(),
                patient.getAddress(),
                patient.getMedicalRecord());
    }

    public static Patient generateEntityFromDTO(PatientDTO patientDTO){
        return new Patient(
                patientDTO.getId(),
                patientDTO.getName(),
                patientDTO.getBirthDate(),
                patientDTO.getGender(),
                patientDTO.getAddress(),
                patientDTO.getMedicalRecord());
    }
    public static PatientDTO generateDTOFromEntityWithCaregiver(Patient patient) {
        return new PatientDTO(
                patient.getIdPatient(),
                patient.getName(),
                patient.getBirthDate(),
                patient.getGender(),
                patient.getAddress(),
                patient.getMedicalRecord(),
                CaregiverBuilder.generateDTOFromEntity(patient.getCaregiver()));
    }

}
