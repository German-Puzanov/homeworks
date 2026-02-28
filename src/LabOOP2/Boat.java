package LabOOP2;

public class Boat extends Vehicle {
    private final int oarsCount;

    public Boat(int passengers, int oarsCount) throws IllegalArgumentException {
        super(passengers);
        if (oarsCount > passengers*2){
            throw  new IllegalArgumentException("one to many oars!");
        }
        if (oarsCount == 0){
            throw  new IllegalArgumentException("Need oars to swim!");
        }
        this.oarsCount = oarsCount;
    }

    @Override
    public String toString() {
        return "In a boat " + super.passengers + " passengers " + System.lineSeparator() +
                "With " + this.oarsCount + " oars.";
    }
}
