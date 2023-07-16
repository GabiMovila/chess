package com.chess.backend.models;

import java.util.HashMap;
import java.util.Map;

public class Position {
    private static final Map<String, Position> positionMap = new HashMap<>();

    private final int x;

    private final int y;

    private Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Flyweight factory method
    public static Position getPosition(int x, int y) {
        String key = x + "," + y;
        if (positionMap.containsKey(key)) {
            return positionMap.get(key);
        } else {
            Position position = new Position(x, y);
            positionMap.put(key, position);
            return position;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
