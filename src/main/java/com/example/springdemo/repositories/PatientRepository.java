package com.example.springdemo.repositories;


import com.example.springdemo.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Integer> {
    Optional<Patient> findByIdPatient(Integer id);

    @Query(value = "SELECT u " +
            "FROM Patient u " +
            "ORDER BY u.name")
    List<Patient> getAllOrdered();
}
