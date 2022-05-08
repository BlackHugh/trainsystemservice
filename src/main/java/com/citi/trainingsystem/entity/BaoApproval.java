package com.citi.trainingsystem.entity;

public class BaoApproval extends DbEntity {
    private String id;
    private String courseId;
    private String status;
    private String approver;
    private String approveDate;

    public BaoApproval(){
        super(BaoApproval.class);
    }

    public String getId() {
        return id;
    }

    public BaoApproval setId(String id) {
        this.id = id;
        return this;
    }

    public String getCourseId() {
        return courseId;
    }

    public BaoApproval setCourseId(String courseId) {
        this.courseId = courseId;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public BaoApproval setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getApprover() {
        return approver;
    }

    public BaoApproval setApprover(String approver) {
        this.approver = approver;
        return this;
    }

    public String getApproveDate() {
        return approveDate;
    }

    public BaoApproval setApproveDate(String approveDate) {
        this.approveDate = approveDate;
        return this;
    }
}
