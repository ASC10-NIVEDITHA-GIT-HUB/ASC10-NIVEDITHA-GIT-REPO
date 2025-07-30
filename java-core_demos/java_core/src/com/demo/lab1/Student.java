package com.demo.lab1;

public class Student {
    private int studentId;
    private String studentName;
    private String city;
    private int marks1, marks2, marks3;
    private float feePerMonth;
    private boolean isEligibleForScholarship;

    public Student(int studentId, String studentName, String city, int marks1, int marks2, int marks3, float feePerMonth, boolean isEligibleForScholarship) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.city= city;
        this.marks1= marks1;
        this.marks2= marks2;
        this.marks3= marks3;
        this.feePerMonth=feePerMonth;
        this.isEligibleForScholarship= isEligibleForScholarship;
    }

    public String getStudentName(){
        return studentName;
    }

    public float getFeePerMonth(){
        return feePerMonth;
    }

    public boolean isEligibleForScholarship(){
        return isEligibleForScholarship;
    }

    public int getTotalMarks(){
        return marks1 + marks2 + marks3;
    }

    public double getAverage(){
        return getTotalMarks()/3.0;
    }

    public String getResult(){
        return (marks1 > 60 && marks2 > 60 && marks3 > 60) ? "pass" : "fail";
    }

    public float getAnnualFee(){
        return feePerMonth * 12;
    }

    public void printDetails(){
        System.out.println("Name :"+ studentName);
        System.out.println("Total Marks :"+ getTotalMarks());
        System.out.println("Average Marks :"+ getAverage() );
        System.out.println("Result :"+ getResult());
        System.out.println("Scholarship :"+ (isEligibleForScholarship ? "Yes" : "No"));
        System.out.println("----------------------------");
    }

    public static void main(String[] args){
        Student[] student={
                new Student(101, "Niv","bang",85,78,92,1500.0f,true),
                new Student(102, "amrutha","mumbai",65,70,60,1300.0f,false),
                new Student(103, "nayana","goa",95,98,90,1400.0f,true),
        };

        Student topStudent = student[0];
        Student minFeeStudent = student[0];

        for(Student s : student){
            if(s.getTotalMarks() > topStudent.getTotalMarks())
                topStudent =s;
            if(s.getFeePerMonth() > minFeeStudent.getFeePerMonth())
                minFeeStudent =s;
        }

        System.out.println("Highest Score: " + topStudent.getStudentName());
        System.out.println("Lowest Fee" + minFeeStudent.getStudentName() + ",Montly Fee:" + minFeeStudent.getFeePerMonth());

        System.out.println("\n Student Details:");
        for (Student s : student){
            s.printDetails();
        }
    }
}

