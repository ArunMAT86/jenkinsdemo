package com.jenkinsDemo.Controller;


import com.jenkinsDemo.Entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MyController {

    @GetMapping("displayAll")
    public List<Employee> getAllEmployees(){
        Employee emp1 = new Employee();
        emp1.setName("Arun");
        emp1.setEmail("arun@gmail.com");
        ArrayList<Employee> elist = new ArrayList<Employee>();
        elist.add(emp1);
        return elist;
    }
}
