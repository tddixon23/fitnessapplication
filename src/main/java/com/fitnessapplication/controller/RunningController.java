package com.fitnessapplication.controller;

import com.fitnessapplication.model.Running;
import com.fitnessapplication.service.RunningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/running")
public class RunningController {

    @Autowired
    private RunningService runningService;

    @GetMapping
    public List<Running> getAllRunning() {
        return runningService.getAllRunning();
    }

    @PostMapping
    public Running createRunning(@RequestBody Running running) {
        return runningService.saveRunning(running);
    }
}
