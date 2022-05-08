package com.citi.trainingsystem.entity;

public class User extends DbEntity{
    private String name;
    private String soeId;
    private String location;
    private String phone;
    private String organization;
    private String title;
    private String permission;

    public User() {
        super(User.class);
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getSoeId() {
        return soeId;
    }

    public User setSoeId(String soeId) {
        this.soeId = soeId;
        return this;
    }

    public String getLocation() {
        return location;
    }

    public User setLocation(String location) {
        this.location = location;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public User setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getOrganization() {
        return organization;
    }

    public User setOrganization(String organization) {
        this.organization = organization;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public User setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getPermission() {
        return permission;
    }

    public User setPermission(String permission) {
        this.permission = permission;
        return this;
    }
}
