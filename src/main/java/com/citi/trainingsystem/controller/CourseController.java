package com.citi.trainingsystem.controller;

import com.citi.trainingsystem.entity.Course;
import com.citi.trainingsystem.repository.CourseRepository;
import com.citi.trainingsystem.service.CourseService;
import com.citi.trainingsystem.utility.IdGenerator;

import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.security.InvalidParameterException;
import java.util.List;

@RestController
@RequestMapping("/api/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/all")
    public ResponseEntity<Iterable<Course>> getAllCourses(){
        return ResponseEntity.ok(courseService.findAll());
    }

    @PostMapping("")
    public ResponseEntity<Course> createNewCourse(@RequestBody Course course){
        return ResponseEntity.ok(courseService.createCourse(course));
    }

    @PutMapping("/{courseId}")
    public ResponseEntity<Object> createNewCourse(@PathVariable("courseId") String courseId, @RequestBody Course course){
        try {
            return ResponseEntity.ok(courseService.updateCourse(courseId, course));
        } catch (InvalidParameterException | NotFoundException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @DeleteMapping("")
    public void deleteAllByIdList(@RequestBody List<String> courseIdList){
        courseService.deleteAllById(courseIdList);
    }
}
