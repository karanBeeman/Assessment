package com.com.commandline;

import com.spring.retrieve.service.EmployeeDaoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunner  {

    private static final Logger log = LoggerFactory.getLogger(CommandLineRunner.class);

    @Autowired
    private EmployeeDaoService employeeDaoService;


//    @Override
//    public void run(String... args) throws Exception {
//        EmployeeEntity employee = new EmployeeEntity("karan", "ASE");
//         employeeDaoService.insert(employee);
//         log.info("new employee :" +  employee);
//    }
}
