package com.developercourses.courses.Services;


import com.developercourses.courses.Dao.CourseDao;
import com.developercourses.courses.courseEntities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CourseImp implements CoursesService {
@Autowired
    private CourseDao coursedao;
//Hard-coded list for checking the functionality
/*
    List<Course> list;

    public CourseImp() {

       list = new ArrayList<>();
        list.add(new Course(145L, "Java Core Concepts", "From basics of java concepts to advanced level"));
        list.add(new Course(148L, "Java Collections", "All about collections in java"));
        list.add(new Course(141L, "Multi-threading", "Introduction to multi-threading and synchronization"));
        list.add(new Course(192L, "Exception handling", "Introduction to exception handling, checked and uncheked exceptions"));
        list.add(new Course(131L, "Object oriented programming ", "OOP- Basics to advanced"));
        list.add(new Course(144L, "Constructors", "Default vs parameterized constructors"));
        list.add(new Course(125L, "Spring boot", "creating rest api using spring boot"));
    */
        @Override
        public List<Course> getCourses () {
            /*return list ;*/
            return coursedao.findAll();
        }

        @Override
        public Course getCourse ( long Id){
       /* Course x= null;
        for(Course temp:list)
        {
            if(temp.getId()==Id)
            {
                x=temp;
                break;
            }
        }
        if(x==null)
            System.out.println("Invalid CourseId");
        return x;*/
           return coursedao.getOne(Id);
        }

        @Override
        public Course addCourse (Course New){
        /*list.add(New);
        return New;*/
            coursedao.save(New);
            return New;
        }

        @Override
        public String delCourse (Long Id){
/*
        for(Course x:list)
        {
            if(x.getId()==Id)
            {
                list.remove(x);
            }
        }

        return Long.toString(Id);
*/
            Course entity =coursedao.getOne(Id);
            coursedao.delete(entity);
            return Long.toString(Id);
        }
        @Override
        public Course updateCourse (Course course){

/*        for( Course x: list)
        {
            if(course.getId()==x.getId())
            {
                x.setCourse_name(course.getCourse_name());
                x.setDescription(course.getDescription());

                break;

            }
        }
        return course;

    }*/
            coursedao.save(course);
            return course;
        }
    }