package com.chess.backend.models;

public class Position {
    private short X;
    private short Y;

    public Position(short x,short y){
        this.X=x;
        this.Y=y;
    }

    public short getX() {
        return X;
    }

    public void setX(short x) {
        X = x;
    }

    public short getY() {
        return Y;
    }

    public void setY(short y) {
        Y = y;
    }
}
