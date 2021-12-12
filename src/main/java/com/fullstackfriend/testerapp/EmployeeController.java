package com.fullstackfriend.testerapp;

import org.springframework.web.bind.annotation.*;
import com.fullstackfriend.entity.Employee;

@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService service) {
        System.out.println("======================== controller created");
        this.employeeService  = service;
    }

    @PostMapping()
    public Employee employee(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }

    @GetMapping("/{id}")
    public Employee employee(@PathVariable String id) {
        return employeeService.findById(id);
    }
}
