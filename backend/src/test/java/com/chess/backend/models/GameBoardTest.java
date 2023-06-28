package com.chess.backend.models;

import com.chess.backend.models.pieces.*;
import com.chess.backend.types.PieceColor;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class GameBoardTest {

    private static GameBoard gameBoard;

    @BeforeAll
    static void beforeAll() {
        gameBoard = GameBoard.getInstance();
        gameBoard.startGame();
    }


    @Test
    void itShouldCheckWhitePiecesAreInTheRightPlaceAfterGameStarts() {
        Piece response = gameBoard.getPieceAtPosition(Position.getPosition(1,1));
        assertThat(response).isInstanceOf(Rook.class);
        assertThat(response.color).isEqualTo(PieceColor.WHITE);

        response = gameBoard.getPieceAtPosition(Position.getPosition(2,1));
        assertThat(response).isInstanceOf(Knight.class);
        assertThat(response.color).isEqualTo(PieceColor.WHITE);

        response = gameBoard.getPieceAtPosition(Position.getPosition(3,1));
        assertThat(response).isInstanceOf(Bishop.class);
        assertThat(response.color).isEqualTo(PieceColor.WHITE);

        response = gameBoard.getPieceAtPosition(Position.getPosition(4,1));
        assertThat(response).isInstanceOf(Queen.class);
        assertThat(response.color).isEqualTo(PieceColor.WHITE);

        response = gameBoard.getPieceAtPosition(Position.getPosition(5,1));
        assertThat(response).isInstanceOf(King.class);
        assertThat(response.color).isEqualTo(PieceColor.WHITE);

        response = gameBoard.getPieceAtPosition(Position.getPosition(6,1));
        assertThat(response).isInstanceOf(Bishop.class);
        assertThat(response.color).isEqualTo(PieceColor.WHITE);

        response = gameBoard.getPieceAtPosition(Position.getPosition(7,1));
        assertThat(response).isInstanceOf(Knight.class);
        assertThat(response.color).isEqualTo(PieceColor.WHITE);

        response = gameBoard.getPieceAtPosition(Position.getPosition(8,1));
        assertThat(response).isInstanceOf(Rook.class);
        assertThat(response.color).isEqualTo(PieceColor.WHITE);
    }

    @Test
    void itShouldCheckBlackPiecesAreInTheRightPlaceAfterGameStarts() {
        Piece response = gameBoard.getPieceAtPosition(Position.getPosition(1,8));
        assertThat(response).isInstanceOf(Rook.class);
        assertThat(response.color).isEqualTo(PieceColor.BLACK);

        response = gameBoard.getPieceAtPosition(Position.getPosition(2,8));
        assertThat(response).isInstanceOf(Knight.class);
        assertThat(response.color).isEqualTo(PieceColor.BLACK);

        response = gameBoard.getPieceAtPosition(Position.getPosition(3,8));
        assertThat(response).isInstanceOf(Bishop.class);
        assertThat(response.color).isEqualTo(PieceColor.BLACK);

        response = gameBoard.getPieceAtPosition(Position.getPosition(4,8));
        assertThat(response).isInstanceOf(Queen.class);
        assertThat(response.color).isEqualTo(PieceColor.BLACK);

        response = gameBoard.getPieceAtPosition(Position.getPosition(5,8));
        assertThat(response).isInstanceOf(King.class);
        assertThat(response.color).isEqualTo(PieceColor.BLACK);

        response = gameBoard.getPieceAtPosition(Position.getPosition(6,8));
        assertThat(response).isInstanceOf(Bishop.class);
        assertThat(response.color).isEqualTo(PieceColor.BLACK);

        response = gameBoard.getPieceAtPosition(Position.getPosition(7,8));
        assertThat(response).isInstanceOf(Knight.class);
        assertThat(response.color).isEqualTo(PieceColor.BLACK);

        response = gameBoard.getPieceAtPosition(Position.getPosition(8,8));
        assertThat(response).isInstanceOf(Rook.class);
        assertThat(response.color).isEqualTo(PieceColor.BLACK);
    }

    @Test
    void itShouldCheckPawnsAreInTheRightPlaceAfterGameStarts() {
        for (int i=1; i<=8; i++){
            Piece response = gameBoard.getPieceAtPosition(Position.getPosition(i,2));
            assertThat(response).isInstanceOf(Pawn.class);
            assertThat(response.color).isEqualTo(PieceColor.WHITE);
        }

        for (int i=1; i<=8; i++){
            Piece response = gameBoard.getPieceAtPosition(Position.getPosition(i,7));
            assertThat(response).isInstanceOf(Pawn.class);
            assertThat(response.color).isEqualTo(PieceColor.BLACK);
        }

    }

    //TODO: add Tests for black pieces + all pawns
}