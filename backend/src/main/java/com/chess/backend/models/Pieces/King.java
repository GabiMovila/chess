package com.chess.backend.models.Pieces;

import com.chess.backend.Types.PieceColor;
import com.chess.backend.models.Position;

public class King extends Piece {
    @Override
    public boolean isMovePossible(Position newPosition) {
        return false;
    }

    public King(PieceColor color) {
        this.color=color;
    }
}
