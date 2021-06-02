package com.developercourses.courses.Services;

import com.developercourses.courses.courseEntities.Course;
import org.springframework.stereotype.Service;

import java.util.List;
public interface CoursesService {
    public List<Course> getCourses();

   public Course getCourse(long Id);
   public Course addCourse(Course New);
   public String delCourse(Long Id);
   public Course updateCourse(Course course);
}
