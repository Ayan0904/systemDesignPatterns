package org.example.TicTacToe;

import java.util.HashSet;
import java.util.Set;

public class Board {
    Piece [][]matrix;

    int size;

    public Board(int size){
        this.size = size;
        matrix = new Piece[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                matrix[i][j]=null;
            }
        }
    }

    boolean placePiece(int x, int y, Piece piece){
        if(matrix[x][y]==null){
            matrix[x][y]=piece;
            return true;
        }
        return false;
    }

    public boolean allSameRow(){
        for(int i=0;i<size;i++){
            Set<PieceType> st = new HashSet<>();
            boolean nullFlag = false;
            for(int j=0;j<size;j++) {
                if(matrix[i][j]==null){
                    nullFlag = true;
                    break;
                }
                st.add(matrix[i][j].getPieceType());
                if (st.size() > 1) {
                    break;
                }
            }
            if(nullFlag)continue;
            if(st.size()==1)return true;
        }
        return false;
    }

    public boolean allSameCol(){
        for(int j=0;j<size;j++){
            Set<PieceType> st = new HashSet<>();
            boolean nullFlag = false;
            for(int i=0;i<size;i++){
                if(matrix[i][j]==null){
                    nullFlag = true;
                    break;
                }
                st.add(matrix[i][j].getPieceType());
                if (st.size() > 1) {
                    break;
                }
            }
            if(nullFlag)continue;
            if(st.size()==1)return true;
        }
        return false;
    }

    public boolean sameRightDiagonal(){
        Set<PieceType > st = new HashSet<>();
//        boolean nullFlag = false;
        for(int i=0,j=0;i<size && j<size;i++,j++){
            if(matrix[i][j]==null){
//                nullFlag = true;
                return false;
            }
            st.add(matrix[i][j].getPieceType());
            if(st.size()>1)return false;

        }
        return true;
    }

    public boolean sameLeftDiagonal(){
        Set<PieceType > st = new HashSet<>();
//        boolean nullFlag = false;
        for(int i=0,j=size-1;i<size && j>=0;i++,j--){
            if(matrix[i][j]==null){
//                nullFlag = true;
                return false;
            }
            st.add(matrix[i][j].getPieceType());
            if(st.size()>1)return false;
        }
        return true;
    }


    public boolean allFilled(){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(matrix[i][j]==null)return false;
            }
        }
        return true;
    }


}
