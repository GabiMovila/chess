package com.chess.backend.models.Pieces;

import com.chess.backend.Types.PieceColor;
import com.chess.backend.models.Position;

public class Queen extends Piece {
    @Override
    public boolean isMovePossible(Position oldPosition, Position newPosition) {
        return false;
    }

    public Queen(PieceColor pieceColor) {
        this.color = pieceColor;
    }
}
