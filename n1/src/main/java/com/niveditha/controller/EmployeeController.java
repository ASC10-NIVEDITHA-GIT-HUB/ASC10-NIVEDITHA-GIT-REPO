package com.niveditha.controller;

import com.niveditha.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class EmployeeController {
    @GetMapping("/getHTMLContent")
    public String getHTMLContent(){
        String htmlOutput = "<html><head><title>Welcome</title></head><body><h1 style=\"color:green\">rest API can also expose</h1></body></html>";
        return htmlOutput;
    }

    public static class Employee{
        private int id;
        private String name;

        public Employee(int id,String name){
            this.id = id;
            this.name=name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    @GetMapping("/getEmployeesAsList")
    public List<Employee> getEmployeesAsList() {
        List<Employee> employeesList = new ArrayList<>();
        employeesList.add(new Employee(1, "Alice"));
        employeesList.add(new Employee(2, "Bob"));
        employeesList.add(new Employee(3, "Charlie"));
        return employeesList;
    }

    @GetMapping("/getEmployeesAsMap")
    public Map<Integer, Employee> getEmployeesAsMap() {
        Map<Integer, Employee> employeesMap = new HashMap<>();
        employeesMap.put(1, new Employee(1, "Alice"));
        employeesMap.put(2, new Employee(2, "Bob"));
        employeesMap.put(3, new Employee(3, "Charlie"));
        return employeesMap;
    }
}