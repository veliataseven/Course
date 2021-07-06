package com.example.Course.services;

import com.example.Course.models.Course;

import java.util.List;

public interface CourseService {

    public List<Course> getAllCourses();

    public Course createCourse(Course room);

    public Course getCourseById(int id);

    public Course deleteCourseById(int id);

    public Course updateCourse(Course course);
}
