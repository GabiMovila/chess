package com.chess.backend.models.pieces;

import com.chess.backend.models.GameBoard;
import com.chess.backend.models.Position;
import com.chess.backend.types.PieceColor;

public abstract class Piece {
    private final GameBoard gameBoard = GameBoard.getInstance();

    public PieceColor color;

    public abstract boolean isMovePossible(Position oldPosition,
                                           Position newPosition);

    public abstract boolean isGivingCheck(Position newPosition);

    /**
     * Checks whether the move is blocked,
     * meaning if it's pinned to the king
     */
    protected boolean isMoveBlocked() {
        return false;
    }

    public boolean isOppositePieceOnThePosition(Position position) {
        return gameBoard.getPieceAtPosition(position) != null &&
                gameBoard.getPieceAtPosition(position).color != this.color;
    }

    public void movePiece(Piece piece, Position oldPosition,
                          Position newPosition) {
        gameBoard.setPieceAtPosition(newPosition, piece);
        gameBoard.removePieceAtPosition(oldPosition);
    }

}
