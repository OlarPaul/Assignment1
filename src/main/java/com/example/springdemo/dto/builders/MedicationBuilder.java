package com.example.springdemo.dto.builders;

import com.example.springdemo.dto.MedicationDTO;
import com.example.springdemo.entities.Medication;

public class MedicationBuilder {

    public static MedicationDTO generateDTOFromEntity(Medication medication){
        return new MedicationDTO(
                medication.getMedicationId(),
                medication.getMedicationName(),
                medication.getSideEffects(),
                medication.getDosage());
    }

    public static Medication generateEntityFromDTO(MedicationDTO medicationDTO){
        return new Medication(
                medicationDTO.getMedicationId(),
                medicationDTO.getMedicationName(),
                medicationDTO.getSideEffects(),
                medicationDTO.getDosage());
    }
}
