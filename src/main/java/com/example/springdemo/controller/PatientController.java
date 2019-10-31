package com.example.springdemo.controller;

import com.example.springdemo.dto.PatientDTO;
import com.example.springdemo.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "/patient")
public class PatientController {

    private final PatientService patientService;

    @Autowired
    public PatientController(PatientService patientService){
        this.patientService = patientService;
    }

    @GetMapping(value = "/{id}")
    public PatientDTO findByPatientId(@PathVariable("id") Integer id){
        return patientService.findByPatientId(id);
    }

    @PostMapping()
    public Integer insertPatient(@RequestBody PatientDTO patientDTO){
        return patientService.insert(patientDTO);
    }

    @PutMapping()
    public Integer updatePatient(@RequestBody PatientDTO patientDTO){
        return patientService.update(patientDTO);
    }

    @DeleteMapping()
    public void deletePatient(@RequestBody PatientDTO patientDTO){
        patientService.delete(patientDTO);
    }

}
