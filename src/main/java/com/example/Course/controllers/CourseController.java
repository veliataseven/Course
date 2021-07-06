package com.example.Course.controllers;

import com.example.Course.models.Course;
import com.example.Course.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/academy")
public class CourseController {

    CourseService courseService;

    public CourseController(){}

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping(value = "/courses", produces = "application/json")
    public ResponseEntity<List<Course>> getCourses() {

        List<Course> courses = courseService.getAllCourses();

        return new ResponseEntity<>(courses, HttpStatus.OK);
    }

    @GetMapping(value = "/course/{id}", produces = "application/json")
    public ResponseEntity<Course> getCourseById(@PathVariable(name = "id", required = true) int id){

        Course course = courseService.getCourseById(id);

        return new ResponseEntity<Course>(course, HttpStatus.OK);
    }

    @DeleteMapping(value = "/course/{id}", produces = "application/json")
    public ResponseEntity<Course> deleteCourseById(@PathVariable(name = "id", required = true) int id){

        Course deletedCourse = courseService.deleteCourseById(id);

        return new ResponseEntity<Course>(deletedCourse, HttpStatus.OK);
    }

    @PostMapping(value = "/course", produces = "application/json", consumes = "application/json")
    public ResponseEntity<Course> createCourse(@RequestBody Course course) {

        Course createdCourse = courseService.createCourse(course);

        return new ResponseEntity<Course>(createdCourse, HttpStatus.OK);
    }

    @PutMapping(value = "/course", produces = "application/json", consumes = "application/json")
    public ResponseEntity<Course> updateCourse(@RequestBody Course course) {

        Course updatedCourse = courseService.updateCourse(course);

        return new ResponseEntity<Course>(updatedCourse, HttpStatus.OK);
    }
}
