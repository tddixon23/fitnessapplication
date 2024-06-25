// src/main/java/com/quadgodfitness/repository/RunningRepository.java
package com.fitnessapplication.repository;

import com.fitnessapplication.model.Running;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RunningRepository extends JpaRepository<Running, Long> {
}
