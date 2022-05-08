package com.citi.trainingsystem.entity;

import com.citi.trainingsystem.utility.IdGenerator;

import javax.persistence.Column;
import javax.persistence.Id;

public class DbEntity {
    @Id
    @Column(name = "id", nullable = false)
    private String id;

    protected DbEntity(Class childClass){
        this.id = IdGenerator.generateUniqueId(childClass.getClass().hashCode());
    }

    public String getId() {
        return id;
    }

    public DbEntity setId(String id) {
        this.id = id;
        return this;
    }
}
