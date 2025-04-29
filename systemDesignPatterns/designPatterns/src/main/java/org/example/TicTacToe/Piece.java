package org.example.TicTacToe;

public class Piece {
    PieceType pieceType;
    public Piece(PieceType pieceType){
        this.pieceType = pieceType;
    }

    PieceType getPieceType(){
        return this.pieceType;
    }
}
