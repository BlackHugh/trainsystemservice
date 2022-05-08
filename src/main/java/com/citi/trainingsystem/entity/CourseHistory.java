package com.citi.trainingsystem.entity;

import com.citi.trainingsystem.utility.IdGenerator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.CreatedBy;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="course_history")
public class CourseHistory {
    @Id
    @Column(name = "id", nullable = false)
    private String id;

//    @JsonIgnore
//    @ManyToOne
//    @CreatedBy
//    private Course course;
    private String courseId;

    private Date editDate;

    private String name;
    private String bu;
    private int confirmedCost;
    private Date trainingDate;
    private String trainer;
    private String interview;
    private String status;
    private String baoApproval;
    private String poNumber;

    public CourseHistory(){
        this.id = IdGenerator.generateUniqueId(Course.class.hashCode());
    }

//    public CourseHistory(String id, Course course, Date editDate, String name, String bu, int confirmedCost,
//                         Date trainingDate, String trainer, String interview, String status, String baoApproval, String poNumber) {
//        this.id = id;
//        this.course = course;
//        this.editDate = editDate;
//        this.name = name;
//        this.bu = bu;
//        this.confirmedCost = confirmedCost;
//        this.trainingDate = trainingDate;
//        this.trainer = trainer;
//        this.interview = interview;
//        this.status = status;
//        this.baoApproval = baoApproval;
//        this.poNumber = poNumber;
//    }

    public String getId() {
        return id;
    }

    public CourseHistory setId(String id) {
        this.id = id;
        return this;
    }

    public String getCourseId() {
        return courseId;
    }

    public CourseHistory setCourseId(String courseId) {
        this.courseId = courseId;
        return this;
    }

    public String getName() {
        return name;
    }

    public CourseHistory setName(String name) {
        this.name = name;
        return this;
    }

    public String getBu() {
        return bu;
    }

    public CourseHistory setBu(String bu) {
        this.bu = bu;
        return this;
    }

    public int getConfirmedCost() {
        return confirmedCost;
    }

    public CourseHistory setConfirmedCost(int confirmedCost) {
        this.confirmedCost = confirmedCost;
        return this;
    }

    public Date getTrainingDate() {
        return trainingDate;
    }

    public CourseHistory setTrainingDate(Date trainingDate) {
        this.trainingDate = trainingDate;
        return this;
    }

    public String getTrainer() {
        return trainer;
    }

    public CourseHistory setTrainer(String trainer) {
        this.trainer = trainer;
        return this;
    }

    public String getInterview() {
        return interview;
    }

    public CourseHistory setInterview(String interview) {
        this.interview = interview;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public CourseHistory setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getBaoApproval() {
        return baoApproval;
    }

    public CourseHistory setBaoApproval(String baoApproval) {
        this.baoApproval = baoApproval;
        return this;
    }

    public String getPoNumber() {
        return poNumber;
    }

    public CourseHistory setPoNumber(String poNumber) {
        this.poNumber = poNumber;
        return this;
    }

    public Date getEditDate() {
        return editDate;
    }

    public CourseHistory setEditDate(Date editDate) {
        this.editDate = editDate;
        return this;
    }

//    public Course getCourse() {
//        return course;
//    }
//
//    public CourseHistory setCourse(Course course) {
//        this.course = course;
//        return this;
//    }
}
