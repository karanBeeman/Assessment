package com.java.spring.entity;

import javax.persistence.*;

@Entity
@Table(name = "Employee_Details")
public class EmployeeEntity {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "employee_name")
    private String employeeName;

    @Column(name = "employee_designation")
    private String  employeeDesignation;

    public EmployeeEntity() {
    }

    public EmployeeEntity(String employeeName, String employeeDesignation) {
        this.employeeName = employeeName;
        this.employeeDesignation = employeeDesignation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }
}
