package com.example.Course.repositories;

import com.example.Course.models.Course;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CourseRepositoryImpl implements CourseRepository{

    public static List<Course> courses = new ArrayList<>();

    public CourseRepositoryImpl() {
        courses.add(new Course(1, "Java Basics", "Niveau 100", "Jan de Vries"));
        courses.add(new Course(2, "Java Advanced", "Niveau 200", "Bas de Hoop"));
    }

    @Override
    public List<Course> getAllCourses() {

        return courses;
    }

    @Override
    public Course createCourse(Course course) {

        courses.add(course);

        return course;
    }

    @Override
    public Course getCourseById(int id) {

        for (Course course: courses) {

            if(course.getId() == id){
                return  course;
            }
        }

        return null;
    }

    @Override
    public Course deleteCourseById(int id) {

        Course courseToBeRemoved = getCourseById(id);
        courses.remove(courseToBeRemoved);

        return courseToBeRemoved;
    }

    @Override
    public Course updateCourse(Course course) {

        Course courseToBeUpdated = getCourseById(course.getId());

        courseToBeUpdated.setTitle(course.getTitle());
        courseToBeUpdated.setLevel(course.getLevel());
        courseToBeUpdated.setTeacher(course.getTeacher());

        return courseToBeUpdated;
    }
}
