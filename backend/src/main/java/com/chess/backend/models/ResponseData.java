package com.chess.backend.models;

public class ResponseData {
    private boolean validMove;

    private boolean capturedPiece;

    private boolean givesCheck;

    //TODO implement the logic for when a pawn is promoting
    private boolean promotingPiece;

    public boolean isValidMove() {
        return validMove;
    }

    public void setValidMove(boolean validMove) {
        this.validMove = validMove;
    }

    public boolean getCapturedPiece() {
        return capturedPiece;
    }

    public void setCapturedPiece(boolean capturedPiece) {
        this.capturedPiece = capturedPiece;
    }

    public boolean isGivesCheck() {
        return givesCheck;
    }

    public void setGivesCheck(boolean givesCheck) {
        this.givesCheck = givesCheck;
    }

    public boolean isPromotingPiece() {
        return promotingPiece;
    }

    public void setPromotingPiece(boolean promotingPiece) {
        this.promotingPiece = promotingPiece;
    }
}
