package com.citi.trainingsystem.entity;



import com.citi.trainingsystem.utility.IdGenerator;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name="course")
public class Course {

    @Id
    @Column(name = "id", nullable = false)
    private String id;

    private String name;
    private String bu;
    private int confirmedCost;
    private Date trainingDate;
    private String trainer;
    private String interview;
    private String status;
    private String baoApproval;
    private String poNumber;

//    @JsonIgnore
//    private List<CourseHistory> courseHistories;

    public Course(){
        this.id = IdGenerator.generateUniqueId(Course.class.hashCode());
    }

    public Course(String id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Course setName(String name) {
        this.name = name;
        return this;
    }

    public String getBu() {
        return bu;
    }

    public Course setBu(String bu) {
        this.bu = bu;
        return this;
    }

    public int getConfirmedCost() {
        return confirmedCost;
    }

    public Course setConfirmedCost(int confirmedCost) {
        this.confirmedCost = confirmedCost;
        return this;
    }

    public Date getTrainingDate() {
        return trainingDate;
    }

    public Course setTrainingDate(Date trainingDate) {
        this.trainingDate = trainingDate;
        return this;
    }

    public String getTrainer() {
        return trainer;
    }

    public Course setTrainer(String trainer) {
        this.trainer = trainer;
        return this;
    }

    public String getInterview() {
        return interview;
    }

    public Course setInterview(String interview) {
        this.interview = interview;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public Course setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getBaoApproval() {
        return baoApproval;
    }

    public Course setBaoApproval(String baoApproval) {
        this.baoApproval = baoApproval;
        return this;
    }

    public String getPoNumber() {
        return poNumber;
    }

    public Course setPoNumber(String poNumber) {
        this.poNumber = poNumber;
        return this;
    }

    public String getId() {
        return id;
    }

    public Course setId(String id) {
        this.id = id;
        return this;
    }

//    //班级与学生是一对多的关联，mappedBy对应Stu表中clazz字段
//    @OneToMany(cascade= CascadeType.ALL,mappedBy="course")
//    public List<CourseHistory> getCourseHistories() {
//        return courseHistories;
//    }
//
//    public Course setCourseHistories(List<CourseHistory> courseHistories) {
//        this.courseHistories = courseHistories;
//        return this;
//    }
}
