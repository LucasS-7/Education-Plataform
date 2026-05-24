package com.example.enrollment.service;

import com.example.enrollment.model.Enrollment;
import com.example.enrollment.repository.EnrollmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrollmentService {

    @Autowired
    private EnrollmentRepository repository;

    public List<Enrollment> getAllEnrollments() {
        return repository.findAll();
    }

    public Enrollment saveEnrollment(Enrollment enrollment) {
        return repository.save(enrollment);
    }
}