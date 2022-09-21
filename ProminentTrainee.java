package com.example.lambdaExpression;

public class ProminentTrainee {
    Integer traineeId;
    String traineeName;
    Integer traineeAge;
    String traineeDob;

    public ProminentTrainee(int traineeId, String traineeName, int traineeAge, String traineeDob) {
        this.traineeId = traineeId;
        this.traineeName = traineeName;
        this.traineeAge = traineeAge;
        this.traineeDob = traineeDob;
    }

    public Integer getTraineeId() {
        return traineeId;
    }

    public void setTraineeId(Integer traineeId) {
        this.traineeId = traineeId;
    }

    public String getTraineeName() {
        return traineeName;
    }

    public void setTraineeName(String traineeName) {
        this.traineeName = traineeName;
    }

    public Integer getTraineeAge() {
        return traineeAge;
    }

    public void setTraineeAge(Integer traineeAge) {
        this.traineeAge = traineeAge;
    }

    public String getTraineeDob() {
        return traineeDob;
    }

    public void setTraineeDob(String traineeDob) {
        this.traineeDob = traineeDob;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProminentTrainee that = (ProminentTrainee) o;
        return traineeId.equals(that.traineeId) && traineeName.equals(that.traineeName) && traineeAge.equals(that.traineeAge) && traineeDob.equals(that.traineeDob);
    }

    @Override
    public int hashCode() {
        int prime = 35;
        int result = 1;
        result = prime * result + (traineeId == null ? 0 : traineeId.hashCode());
        result = prime * result + (traineeName == null ? 0 : traineeName.hashCode());
        result = prime * result + (traineeAge == null ? 0 : traineeAge.hashCode());
        result = prime * result + (traineeDob == null ? 0 : traineeDob.hashCode());
        return result;
    }
}
