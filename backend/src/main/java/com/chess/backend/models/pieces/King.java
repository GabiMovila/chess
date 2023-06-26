package com.chess.backend.models.pieces;

import com.chess.backend.types.PieceColor;
import com.chess.backend.models.Position;

public class King extends Piece {
    @Override
    public boolean isMovePossible(Position oldPosition, Position newPosition) {
        return false;
    }

    public King(PieceColor color) {
        this.color=color;
    }
}
