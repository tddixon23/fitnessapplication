package com.fitnessapplication.service;

import com.fitnessapplication.model.Running;
import com.fitnessapplication.repository.RunningRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RunningService {

    @Autowired
    private RunningRepository runningRepository;

    public List<Running> getAllRunning() {
        return runningRepository.findAll();
    }

    public Running saveRunning(Running running) {
        return runningRepository.save(running);
    }
}

