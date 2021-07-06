package com.example.Course.services;

import com.example.Course.models.Course;
import com.example.Course.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    CourseRepository courseRepository;

    public CourseServiceImpl(){}

    @Autowired
    public CourseServiceImpl(CourseRepository courseRepository) { this.courseRepository = courseRepository;}

    @Override
    public List<Course> getAllCourses() {

        List<Course> courses = courseRepository.getAllCourses();

        return courses;
    }

    @Override
    public Course createCourse(Course course) {

        Course createdCourse = courseRepository.createCourse(course);

        return createdCourse;
    }

    @Override
    public Course getCourseById(int id) {

        Course course = courseRepository.getCourseById(id);

        return course;
    }

    @Override
    public Course deleteCourseById(int id) {

        Course deletedCourse = courseRepository.deleteCourseById(id);

        return deletedCourse;
    }

    @Override
    public Course updateCourse(Course course) {

        Course updatedCourse = courseRepository.updateCourse(course);

        return updatedCourse;
    }
}
