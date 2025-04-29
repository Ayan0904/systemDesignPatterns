package org.example.SnakeLadder;

public class Snake {
    Position startPosition;
    Position endPosition;

    Snake(Position startPosition, Position endPosition){
        this.endPosition = endPosition;
        this.startPosition = startPosition;
    }
}
