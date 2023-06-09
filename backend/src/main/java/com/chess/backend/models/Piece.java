package com.chess.backend.models;

import com.chess.backend.Types.PieceColor;

public abstract class Piece {
    public short id;
    public Position position;
    public String name;
    public PieceColor color;
    public abstract boolean isMovePossible(Position position);

     /**
     * Checks whether the move is blocked,
     * meaning if it's pinned to the king
     */
    protected boolean isMoveBlocked() {
        return false;
    }

}
