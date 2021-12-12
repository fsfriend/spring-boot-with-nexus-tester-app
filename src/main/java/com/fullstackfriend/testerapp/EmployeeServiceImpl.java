package com.fullstackfriend.testerapp;

import com.fullstackfriend.entity.Employee;
import com.fullstackfriend.exception.DataNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee findById(String id) {
        return employeeRepository.findById(id).orElseThrow(() -> new DataNotFoundException("data not found for id "+id));
    }
}
