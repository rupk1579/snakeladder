package model;

import java.util.UUID;

public class Snake {
    private int snakeId;
    private Position position;

    public Snake(int snakeId, Position position) {
        this.snakeId = snakeId;
        this.position = position;
    }

    public int getSnakeId() {
        return snakeId;
    }

    public Position getPosition() {
        return position;
    }
}
