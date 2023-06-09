package com.chess.backend.models.pieces;

import com.chess.backend.types.PieceColor;
import com.chess.backend.models.GameBoard;
import com.chess.backend.models.Position;


public class Pawn extends Piece {
    private GameBoard gameBoard = GameBoard.getInstance();

    public Pawn(PieceColor pieceColor){
        this.color = pieceColor;
    }
    @Override
    public boolean isMovePossible(Position oldPosition, Position newPosition) {
        if(isMoveBlocked()){
            return false;
        }
        if(!isCorrectPawnMove(oldPosition,newPosition)){
            return false;
        }
        return true;
    }

    private boolean isCorrectPawnMove(Position oldPosition, Position newPosition) {
        if(isMovingForwardOneSquare(oldPosition,newPosition)){
            return true;
        }
        if(isPawnCapturing(oldPosition,newPosition)){
            return true;
        }
        return false;
    }

    /**
     * Checks if the pawn can capture, by checking if an opposite piece is located in the one of the ahead corner squares
     */
    private boolean isPawnCapturing(Position oldPosition, Position newPosition) {
        //check Whether there is a piece to the desired square and if it is opposite piece
        if(isOppositePieceOnThePosition(newPosition)){
            switch (this.color){
                case WHITE -> {
                    if(newPosition.getY() - oldPosition.getY() == 1){
                        if(Math.abs(oldPosition.getX() - newPosition.getX()) == 1){
                            return true;
                        }
                    }}
                case BLACK -> {
                    if(newPosition.getY() - oldPosition.getY() == -1){
                        if(Math.abs(oldPosition.getX() - newPosition.getX()) == 1){
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
    private boolean isMovingForwardOneSquare(Position oldPosition, Position newPosition) {
        if(oldPosition.getX() == newPosition.getX()){
            switch (this.color){
                case WHITE -> {
                    if(newPosition.getY() - oldPosition.getY() == 1){
                    return true;
                }}
                case BLACK -> {
                    if(newPosition.getY() - oldPosition.getY() == -1){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    @Override
    public boolean isGivingCheck(Position newPosition) {
        return false;
    }
    //TODO implementation
    private boolean isPawnFirstTimeMoving(){
        return false;
    }
    //TODO implementation
    private boolean canPawnTakeEnPassant(){
        return false;
    }
}
