package com.chess.backend.models.pieces;

import com.chess.backend.types.PieceColor;
import com.chess.backend.models.Position;

public class Rook extends Piece {
    @Override
    public boolean isMovePossible(Position oldPosition, Position newPosition) {
          return false;
    }

    @Override
    public boolean isGivingCheck(Position newPosition) {
        return false;
    }

    public Rook(PieceColor color) {
        this.color = color;
    }
}
