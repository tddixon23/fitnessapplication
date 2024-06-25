package com.fitnessapplication.service;

import com.fitnessapplication.model.Weightlifting;
import com.fitnessapplication.repository.WeightliftingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeightliftingService {

    @Autowired
    private WeightliftingRepository weightliftingRepository;

    public List<Weightlifting> getAllWeightlifting() {
        return weightliftingRepository.findAll();
    }

    public Weightlifting saveWeightlifting(Weightlifting weightlifting) {
        return weightliftingRepository.save(weightlifting);
    }
}

