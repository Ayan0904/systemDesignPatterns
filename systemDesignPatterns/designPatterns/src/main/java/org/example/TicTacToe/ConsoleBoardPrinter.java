package org.example.TicTacToe;

public class ConsoleBoardPrinter implements BoardPrinter{
    Board board;

    public ConsoleBoardPrinter(Board board){
        this.board = board;
    }

    @Override
    public void print() {
        var matrix = board.matrix;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j< matrix[i].length;j++){
                if(matrix[i][j]==null){
                    System.out.print("-,");
                }
                else if(matrix[i][j].getPieceType()==PieceType.X){
                    System.out.print("X,");
                }
                else if(matrix[i][j].getPieceType()==PieceType.O){
                    System.out.print("0,");
                }
            }
            System.out.print("\n");
        }
    }
}
