package Cube;

public class Cube {
    private int edgeLength;

    public Cube(int edgeLength) {
        this.edgeLength = edgeLength;
    }

    public int getEdgeLength() {
        return edgeLength;
    }


    public int volume() {
        int volume = this.edgeLength * this.edgeLength * this.edgeLength;
        return volume;
    }

    @Override
    public String toString() {
        return "The length of the edge is " + this.edgeLength + " and the volume is " + this.volume();
    }
}
