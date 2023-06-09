package com.chess.backend.models.Pieces;

import com.chess.backend.models.GameBoard;
import com.chess.backend.models.Piece;
import com.chess.backend.models.Position;
import org.springframework.beans.factory.annotation.Autowired;

public class Pawn extends Piece {
    @Autowired
    private GameBoard gameBoard;
    @Override
    public boolean isMovePossible(Position newPosition) {
        if(isMoveBlocked()){
            return false;
        }
        if(!isCorrectPawnMove(newPosition)){
            return false;
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

    /**
     * Checks if the pawn can capture, by checking if an opposite piece is located in the one of the ahead corner squares
     */
    private boolean isPawnCapturing(Position newPosition) {
        //check Whether there is an opposite piece to the desired square
        boolean isOppositePieceThere = gameBoard.getPieceAtPosition(newPosition).color != this.color;
        if(isOppositePieceThere){
            switch (this.color){
                case WHITE -> {
                    if(newPosition.getY() - this.position.getY() == 1){
                        if(Math.abs(this.position.getX() - newPosition.getX()) == 1){
                            return true;
                        }
                    }}
                case BLACK -> {
                    if(newPosition.getY() - this.position.getY() == -1){
                        if(Math.abs(this.position.getX() - newPosition.getX()) == 1){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
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
    //TODO implementation
    private boolean isPawnFirstTimeMoving(){
        return false;
    }
    //TODO implementation
    private boolean canPanTakeEnPassant(){
        return false;
    }
}
