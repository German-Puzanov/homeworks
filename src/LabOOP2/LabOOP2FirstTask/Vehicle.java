package LabOOP2.LabOOP2FirstTask;

public class Vehicle {
    protected int passengers;

    protected Vehicle(int passengers){
            setPassengers(passengers);
            this.passengers = passengers;
    }

    protected void setPassengers(int passengers) throws IllegalArgumentException {
        if (passengers == 0){
            throw new IllegalArgumentException("No passengers!");
        }
        if(passengers < 0){
            throw new IllegalArgumentException("Invalid negative number! Argument passengers");
        }
        this.passengers = passengers;
    }
}
