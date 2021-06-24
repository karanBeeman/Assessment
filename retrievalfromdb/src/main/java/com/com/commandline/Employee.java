package com.com.commandline;

import com.java.spring.entity.EmployeeEntity;

public class Employee {

     private Long id;

     private String employeeName;

     private String employeeDesignation;

     private EmployeeEntity employeeEntity;

    public Long getId() {
        return this.employeeEntity.getId();
    }

    public void setId(Long id) {
        this.employeeEntity.setId(id);
    }

    public String getEmployeeName() {
        return this.employeeEntity.getEmployeeName();
    }

    public void setEmployeeName(String employeeName) {
        this.employeeEntity.setEmployeeName(employeeName);
    }

    public String getEmployeeDesignation() {
        return this.employeeEntity.getEmployeeDesignation();
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeEntity.setEmployeeDesignation(employeeDesignation);
    }

    public EmployeeEntity getEmployeeEntity() {
        return employeeEntity;
    }

    public void setEmployeeEntity(EmployeeEntity employeeEntity) {
        this.employeeEntity = employeeEntity;
    }
}
