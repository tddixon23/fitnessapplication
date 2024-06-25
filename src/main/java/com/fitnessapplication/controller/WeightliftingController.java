package com.fitnessapplication.controller;

import com.fitnessapplication.model.Weightlifting;
import com.fitnessapplication.service.WeightliftingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/weightlifting")
public class WeightliftingController {

    @Autowired
    private WeightliftingService weightliftingService;

    @GetMapping
    public List<Weightlifting> getAllWeightlifting() {
        return weightliftingService.getAllWeightlifting();
    }

    @PostMapping
    public Weightlifting createWeightlifting(@RequestBody Weightlifting weightlifting) {
        return weightliftingService.saveWeightlifting(weightlifting);
    }
}
