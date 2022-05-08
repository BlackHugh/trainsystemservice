package com.citi.trainingsystem.entity;

import java.util.Date;

public class Interview extends DbEntity{
    private String courseId;
    private String interviewer;
    private String interviewee;
    private Date interviewDate;
    private String result;

    private Interview(){super(Interview.class);}

    public String getCourseId() {
        return courseId;
    }

    public Interview setCourseId(String courseId) {
        this.courseId = courseId;
        return this;
    }

    public String getInterviewer() {
        return interviewer;
    }

    public Interview setInterviewer(String interviewer) {
        this.interviewer = interviewer;
        return this;
    }

    public String getInterviewee() {
        return interviewee;
    }

    public Interview setInterviewee(String interviewee) {
        this.interviewee = interviewee;
        return this;
    }

    public Date getInterviewDate() {
        return interviewDate;
    }

    public Interview setInterviewDate(Date interviewDate) {
        this.interviewDate = interviewDate;
        return this;
    }

    public String getResult() {
        return result;
    }

    public Interview setResult(String result) {
        this.result = result;
        return this;
    }
}
