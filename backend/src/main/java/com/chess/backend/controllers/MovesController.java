package com.chess.backend.controllers;

import com.chess.backend.models.Piece;
import com.chess.backend.models.Position;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovesController {
    @PostMapping("/api/v1/movePiece")
    public void makeNewMove(Piece piece, Position oldPosition, Position newPosition){

    }
}
