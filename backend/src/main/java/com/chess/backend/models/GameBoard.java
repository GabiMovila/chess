package com.chess.backend.models;

import java.util.HashMap;

public class GameBoard {
    private HashMap<Position,Piece> board;

    public Piece getPieceAtPosition(Position position){
       return board.get(position);
    }
    public void setPieceAtPosition(Position position, Piece piece){
        board.put(position, piece);
    }

    public void removePieceAtPosition(Position position){
        board.remove(position);
    }

    public void startGame(){

    }
}
