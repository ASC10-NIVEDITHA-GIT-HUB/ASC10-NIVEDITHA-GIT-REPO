package com.demo.oops;
public class StaticVsInstance {
    public static void main(String[] args){
        Employee.companyName = "The Amazing Company";
        String companyName= Employee.companyName;
        System.out.println(Employee.companyName);

        Employee emp1= new Employee();
        emp1.employeeName = "Niveditha";
        System.out.println(emp1.employeeName);

        Employee emp2= new Employee();
        emp1.employeeName = "Nayana";
        System.out.println(emp2.employeeName);

        System.out.println("Helloooo" +emp1.employeeName+ "and" +emp2.employeeName+ "how are you"+companyName);
    } 
}

class Employee{
    public static String companyName;
    public String employeeName;
}