package baitap;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("001","Duc Khanh",18,"CodeGymK15");
        Student student2 = new Student("002","Tuan Minh",19,"CodeGymK15");
        Student student3 = new Student("003","Duc Huy",19,"CodeGymK15");
        Student student4 = new Student("004","Van Dan",18,"CodeGymK15");
        Student student5 = new Student("005","Huyen Trang",18,"CodeGymK15");

        List<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        StudentProcess objStudentProcess = new StudentProcess();

        objStudentProcess.writeStudent(students,"student.dat");

        List<Student> listStudent = objStudentProcess.readStudent("student.dat");
        listStudent.forEach(System.out::println);
    }
}