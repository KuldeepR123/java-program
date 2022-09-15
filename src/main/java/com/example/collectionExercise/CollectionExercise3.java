package com.example.collectionExercise;

import java.util.*;

class ProminentTrainee{
    int traineeId;
    String traineeName;
    int traineeAge;
    String traineeDob;

    public ProminentTrainee(int traineeId, String traineeName, int traineeAge, String traineeDob) {
        this.traineeId = traineeId;
        this.traineeName = traineeName;
        this.traineeAge = traineeAge;
        this.traineeDob = traineeDob;
    }
}
class SortByName implements Comparator<ProminentTrainee> {
    @Override
    public int compare(ProminentTrainee o1, ProminentTrainee o2) {
        return (o1.traineeName.compareTo(o2.traineeName));
    }
}
class SortById implements Comparator<ProminentTrainee> {
    @Override
    public int compare(ProminentTrainee o1, ProminentTrainee o2) {
        return o1.traineeId - o2.traineeId;
    }
}

class SortByAge implements Comparator<ProminentTrainee> {
    @Override
    public int compare(ProminentTrainee o1, ProminentTrainee o2) {
        return o1.traineeAge - o2.traineeAge;
    }
}
class SortByDob implements Comparator<ProminentTrainee> {
    @Override
    public int compare(ProminentTrainee o1, ProminentTrainee o2) {
        return o1.traineeDob.compareTo(o2.traineeDob);
    }
}

public class CollectionExercise3 {
    public static void main(String[] args) {
        ArrayList<ProminentTrainee> pt = new ArrayList<>();
        pt.add(new ProminentTrainee(1,"KD",22,"2000-08-14"));
        pt.add(new ProminentTrainee(2,"AP",22,"2000-02-11"));
        pt.add(new ProminentTrainee(3,"Ankit",24,"1998-05-24"));
        pt.add(new ProminentTrainee(4,"Yash",22,"2000-07-21"));
        pt.add(new ProminentTrainee(5,"Niraj",23,"1999-03-19"));
        pt.add(new ProminentTrainee(6,"Dipraj",22,"2000-08-02"));
        pt.add(new ProminentTrainee(7,"Harsh",25,"1997-08-10"));
        pt.add(new ProminentTrainee(8,"Abhay",22,"1997-02-15"));
        pt.add(new ProminentTrainee(9,"Smit",22,"2000-06-08"));
        pt.add(new ProminentTrainee(10,"Vasu",24,"2000-09-27"));

        pt.sort(new SortByName());
        System.out.println("------Sort By Name------");
        for(ProminentTrainee p:pt){
            System.out.println(p.traineeId + " : " + p.traineeName + " : " + p.traineeAge + " : " + p.traineeDob);
        }
        pt.sort(new SortById());
        System.out.println("------Sort By Id------");
        for(ProminentTrainee p:pt){
            System.out.println(p.traineeId + " : " + p.traineeName + " : " + p.traineeAge + " : " + p.traineeDob);
        }
        pt.sort(new SortByAge());
        System.out.println("------Sort By Age------");
        for(ProminentTrainee p:pt){
            System.out.println(p.traineeId + " : " + p.traineeName + " : " + p.traineeAge + " : " + p.traineeDob);
        }
        pt.sort(new SortByDob());
        System.out.println("------Sort By Dob------");
        for(ProminentTrainee p:pt){
            System.out.println(p.traineeId + " : " + p.traineeName + " : " + p.traineeAge + " : " + p.traineeDob);
        }
    }
}
