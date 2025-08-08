package com.niveditha.service;

import com.niveditha.entity.Employee;
import com.niveditha.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeServiceImpl implements  EmployeeService{
    private final EmployeeRepository employeeRepository;
    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository=employeeRepository;}
        @Override
        public List<Employee> getAllEmployees(){
            System.out.println("Getting All Employees!");
            return employeeRepository.findAll();
    }
}
