package com.spring.retrieve.service;

import com.java.spring.entity.EmployeeEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public class EmployeeDaoService {

    private static List<EmployeeEntity> employees = new ArrayList<>();

    public EmployeeDaoService() {
    }

    static  {
        employees.add(new EmployeeEntity("emp1", "SSE"));
        employees.add(new EmployeeEntity("emp2", "TSE"));
    }

    public EmployeeEntity findEmp(String name) {
        for(EmployeeEntity e : employees) {
            if(e.getEmployeeName() == name) {
                return e;
            }
        }
        return null;
    }

    @PersistenceContext
    private EntityManager entityManager;

    public long insert(EmployeeEntity employee) {
        entityManager.persist(employee);

        return employee.getId();
    }
}
