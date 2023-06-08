package com.chess.backend.models.Pieces;

import com.chess.backend.models.Piece;
import com.chess.backend.models.Position;

public class Queen extends Piece {
    @Override
    public boolean isMovePossible(Position newPosition) {
        return false;
    }
}
