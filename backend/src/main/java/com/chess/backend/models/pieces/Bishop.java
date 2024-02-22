package com.chess.backend.models.pieces;

import com.chess.backend.models.Position;
import com.chess.backend.types.PieceColor;

public class Bishop extends Piece {
    public Bishop(PieceColor pieceColor) {
        this.color = pieceColor;
    }

    @Override
    public boolean isMovePossible(Position oldPosition, Position newPosition) {
        return false;
    }

    @Override
    public boolean isGivingCheck(Position newPosition) {
        return false;
    }
}
