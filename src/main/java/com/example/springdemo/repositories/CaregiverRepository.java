package com.example.springdemo.repositories;

import com.example.springdemo.entities.Caregiver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CaregiverRepository extends JpaRepository<Caregiver, Integer> {

    Optional<Caregiver> findByCaregiverId(Integer id);

    @Query(value = "SELECT u " +
            "FROM Caregiver u " +
            "ORDER BY u.caregiverName")
    List<Caregiver> getAllOrdered();
}
