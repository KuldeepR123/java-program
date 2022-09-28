package com.example.database;

public class Information {
    int TraineeId;
    String TraineeName;
    String TraineeAddress;
    String TraineeDOB;
    String TraineeJoiningDate;
    int TraineeAge;

    public Information(int traineeId, String traineeName, String traineeAddress, String traineeDOB, String traineeJoiningDate, int traineeAge) {
        TraineeId = traineeId;
        TraineeName = traineeName;
        TraineeAddress = traineeAddress;
        TraineeDOB = traineeDOB;
        TraineeJoiningDate = traineeJoiningDate;
        TraineeAge = traineeAge;
    }
}
