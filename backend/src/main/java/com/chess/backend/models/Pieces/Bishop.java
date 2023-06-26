package com.chess.backend.models.Pieces;

import com.chess.backend.Types.PieceColor;
import com.chess.backend.models.Position;

public class Bishop extends Piece {
    @Override
    public boolean isMovePossible(Position newPosition) {
        return false;
    }

    public Bishop(PieceColor pieceColor) {
        this.color= pieceColor;
    }
}
