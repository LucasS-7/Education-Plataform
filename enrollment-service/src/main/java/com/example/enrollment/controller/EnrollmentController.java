package com.example.enrollment.controller;

import com.example.enrollment.model.Enrollment;
import com.example.enrollment.service.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enrollments")
public class EnrollmentController {

    @Autowired
    private EnrollmentService service;

    @GetMapping
    public List<Enrollment> getEnrollments() {
        return service.getAllEnrollments();
    }

    @PostMapping
    public Enrollment addEnrollment(@RequestBody Enrollment enrollment) {
        return service.saveEnrollment(enrollment);
    }
}