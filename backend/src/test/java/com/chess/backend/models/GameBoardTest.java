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
    }


    @Test
    void itShouldCheckWhitePiecesAreInTheRightPlaceAfterGameStarts() {
        //given
        //when
        gameBoard.startGame();
        //then
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

    //TODO: add Tests for black pieces + all pawns
}