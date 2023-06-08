package com.chess.backend.controllers;

import com.chess.backend.Service.MovesService;
import com.chess.backend.models.Piece;
import com.chess.backend.models.Position;
import com.chess.backend.models.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovesController {
    @Autowired
    private MovesService movesService;
    @PostMapping("/api/v1/movePiece")
    public ResponseEntity<ResponseData> movePiece(Piece piece, Position oldPosition, Position newPosition){
        var response = movesService.makeMove(piece, oldPosition, newPosition);
        var status = HttpStatus.OK;
        return new ResponseEntity<>(response,status);
    }
}
