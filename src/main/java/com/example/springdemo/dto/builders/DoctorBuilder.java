package com.example.springdemo.dto.builders;

import com.example.springdemo.dto.DoctorDTO;
import com.example.springdemo.entities.Doctor;

public class DoctorBuilder {
    public DoctorBuilder(){

    }

    public static DoctorDTO generateDTOFromEntity(Doctor doctor) {
        return new DoctorDTO(
                doctor.getDoctorId(),
                doctor.getDoctorName()
        );
    }

    public static Doctor generateEntityFromDTO(DoctorDTO doctorDTO) {

        return new Doctor(
                doctorDTO.getDoctorId(),
                doctorDTO.getDoctorName()
        );
    }

}
