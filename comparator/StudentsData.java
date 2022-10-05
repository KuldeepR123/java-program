package com.example.comparator;

import java.util.*;
import java.util.stream.Collectors;

class Student{
    private int id;
    private String collage;
    private String name;
    private String grade; // FIRST_CLASS, SECOND_CLASS

    public Student(int id, String collage, String name, String grade) {
        this.id = id;
        this.collage = collage;
        this.name = name;
        this.grade = grade;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCollage() {
        return collage;
    }

    public void setCollage(String collage) {
        this.collage = collage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
class SortByName implements Comparator<Student>{
    @Override
    public int compare(Student  s1, Student s2){
        return s1.getName().compareTo(s2.getName());
    }
}
class SortByCollage implements Comparator<Student>{
    @Override
    public int compare(Student  s1, Student s2){
        if(s1.getName().equals(s2.getName())){
            return s1.getCollage().compareTo(s2.getCollage());
        }
        return s1.getName().compareTo(s2.getName());
    }
}
public class StudentsData {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        LinkedHashSet<String> studentName = new LinkedHashSet<>();
        students.add(new Student(1,"GECR","KULDEEP","A"));
        students.add(new Student(2,"VVP","YASH","B"));
        students.add(new Student(3,"DARSHAN","AP","C"));
        students.add(new Student(4,"MARWADI","ABHAY","D"));
        students.add(new Student(5,"RK","NIRAJ","E"));
        students.add(new Student(6,"VVP","ANKIT","E"));
        students.add(new Student(7,"ATMIYA","HARSH","F"));
        students.add(new Student(8,"GECR","SRUJAN","B"));
        students.add(new Student(9,"DAIICT","KULDEEP","A"));

//        students.forEach(s-> System.out.println(s.getId() + " : " + s.getCollage() + " : " + s.getName() + " : " + s.getGrade()));
        students.forEach(s->studentName.add(s.getName()));

//        System.out.println("Unique Names are : ");
//        studentName.forEach(System.out::println);

        Map<String, Long> collegeWiseStudentList = students.stream()
                .collect(Collectors.groupingBy(Student::getCollage,Collectors.counting()));

        Map<String, List<String>> grouping = students.stream().collect(Collectors.groupingBy(Student::getCollage,Collectors.mapping(Student::getName,Collectors.toList())));

        Map<String, Map<String, Long>> collect = students.stream().collect(Collectors.groupingBy(Student::getCollage, Collectors.groupingBy(Student::getGrade, Collectors.mapping(Student::getName, Collectors.counting()))));
        System.out.println(collegeWiseStudentList);
        System.out.println(grouping);
        System.out.println(collect);
    }
}
