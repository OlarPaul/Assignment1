package com.example.springdemo.services;

import com.example.springdemo.dto.MedicationDTO;
import com.example.springdemo.dto.PatientDTO;
import com.example.springdemo.dto.builders.MedicationBuilder;
import com.example.springdemo.dto.builders.PatientBuilder;
import com.example.springdemo.entities.Medication;
import com.example.springdemo.entities.Patient;
import com.example.springdemo.repositories.MedicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MedicationService {

    @Autowired
    MedicationRepository medicationRepository;

    public Integer insert(MedicationDTO medicationDTO) {
        return medicationRepository.save(MedicationBuilder.generateEntityFromDTO(medicationDTO)).getMedicationId();
    }

    public Integer update(MedicationDTO medicationDTO) {
        return medicationRepository.save(MedicationBuilder.generateEntityFromDTO(medicationDTO)).getMedicationId();
    }

    public void delete(MedicationDTO medicationDTO){
        this.medicationRepository.deleteById(medicationDTO.getMedicationId());
    }

    public MedicationDTO findByMedicationId(Integer id){
        Optional<Medication> medications = medicationRepository.findByMedicationId(id);
        return MedicationBuilder.generateDTOFromEntity(medications.get());
    }

    public List<MedicationDTO> findAll(){
        List<Medication> medications = medicationRepository.getAllOrdered();
        return medications.stream().map(MedicationBuilder::generateDTOFromEntity).collect(Collectors.toList());
    }
}
