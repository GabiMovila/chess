package com.chess.backend.models.pieces;

import com.chess.backend.models.GameBoard;
import com.chess.backend.models.Position;
import com.chess.backend.types.PieceColor;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class PawnTest {
    private static GameBoard gameBoard;
    private Pawn pawnWhite= new Pawn(PieceColor.WHITE);
    private Pawn pawnBlack= new Pawn(PieceColor.BLACK);

    @BeforeAll
     static void beforeAll() {
        gameBoard = GameBoard.getInstance();
        gameBoard.startGame();
    }

    @Test
    void itShouldAllowWhitePawnToMoveForwardOneSquare() {
        //given
        Position oldPosition = Position.getPosition(4,2);
        Position newPosition = Position.getPosition(4,3);
        //when
        boolean result = pawnWhite.isMovePossible(oldPosition,newPosition);
        //then
        assertThat(result).isTrue();
    }

    @Test
    void itShouldAllowBlackPawnToMoveForwardOneSquare() {
        //given
        Position oldPosition = Position.getPosition(4,7);
        Position newPosition = Position.getPosition(4,6);
        //when
        boolean result = pawnBlack.isMovePossible(oldPosition,newPosition);
        //then
        assertThat(result).isTrue();
    }

    @Test
    void itShouldAllowBlackPawnToCaptureOppositePieceLeftSide() {
        //given
        Position oldPosition = Position.getPosition(4,7);
        Position newPosition = Position.getPosition(3,6);
        //set opposite piece
        Piece oppositePiece = new Bishop(PieceColor.WHITE);
        gameBoard.setPieceAtPosition(newPosition, oppositePiece);
        //when
        boolean result = pawnBlack.isMovePossible(oldPosition,newPosition);
        //then
        assertThat(result).isTrue();
    }

    @Test
    void itShouldAllowBlackPawnToCaptureOppositePieceRightSide() {
        //given
        Position oldPosition = Position.getPosition(4,7);
        Position newPosition = Position.getPosition(5,6);
        //set opposite piece
        Piece oppositePiece = new Bishop(PieceColor.WHITE);
        gameBoard.setPieceAtPosition(newPosition, oppositePiece);

        //when
        boolean result = pawnBlack.isMovePossible(oldPosition,newPosition);
        //then
        assertThat(result).isTrue();
    }

    @Test
    void itShouldAllowWhitePawnToCaptureOppositePieceLeftSide() {
        //given
        Position oldPosition = Position.getPosition(4,2);
        Position newPosition = Position.getPosition(3,3);
        //set opposite piece
        Piece oppositePiece = new Bishop(PieceColor.BLACK);
        gameBoard.setPieceAtPosition(newPosition, oppositePiece);
        //when
        boolean result = pawnWhite.isMovePossible(oldPosition,newPosition);
        //then
        assertThat(result).isTrue();
    }

    @Test
    void itShouldAllowWhitePawnToCaptureOppositePieceRightSide() {
        //given
        Position oldPosition = Position.getPosition(4,2);
        Position newPosition = Position.getPosition(5,3);
        //set opposite piece
        Piece oppositePiece = new Bishop(PieceColor.BLACK);
        gameBoard.setPieceAtPosition(newPosition, oppositePiece);
        //when
        boolean result = pawnWhite.isMovePossible(oldPosition,newPosition);
        //then
        assertThat(result).isTrue();
    }

    @Test
    void itShouldNotAllowBlackPawnToCaptureSamePieceLeftSide() {
        //given
        Position oldPosition = Position.getPosition(4,7);
        Position newPosition = Position.getPosition(3,6);
        //set opposite piece
        Piece oppositePiece = new Bishop(PieceColor.BLACK);
        gameBoard.setPieceAtPosition(newPosition, oppositePiece);
        //when
        boolean result = pawnBlack.isMovePossible(oldPosition,newPosition);
        //then
        assertThat(result).isFalse();
    }
    //TODO: Continue with the tests that should return false.

}