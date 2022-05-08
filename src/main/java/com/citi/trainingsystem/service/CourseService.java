package com.citi.trainingsystem.service;

import com.citi.trainingsystem.entity.Course;
import com.citi.trainingsystem.repository.CourseRepository;
import com.citi.trainingsystem.utility.IdGenerator;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public List<Course> findAll(){
        return new ArrayList<Course>((Collection<Course>) courseRepository.findAll());
    }

    public Optional<Course> findById(String id){
        return courseRepository.findById(id);
    }

    public Course createCourse(Course course){
        if(StringUtils.isEmpty(course.getId()) || courseRepository.findById(course.getId()).isPresent()){
            course.setId(IdGenerator.generateUniqueId(Course.class.hashCode()));
        }
        return courseRepository.save(course);
    }

    public Course updateCourse(String id, Course course) throws NotFoundException {
        if(StringUtils.isEmpty(id)){
            throw new InvalidParameterException("Provided id is invalid.");
        }
        Optional<Course> optionalCourse = courseRepository.findById(id);
        if(!optionalCourse.isPresent()){
            throw new NotFoundException("The course is not found.");
        }
        return courseRepository.save(course.setId(id));
    }

    public void deleteAllById(List<String> courseIdList){
        if(courseIdList==null){
            return;
        }
        courseRepository.deleteByIdInList(courseIdList);
    }
}
