package com.chess.backend.service;

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
        if(piece.isMovePossible(oldPosition, newPosition)){

        }

        return response;
    }

    public Piece getPiece(Position position){
        return gameBoard.getPieceAtPosition(position);
    }

    public void startGame(){
        gameBoard.startGame();
    }

}
