package com.example.Course.models;

public class Course {

    private int id;
    private String title;
    private String level;
    private String teacher;

    public Course(int id, String title, String level, String teacher) {
        this.id = id;
        this.title = title;
        this.level = level;
        this.teacher = teacher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", level='" + level + '\'' +
                ", teacher='" + teacher + '\'' +
                '}';
    }
}
