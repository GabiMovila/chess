package com.chess.backend.exceptions;

import com.chess.backend.models.ResponseData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandler {
    @org.springframework.web.bind.annotation.ExceptionHandler(IllegalMoveException.class)
    @ResponseBody
    public ResponseEntity<ResponseData> handleIllegalMoveException(IllegalMoveException ex) {
        ResponseData errorResponse = new ResponseData();
        errorResponse.setValidMove(false);
        return new ResponseEntity<>(errorResponse, HttpStatus.OK);
    }
}
