package com.chess.backend.controllers;

import com.chess.backend.service.MovesService;
import com.chess.backend.models.pieces.Piece;
import com.chess.backend.models.Position;
import com.chess.backend.models.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class MovesController {
    @Autowired
    private MovesService movesService;
    @PostMapping("/api/v1/movePiece/{x}/{y}")
    public ResponseEntity<ResponseData> movePiece(@PathVariable("x") short x, @PathVariable("y") short y, @RequestBody Position secondPiece){
        var firstPosition = Position.getPosition(x,y);
        var body = movesService.makeMove(firstPosition,secondPiece);
        var status = HttpStatus.OK;
        return new ResponseEntity<>(body,status);
    }

    @PostMapping("/api/v1/start")
    public ResponseEntity<ResponseData> startGame(){
       movesService.startGame();
       return new ResponseEntity<>(new ResponseData(),HttpStatus.OK);
    }

    /**
     * Gets the piece at position X,Y.
     * To be determined if will get to prod or just for development / testing purposes
     * @param x
     * @param y
     * @return
     */
    @GetMapping("/api/v1/getPiece/{x}/{y}")
    public ResponseEntity<Piece> getPiece(@PathVariable short x, @PathVariable short y){
        var firstPosition = Position.getPosition(x,y);
        Piece body = movesService.getPiece(firstPosition);
        var status = HttpStatus.OK;
        return new ResponseEntity<>(body,status);
    }
}
