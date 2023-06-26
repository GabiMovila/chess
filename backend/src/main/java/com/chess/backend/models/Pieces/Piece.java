package com.chess.backend.models.Pieces;

import com.chess.backend.Types.PieceColor;
import com.chess.backend.models.Position;

public abstract class Piece {
    public PieceColor color;
    public abstract boolean isMovePossible(Position oldPosition, Position newPosition);

     /**
     * Checks whether the move is blocked,
     * meaning if it's pinned to the king
     */
    protected boolean isMoveBlocked() {
        return false;
    }

}
