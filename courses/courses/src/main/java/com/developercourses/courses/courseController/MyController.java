package com.developercourses.courses.courseController;

import com.developercourses.courses.Services.CourseImp;
import com.developercourses.courses.Services.CoursesService;
import com.developercourses.courses.courseEntities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    CoursesService service;

    @GetMapping("/home")
    public String home(){
        return "Hello, Welcome to home page!";
    }
    @GetMapping("/courses")
    public List<Course> getCourses(){
      return this.service.getCourses();
    }
    @GetMapping("/courses/{Id}")
    public Course getCourse(@PathVariable String Id)
    {
        return this.service.getCourse(Long.parseLong(Id));
    }
    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course New)
    {
        return this.service.addCourse(New);
    }
    //using http status
    @PutMapping("/courses")
    public ResponseEntity<HttpStatus> updateCourse(@RequestBody Course temp) {
        try {
            this.service.updateCourse(temp);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch(Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }
    @DeleteMapping("/courses/{Id}")
    public String delCourse(@PathVariable String Id)
    {
        return "Course with Id " + this.service.delCourse(Long.parseLong(Id))+  " Successfully deleted.";

    }
}
