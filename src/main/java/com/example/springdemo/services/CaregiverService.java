package com.example.springdemo.services;

import com.example.springdemo.dto.CaregiverDTO;
import com.example.springdemo.dto.builders.CaregiverBuilder;
import com.example.springdemo.entities.Caregiver;
import com.example.springdemo.repositories.CaregiverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CaregiverService {

    @Autowired
    CaregiverRepository caregiverRepository;

    public Integer insert(CaregiverDTO caregiverDTO){
        return caregiverRepository.save(CaregiverBuilder.generateEntityFromDTO(caregiverDTO)).getCaregiverId();
    }

    public Integer update(CaregiverDTO caregiverDTO){
        return caregiverRepository.save(CaregiverBuilder.generateEntityFromDTO(caregiverDTO)).getCaregiverId();
    }

    public void delete(CaregiverDTO caregiverDTO){
        this.caregiverRepository.deleteById(caregiverDTO.getCaregiverId());
    }

    public List<CaregiverDTO> findAll(){
        List<Caregiver> caregivers = caregiverRepository.getAllOrdered();
        return caregivers.stream().map(CaregiverBuilder::generateDTOFromEntity).collect(Collectors.toList());
    }

    public CaregiverDTO findByCaregiverId(Integer id){
        Optional <Caregiver> caregiver = caregiverRepository.findByCaregiverId(id);
        return CaregiverBuilder.generateDTOFromEntity(caregiver.get());
    }

}
