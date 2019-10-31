package com.example.springdemo.controller;

import com.example.springdemo.dto.MedicationDTO;
import com.example.springdemo.services.MedicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/medication")
public class MedicationController {
    private final MedicationService medicationService;

    @Autowired
    public MedicationController(MedicationService medicationService){
        this.medicationService = medicationService;
    }

    @GetMapping(value = "{id}")
    public MedicationDTO findByMedicationId(@PathVariable("id")Integer id){
        return medicationService.findByMedicationId(id);
    }

    @GetMapping()
    public List<MedicationDTO> findAll(){
        return medicationService.findAll();
    }

    @PostMapping()
    public Integer insertMedication(@RequestBody MedicationDTO medicationDTO){
        return medicationService.insert(medicationDTO);
    }
    @PutMapping()
    public Integer updateMedication(@RequestBody MedicationDTO medicationDTO){
        return medicationService.update(medicationDTO);
    }

    @DeleteMapping()
    public void deleteMedication(@RequestBody MedicationDTO medicationDTO){
        medicationService.delete(medicationDTO);
    }
}
