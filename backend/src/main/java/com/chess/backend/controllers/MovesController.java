package com.chess.backend.controllers;

import com.chess.backend.models.Position;
import com.chess.backend.models.RequestData;
import com.chess.backend.models.ResponseData;
import com.chess.backend.models.pieces.Piece;
import com.chess.backend.service.MovesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MovesController {
    @Autowired
    private MovesService movesService;

    @PostMapping("/api/v1/movePiece/")
    public ResponseEntity<ResponseData> movePiece(
            @RequestBody RequestData positions) {
        var body = movesService.makeMove(positions.getFirstPositionInstance(),
                positions.getSecondPositionInstance());
        var status = HttpStatus.OK;
        return new ResponseEntity<>(body, status);
    }

    @PostMapping("/api/v1/start")
    public ResponseEntity<String> startGame() {
        movesService.startGame();
        var responseBody = "Game started succesfully";
        return new ResponseEntity<>(responseBody, HttpStatus.OK);
    }

    /**
     * Gets the piece at position X,Y.
     * To be determined if will get to prod or just for development / testing
     * purposes
     *
     * @param x
     * @param y
     * @return
     */
    @GetMapping("/api/v1/getPiece/{x}/{y}")
    public ResponseEntity<Piece> getPiece(@PathVariable short x,
                                          @PathVariable short y) {
        var firstPosition = Position.getPosition(x, y);
        Piece body = movesService.getPiece(firstPosition);
        var status = HttpStatus.OK;
        return new ResponseEntity<>(body, status);
    }
}
