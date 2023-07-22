package com.chess.backend.models;

public class RequestData {
    private final Position oldPosition;

    private final Position newPosition;

    public RequestData(Position oldPosition, Position newPosition) {
        this.oldPosition = oldPosition;
        this.newPosition = newPosition;
    }

    public Position getFirstPositionInstance() {
        return Position.getPosition(oldPosition.getX(),
                oldPosition.getY());
    }

    public Position getSecondPositionInstance() {
        return Position.getPosition(oldPosition.getX(),
                newPosition.getY());
    }
}

