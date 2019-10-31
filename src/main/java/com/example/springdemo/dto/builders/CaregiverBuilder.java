package com.example.springdemo.dto.builders;

import com.example.springdemo.dto.CaregiverDTO;
import com.example.springdemo.entities.Caregiver;


public class CaregiverBuilder {
    private CaregiverBuilder() {
    }

    public static CaregiverDTO generateDTOFromEntity(Caregiver caregiver){
        return new CaregiverDTO(
                caregiver.getCaregiverId(),
                caregiver.getCaregiverName(),
                caregiver.getBirthDate(),
                caregiver.getGender(),
                caregiver.getAddress());
    }

    public static Caregiver generateEntityFromDTO(CaregiverDTO caregiverDTO){
        return new Caregiver(
                caregiverDTO.getCaregiverId(),
                caregiverDTO.getCaregiverName(),
                caregiverDTO.getBirthDate(),
                caregiverDTO.getGender(),
                caregiverDTO.getAddress());
    }

    public static CaregiverDTO generateDTOFromEntityWithDoc(Caregiver caregiver){
        return new CaregiverDTO(
                caregiver.getCaregiverId(),
                caregiver.getAddress(),
                caregiver.getGender(),
                caregiver.getCaregiverName(),
                caregiver.getBirthDate(),
                DoctorBuilder.generateDTOFromEntity(caregiver.getDoctor()));
    }
}

