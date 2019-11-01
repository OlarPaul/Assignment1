package com.example.springdemo.controller;

import com.example.springdemo.dto.CaregiverDTO;
import com.example.springdemo.services.CaregiverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api")
public class CaregiverController {
    private final CaregiverService caregiverService;

    @Autowired
    public CaregiverController(CaregiverService caregiverService){
        this.caregiverService = caregiverService;
    }

    @GetMapping("caregiver/list/{id}")
    public CaregiverDTO findByCaregiverId(@PathVariable("id") Integer id){
        return caregiverService.findByCaregiverId(id);
    }

    @GetMapping("/caregiver/list")
    public List<CaregiverDTO> findAll(){
        return caregiverService.findAll();
    }

    @PostMapping("/caregiver/add")
    public Integer insertCaregiver(@RequestBody CaregiverDTO caregiverDTO){
        return caregiverService.insert(caregiverDTO);
    }

    @PutMapping("/customer/list/{id}")
        public Integer updateCaregiver(@RequestBody CaregiverDTO caregiverDTO, @PathVariable String id) {
        return caregiverService.update(caregiverDTO);
    }
    @DeleteMapping()
    public void deleteCaregiver(@RequestBody CaregiverDTO caregiverDTO){
        caregiverService.delete(caregiverDTO);
    }
}
