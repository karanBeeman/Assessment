package com.com.commandline;


import com.java.spring.entity.EmployeeEntity;
import com.spring.retrieve.service.EmployeeDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ControllerClass {

    @Autowired
    private EmployeeDaoService employeeDaoService;

     @PostMapping(path = "/save")
    public ResponseEntity doSaveEmployee(@RequestBody Employee employee) {
       //Long id = employeeDaoService.insert(employee);

       return ResponseEntity.ok().build();
     }

     @GetMapping(path = "employee/{name}")
    public EmployeeEntity getEmployee(@PathVariable(value = "name") String name) {
        EmployeeEntity emp =  employeeDaoService.findEmp(name);
         return emp;
     }
}
