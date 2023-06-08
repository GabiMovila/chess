package com.chess.backend.models;

import java.util.HashMap;

public class GameBoard {
    private HashMap<Position,Piece> board;

    public Piece getPieceAtPosition(short x, short y){
        var position = new Position(x,y);
       return board.get(position);
    }

    public void startGame(){

    }
}
