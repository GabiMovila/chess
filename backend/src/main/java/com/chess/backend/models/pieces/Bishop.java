package com.chess.backend.models.pieces;

import com.chess.backend.types.PieceColor;
import com.chess.backend.models.Position;

public class Bishop extends Piece {
    @Override
    public boolean isMovePossible(Position oldPosition, Position newPosition) {
        return false;
    }

    @Override
    public boolean isGivingCheck(Position newPosition) {
        return false;
    }

    public Bishop(PieceColor pieceColor) {
        this.color= pieceColor;
    }
}
