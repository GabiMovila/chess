package com.chess.backend.service;

import com.chess.backend.exceptions.IllegalMoveException;
import com.chess.backend.models.GameBoard;
import com.chess.backend.models.pieces.Piece;
import com.chess.backend.models.Position;
import com.chess.backend.models.ResponseData;
import org.springframework.stereotype.Service;

@Service
public class MovesService {
    private GameBoard gameBoard = GameBoard.getInstance();
    public ResponseData makeMove(Position oldPosition, Position newPosition){
        Piece piece = gameBoard.getPieceAtPosition(oldPosition);
        var response =  new ResponseData();
        //Set valid move
        if(!piece.isMovePossible(oldPosition, newPosition)){
            throw new IllegalMoveException();
        }
        response.setValidMove(true);
        //Set whether the move has captured another piece
        if(piece.isOppositePieceOnThePosition(newPosition)){
            response.setCapturedPiece(true);
        }
        //Make the move
        piece.movePiece(piece, oldPosition, newPosition );

        //Check whether the new position gives check
        response.setGivesCheck(piece.isGivingCheck(newPosition));
        return response;

    }


    public Piece getPiece(Position position){
        return gameBoard.getPieceAtPosition(position);
    }

    public void startGame(){
        gameBoard.startGame();
    }

}
