package LabOOP2;

public class Vehicle {
    protected int passengers;

    protected Vehicle(int passengers){
            setPassengers(passengers);
            this.passengers = passengers;
    }

    protected void setPassengers(int passengers) throws IllegalArgumentException {
        if(passengers < 0){
            throw new IllegalArgumentException("Invalid negative number! Argument oars count");
        }
        this.passengers = passengers;
    }
}
