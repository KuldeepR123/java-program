package com.example.collectionExercise;

import java.util.*;
import java.util.stream.Collectors;

class Collage{
    String collageName;
    List<Course> courses;
    public String getCollageName(){
        return collageName;
    }
    public List<Course> getCourses(){
        return courses;
    }
    public Collage(String collageName,List<Course> courses){
        this.collageName = collageName;
        this.courses = courses;
    }
    @Override
    public int hashCode(){
        int prime = 35;
        int result = 1;
        result = prime * result + (collageName==null ? 0:collageName.hashCode());
        result = prime * result + (courses==null ? 0:courses.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        final Collage clgs = (Collage) obj;
        if (!Objects.equals(this.courses, clgs.courses)) {
            return false;
        }

        if (!(this.collageName.equals(clgs.collageName))) {
            return false;
        }

        return true;
    }
}
class Course{
    String courseName;
    List<Students> enrolledStudents;
    public String getCourseName(){
        return courseName;
    }
    public Course(String cName, List<Students> enrolledStudents){
        this.courseName = cName;
        this.enrolledStudents = enrolledStudents;
    }
}
class Students{
    String name;
    String course;
    String college;
    public Students(String name, String course, String college){
        this.name = name;
        this.course = course;
        this.college = college;
    }

    public void setCourse(String course){
        this.course = course;
    }
    public void setCollege(String college){
        this.college = college;
    }
    public String getName(){
        return name;
    }
    public String getCourse(){
        return course;
    }
    public String getCollage(){
        return college;
    }
}
class SortByCollage implements Comparator<Collage> {
    @Override
    public int compare(Collage o1, Collage o2) {
        return o2.collageName.compareTo(o1.collageName);
    }
}
public class CollectionExercise2 {
    public static void main(String[] args){
        List<Students> students  = new ArrayList<>();
        students.add(new Students("Kuldeep","",""));
        students.add(new Students("Yash","",""));
        students.add(new Students("Niraj","",""));

        List<Course> course = new ArrayList<>();
        course.add(new Course("EC",students));
        course.add(new Course("Computer",students));
        course.add(new Course("IT",students));

        List<Collage> clg = new ArrayList<>();
        clg.add(new Collage("GEC",course));
        clg.add(new Collage("VVP",course));
        clg.add(new Collage("DARSHAN",course));
        clg.add(new Collage("DARSHAN",course));

//        To convert List to Map
        System.out.println(clg.stream().collect(Collectors.toMap(Collage::getCollageName, Collage::getCourses, (a1,a2)->a1)));
    }
}