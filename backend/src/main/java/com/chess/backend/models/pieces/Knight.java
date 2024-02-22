package com.chess.backend.models.pieces;

import com.chess.backend.models.Position;
import com.chess.backend.types.PieceColor;

public class Knight extends Piece {
    public Knight(PieceColor color) {
        this.color = color;
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
