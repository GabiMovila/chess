package com.chess.backend.models;

import com.chess.backend.Types.PieceColor;
import com.chess.backend.exceptions.IllegalMoveException;

public abstract class Piece {
    public short id;
    public Position position;
    protected String name;
    protected PieceColor color;
    public abstract boolean isMovePossible(Position position);

}
