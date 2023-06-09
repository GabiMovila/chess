package com.chess.backend.Service;

import com.chess.backend.models.GameBoard;
import com.chess.backend.models.Piece;
import com.chess.backend.models.Position;
import com.chess.backend.models.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovesService {
    @Autowired
    private GameBoard gameBoard;
    public ResponseData makeMove(Position oldPosition, Position newPosition){
        Piece piece = gameBoard.getPieceAtPosition(oldPosition);
        var response =  new ResponseData();
        if(piece.isMovePossible(newPosition)){

        }

        return response;
    }

}
