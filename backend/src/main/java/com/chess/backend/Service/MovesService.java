package com.chess.backend.Service;

import com.chess.backend.models.Piece;
import com.chess.backend.models.Position;
import com.chess.backend.models.ResponseData;
import org.springframework.stereotype.Service;

@Service
public class MovesService {
    public ResponseData makeMove(Piece piece, Position oldPosition, Position newPosition){
        if(!isMoveIsPossible(piece, oldPosition, newPosition)){
//            throw new IllegalMoveException();
        }
        return new ResponseData();
    }

    public boolean isMoveIsPossible(Piece piece, Position oldPosition, Position newPosition) {
        return true;
    }
}
