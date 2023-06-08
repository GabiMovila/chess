package com.chess.backend.models;

import java.util.HashMap;

public class GameBoard {
    private HashMap<Position,Piece> board;

    public Piece getPieceAtPosition(short x, short y){
        var position = new Position(x,y);
       return board.get(position);
    }
    public void setPieceAtPosition(short x, short y, Piece piece){
        var position = new Position(x,y);
        board.put(position, piece);
    }

    public void removePieceAtPosition(short x, short y){
        var position = new Position(x,y);
        board.remove(position);
    }

    public void startGame(){

    }
}
