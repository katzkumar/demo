package com.experiment.spring.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.experiment.spring.demo.dto.Employee;


@RestController
@RequestMapping("employees")
 public class EmployeeController {

    private Employee employee = new Employee();

    @RequestMapping(value="/{name}", method = RequestMethod.GET, produces = "application/json")
    public Employee getEmployee(@PathVariable String name) {
        employee.setName("test");
        employee.setEmployeeId("emp1234");
        return employee;
   }
}
