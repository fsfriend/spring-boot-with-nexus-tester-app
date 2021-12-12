package com.fullstackfriend.testerapp;

import com.fullstackfriend.entity.Employee;

public interface EmployeeService {
    Employee save(Employee employee);
    Employee findById(String id);
}
