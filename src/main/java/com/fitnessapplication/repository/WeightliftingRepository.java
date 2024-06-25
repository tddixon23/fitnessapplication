package com.fitnessapplication.repository;


import com.fitnessapplication.model.Weightlifting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeightliftingRepository extends JpaRepository<Weightlifting, Long> {
}

