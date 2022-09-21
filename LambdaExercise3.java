package com.example.lambdaExpression;

import java.util.*;
import java.util.stream.Collectors;

public class LambdaExercise3 {
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


        //Iterate through arrayList using for loop
        System.out.println("Iterate through arrayList using for loop\n");
        System.out.println("Id" + " : " + "Age" + " : " + "Name" + " : " + "Dob");
        for(int i=0; i<pt.size(); i++){
            System.out.println(pt.get(i).traineeId + " : " + pt.get(i).traineeAge + " : " + pt.get(i).traineeName + " : " + pt.get(i).traineeDob);
        }
        System.out.println();
        //Iterate through arrayList using for each loop
        System.out.println("Iterate through arrayList using forEach loop\n");
        for(ProminentTrainee p:pt){
            System.out.println(p.traineeId + " : " + p.traineeAge + " : " + p.traineeName + " : " + p.traineeDob);
        }
        System.out.println();
        //Iterate through arrayList using Lambda Expression
        System.out.println("Iterate through arrayList using Lambda Expression\n");
        pt.forEach(p-> System.out.println(p.traineeId + " : " + p.traineeAge + " : " + p.traineeName + " : " + p.traineeDob));
        System.out.println();
        //Insert element in array at 2nd position
        ProminentTrainee prominentTrainee = new ProminentTrainee(11,"Ronak",22,"2000/08/29");
        pt.add(2,prominentTrainee);

        //Retrieve an element of 3rd index
        System.out.println(pt.get(3).traineeId + " : " + pt.get(3).traineeAge + " : " + pt.get(3).traineeName + " : " + pt.get(3).traineeDob);

        System.out.println("Before converting to set, size is : " + pt.size());
        //convert list to set
        Set<ProminentTrainee> prominentTrainees = new HashSet<>();
        for(ProminentTrainee p:pt){
            prominentTrainees.add(p);
        }
        System.out.println("After converting to set, size is : " + prominentTrainees.size());
        System.out.println();
        pt.sort((ProminentTrainee p1, ProminentTrainee p2)-> p1.traineeId.compareTo(p2.traineeId));
        pt.sort((ProminentTrainee p1, ProminentTrainee p2)-> p1.traineeName.compareTo(p2.traineeName));
        pt.sort((ProminentTrainee p1, ProminentTrainee p2)-> p1.traineeAge.compareTo(p2.traineeAge));
        pt.sort((ProminentTrainee p1, ProminentTrainee p2)-> p1.traineeDob.compareTo(p2.traineeDob));

//        System.out.println(pt.stream().collect(Collectors.toMap(ProminentTrainee::getTraineeId, ProminentTrainee, (a1, a2)->a1)));
        Map<Integer, List<String>> collect = pt.stream().collect(Collectors.toMap(ProminentTrainee::getTraineeId, (obj) -> {
            return List.of(obj.getTraineeName(),String.valueOf(obj.getTraineeAge()),obj.getTraineeDob());
        }));
        System.out.println(collect);
    }
}
