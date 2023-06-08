package com.chess.backend.models.Pieces;

import com.chess.backend.models.Piece;
import com.chess.backend.models.Position;

public class Pawn extends Piece {
    @Override
    public boolean isMovePossible(Position newPosition) {
        if(isMoveBlocked()){
            return false;
        }
        if(isCorrectPawnMove(newPosition)){

        }
        return true;
    }

    private boolean isCorrectPawnMove(Position newPosition) {
        if(isMovingForwardOneSquare(newPosition)){
            return true;
        }
        if(isPawnCapturing(newPosition)){
            return true;
        }
        return false;
    }

    private boolean isPawnCapturing(Position newPosition) {
        return true;
    }

    /**
     *Checks if the pawn can move one square ahead
     * Depending on the color the pawn's Y it's changing either with 1 for White or -1 for black
     */
    private boolean isMovingForwardOneSquare(Position newPosition) {
        if(this.position.getX() == newPosition.getX()){
            switch (this.color){
                case WHITE -> {
                    if(newPosition.getY() - this.position.getY() == 1){
                    return true;
                }}
                case BLACK -> {
                    if(newPosition.getY() - this.position.getY() == -1){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /**
     * Checks whether the move is blocked,
     * meaning if it's pinned to the king
     */
    private boolean isMoveBlocked() {
        return false;
    }
}
