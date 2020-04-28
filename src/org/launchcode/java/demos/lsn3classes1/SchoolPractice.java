package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student newStudent = new Student();
        String name = newStudent.setName("Kyleah");
        int studentId = newStudent.setStudentId(12345);
        int numberOfCredits = newStudent.setNumberOfCredits(1);
        double gpa = newStudent.setGpa(4.0);
    }
}

