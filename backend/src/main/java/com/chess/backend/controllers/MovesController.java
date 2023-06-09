package com.chess.backend.controllers;

import com.chess.backend.Service.MovesService;
import com.chess.backend.models.Position;
import com.chess.backend.models.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MovesController {
    @Autowired
    private MovesService movesService;
    @PostMapping("/api/v1/movePiece/{x}/{y}")
    public ResponseEntity<ResponseData> movePiece(@PathVariable short x, @PathVariable short y, @RequestBody Position secondPiece){
        var firstPosition = new Position(x,y);
        var body = movesService.makeMove(firstPosition,secondPiece);
        var status = HttpStatus.OK;
        return new ResponseEntity<>(body,status);
    }
}
