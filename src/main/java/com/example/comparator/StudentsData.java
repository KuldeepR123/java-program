package com.example.comparator;

import java.util.*;

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
        Map<String,Integer> countCollageWiseStudent = new HashMap<>();
        Map<String,List<String>>collageWiseStudentList = new HashMap<>();
        Map<String,Map<String,String>>collageWiseStudentGradeList = new HashMap<>();
        students.add(new Student(1,"GECR","KULDEEP","A"));
        students.add(new Student(2,"VVP","YASH","B"));
        students.add(new Student(3,"DARSHAN","AP","C"));
        students.add(new Student(4,"MARWADI","ABHAY","D"));
        students.add(new Student(5,"RK","NIRAJ","E"));
        students.add(new Student(6,"VVP","ANKIT","E"));
        students.add(new Student(7,"ATMIYA","HARSH","F"));
        students.add(new Student(8,"GECR","SRUJAN","A"));
        students.add(new Student(9,"DAIICT","KULDEEP","A"));

//        students.forEach(s-> System.out.println(s.getId() + " : " + s.getCollage() + " : " + s.getName() + " : " + s.getGrade()));
        students.forEach(s->studentName.add(s.getName()));

//        System.out.println("Unique Names are : ");
//        studentName.forEach(System.out::println);

        students.forEach(s->{
            if(!(countCollageWiseStudent.containsKey(s.getCollage()))){
                countCollageWiseStudent.put(s.getCollage(),1);
            }
            else{
                countCollageWiseStudent.put(s.getCollage(),countCollageWiseStudent.get(s.getCollage())+1);
            }
        });
        students.forEach(s->{
            if(!(collageWiseStudentList.containsKey(s.getCollage()))){
                collageWiseStudentList.put(s.getCollage(), new ArrayList<>());
                collageWiseStudentList.get(s.getCollage()).add(s.getName());
            }
            else{
                collageWiseStudentList.get(s.getCollage()).add(s.getName());
            }
        });
        students.forEach(s->{
            if(!(collageWiseStudentGradeList.containsKey(s.getCollage()))){
                collageWiseStudentGradeList.put(s.getCollage(), new HashMap<>());
                collageWiseStudentGradeList.get(s.getCollage()).put(s.getName(),s.getGrade());
            }
            else{
                collageWiseStudentGradeList.get(s.getCollage()).put(s.getName(), s.getGrade());
            }
        });
        countCollageWiseStudent.forEach((k,v)-> System.out.println(k + " : " + v));
        System.out.println("-------------------");
        collageWiseStudentList.forEach((k,v)-> System.out.println(k + " : " + v));
        System.out.println("-------------------");
        collageWiseStudentGradeList.forEach((k,v)-> System.out.println(k + " : " + v));
        System.out.println("--------------------");
        students.sort(new SortByName());
        students.sort(new SortByCollage());
        students.forEach(s-> System.out.println(s.getId() + " : " + s.getCollage() + " : " + s.getName() + " : " + s.getGrade()));

    }
}
