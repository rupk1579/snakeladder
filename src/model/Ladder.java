package model;

public class Ladder {
    private int ladderId;
    private Position position;

    public Ladder(int ladderId, Position position) {
        this.ladderId = ladderId;
        this.position = position;
    }

    public int getLadderId() {
        return ladderId;
    }

    public Position getPosition() {
        return position;
    }
}
