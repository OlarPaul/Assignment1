package com.example.springdemo.services;

import com.example.springdemo.dto.PatientDTO;
import com.example.springdemo.dto.builders.PatientBuilder;
import com.example.springdemo.entities.Patient;
import com.example.springdemo.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PatientService {

    @Autowired
    PatientRepository patientRepository;

    public Integer insert(PatientDTO patientDTO) {
        return patientRepository.save(PatientBuilder.generateEntityFromDTO(patientDTO)).getIdPatient();
    }

    public Integer update(PatientDTO patientDTO) {
        return patientRepository.save(PatientBuilder.generateEntityFromDTO(patientDTO)).getIdPatient();
    }

    public void delete(PatientDTO patientDTO){
        this.patientRepository.deleteById(patientDTO.getId());
    }

    public List<PatientDTO> findAll(){
        List<Patient> patients = patientRepository.getAllOrdered();
        return patients.stream().map(PatientBuilder::generateDTOFromEntity).collect(Collectors.toList());
    }

    public PatientDTO findByPatientId(Integer id){
        Optional <Patient> patient = patientRepository.findByIdPatient(id);
        return PatientBuilder.generateDTOFromEntity(patient.get());
    }
}
