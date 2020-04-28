package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {
//    needs three fields: courseName, courseInstructor, enrolledStudents
    private String courseName;
//    use future teacher class
    private String courseInstructor;
    private ArrayList<Class> enrolledStudents = new ArrayList<>();
    SchoolPractice studentOne = new SchoolPractice();
        enrolledStudents.add(studentOne);

//    getters
    public String getCourseName() {
        return courseName;
    }
    public String getCourseInstructor() {
        return courseInstructor;
    }
    public ArrayList<String> getEnrolledStudents() {
        return enrolledStudents;
    }
    //    setters
    public String setCourseName(String aCourseName) {
        courseName = aCourseName;
    }
    public String setCourseInstructor(String aCourseInstructor) {
        courseInstructor = aCourseInstructor;
    }
    public ArrayList<String> setEnrolledStudents(ArrayList<String> aEnrolledStudents) {
//        SchoolPractice studentOne = new SchoolPractice();
//        enrolledStudents.add(studentOne);
    }
}
