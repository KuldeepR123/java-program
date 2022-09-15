package com.example.fileIOexercise;

import java.io.Serializable;
import java.util.ArrayList;

class ProminentTraine implements Serializable {
    int traineId;
    int age;
    String traineName;
    String traineAddress;
    String traineeDob;
    String joiningDate;

    public int getTraineId() {
        return traineId;
    }

    public void setTraineId(int traineId) {
        this.traineId = traineId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTraineName() {
        return traineName;
    }

    public void setTraineName(String traineName) {
        this.traineName = traineName;
    }

    public String getTraineAddress() {
        return traineAddress;
    }

    public void setTraineAddress(String traineAddress) {
        this.traineAddress = traineAddress;
    }

    public String getTraineeDob() {
        return traineeDob;
    }

    public void setTraineeDob(String traineeDob) {
        this.traineeDob = traineeDob;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    @Override
    public String toString() {
        return "ProminentTraine{" +
                "traineId=" + traineId +
                ", age=" + age +
                ", traineName='" + traineName + '\'' +
                ", traineAddress='" + traineAddress + '\'' +
                ", traineeDob='" + traineeDob + '\'' +
                ", joiningDate='" + joiningDate + '\'' +
                '}';
    }

    public ProminentTraine(int traineId, int age, String traineName, String traineAddress, String traineeDob, String joiningDate) {
        this.traineId = traineId;
        this.age = age;
        this.traineName = traineName;
        this.traineAddress = traineAddress;
        this.traineeDob = traineeDob;
        this.joiningDate = joiningDate;
    }
}
public class FileIoExercise4 {
    public static void main(String[] args) {
        ArrayList<ProminentTraine> ptr = new ArrayList<>();
        ptr.add(new ProminentTraine(1,22,"Kuldeep","Rajkot","2000-08-26", "2022-08-08"));
        ptr.add(new ProminentTraine(2,22,"AP","Rajkot","2000-02-11", "2021-09-08"));
        ptr.add(new ProminentTraine(3,22,"Yash","Rajkot","2000-06-24", "2022-07-10"));
        ptr.add(new ProminentTraine(4,22,"Ankit","Rajkot","2000-04-06", "2022-06-20"));
        ptr.add(new ProminentTraine(5,22,"Niraj","Rajkot","2000-04-10", "2022-07-14"));
    }
}
