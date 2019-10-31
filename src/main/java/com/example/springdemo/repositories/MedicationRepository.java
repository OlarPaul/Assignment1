package com.example.springdemo.repositories;

import com.example.springdemo.entities.Medication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MedicationRepository extends JpaRepository<Medication, Integer> {
    Optional<Medication> findByMedicationId(Integer id);

    @Query(value = "SELECT u " +
            "FROM Medication u " +
            "ORDER BY u.medicationName")
    List<Medication> getAllOrdered();
}
