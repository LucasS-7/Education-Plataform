package com.example.course.controller;

import com.example.course.model.Course;
import com.example.course.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseService service;

    @GetMapping
    public List<Course> getCourses() {
        return service.getAllCourses();
    }

    @PostMapping
    public Course addCourse(@RequestBody Course course) {
        return service.saveCourse(course);
    }
}