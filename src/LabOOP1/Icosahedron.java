package LabOOP1;

public class Icosahedron {
    private int edge;

    public Icosahedron(int InputEdge) {
        this.edge = Math.abs(InputEdge);
    }

    public int getFacesArea() {
        return (int) Math.round(5 * Math.pow(this.edge, 2) * Math.sqrt(3) / 20);
    }

    public int getArea() {
        return (int) Math.round(5 * Math.pow(this.edge, 2) * Math.sqrt(3));
    }

    public int getVolume() {
        return (int) Math.round((5 * (3 + Math.sqrt(5)) / 12) * Math.pow(this.edge, 3));
    }

}

