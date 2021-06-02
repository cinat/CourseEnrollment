package com.developercourses.courses.Dao;

import com.developercourses.courses.courseEntities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course,Long> {
}
