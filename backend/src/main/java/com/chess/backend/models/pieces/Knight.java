package com.chess.backend.models.pieces;

import com.chess.backend.types.PieceColor;
import com.chess.backend.models.Position;

public class Knight extends Piece {
    @Override
    public boolean isMovePossible(Position oldPosition, Position newPosition) {
        return false;
    }

    public Knight(PieceColor color) {
        this.color = color;
    }
}
