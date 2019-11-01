package com.example.springdemo.services;

import com.example.springdemo.SpringDemoApplicationTests;
import com.example.springdemo.dto.CaregiverDTO;
import com.example.springdemo.dto.MedicationDTO;
import com.example.springdemo.dto.PatientDTO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonServiceTest extends SpringDemoApplicationTests {

    @Autowired
    CaregiverService caregiverService;
    @Autowired
    PatientService patientService;
    @Autowired
    MedicationService medicationService;

    @Test
    public void insertDTOGoodCare() {
        CaregiverDTO caregiverDTO = new CaregiverDTO();
        caregiverDTO.setName("John Patterson");
        caregiverDTO.setGender("Male");
        caregiverDTO.setBirthDate("15.05.2019");
        caregiverDTO.setAddress("George Baritiu nr. 22");
        Integer id = caregiverService.insert(caregiverDTO);
        CaregiverDTO person2 = caregiverService.findByCaregiverId(id);
        assert(!caregiverDTO.equals(person2));

    }

    @Test
    public void insertDTOGoodPat() {
        PatientDTO patientDTO = new PatientDTO();
        patientDTO .setName("John Patterson");
        patientDTO .setGender("Male");
        patientDTO.setBirthDate("15.05.2019");
        patientDTO.setAddress("George Baritiu nr. 22");
        patientDTO.setMedicalRecord("Cancer");
        Integer id = patientService.insert(patientDTO);
        PatientDTO person3 = patientService.findByPatientId(id);
        assert(!patientDTO.equals(person3));

    }

    @Test
    public void insertDTOGoodMed() {
        MedicationDTO medicationDTO = new MedicationDTO();
        medicationDTO.setMedicationName("Paracetamol");
        medicationDTO.setDosage("De 3 ori pe zi");
        medicationDTO.setSideEffects("Inflamatii");
        Integer id = medicationService.insert(medicationDTO);
        MedicationDTO medication  = medicationService.findByMedicationId(id);
        assert(!medicationDTO.equals(medication));

    }

}
