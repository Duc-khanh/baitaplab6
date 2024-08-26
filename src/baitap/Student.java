package baitap;

import java.io.Serializable;

public class Student implements Serializable {
    private String StudentID;
    private String StudentName;
    private Integer StudentAge;
    private String StudentClass;
    public Student(String StudentID, String StudentName, Integer StudentAge, String StudentClass) {
        this.StudentID = StudentID;
        this.StudentName = StudentName;
        this.StudentAge = StudentAge;
        this.StudentClass = StudentClass;
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String studentID) {
        StudentID = studentID;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public Integer getStudentAge() {
        return StudentAge;
    }

    public void setStudentAge(Integer studentAge) {
        StudentAge = studentAge;
    }

    public String getStudentClass() {
        return StudentClass;
    }

    public void setStudentClass(String studentClass) {
        StudentClass = studentClass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentID='" + StudentID + '\'' +
                ", StudentName='" + StudentName + '\'' +
                ", StudentAge=" + StudentAge +
                ", StudentClass='" + StudentClass + '\'' +
                '}';
    }
}