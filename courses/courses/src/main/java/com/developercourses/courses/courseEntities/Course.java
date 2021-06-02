package com.developercourses.courses.courseEntities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
    @Id
    private Long Id;
    private String course_name;
    private String Description;


    public Course(Long id, String course_name, String description) {
        Id = id;
        this.course_name = course_name;
        this.Description = description;
    }

    public Course() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    @Override
    public String toString() {
        return "Course{" +
                "Id=" + Id +
                ", course_name='" + course_name + '\'' +
                ", Description='" + Description + '\'' +
                '}';
    }
}
