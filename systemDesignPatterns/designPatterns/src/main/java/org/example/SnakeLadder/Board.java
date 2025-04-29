package org.example.SnakeLadder;

import java.util.List;

public class Board {
    Position [][]board;
    int n;
    int m;
    List<Snake> snakeList;
    List<Ladder> ladderList;

    public Board(int n, int m, List<Snake> snakeList, List<Ladder> ladderList){
        this.snakeList = snakeList;
        this.ladderList = ladderList;
        this.n = n;
        this.m = m;
        board = new Position[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                board[i][j] = new Position(i,j);
            }
        }
    }

    boolean isSnakePresent(Position p){
        for(Snake s: snakeList){
            if(s.startPosition.x == p.x && s.startPosition.y == p.y) {
                return true;
            }
        }
        return false;
    }

    boolean isLadderPresent(Position p){
        for(Ladder s: ladderList){
            if(s.startPosition.x == p.x && s.startPosition.y == p.y) {
                return true;
            }
        }
        return false;
    }

    Position getEndPositionSnake(Position p){
        for(Snake s: snakeList){
            if(s.startPosition.x == p.x && s.startPosition.y == p.y) {
                return s.endPosition;
            }
        }
        return null;
    }

    Position getEndPositionLadder(Position p){
        for(Ladder s: ladderList){
            if(s.startPosition.x == p.x && s.startPosition.y == p.y) {
                return s.endPosition;
            }
        }
        return null;
    }

    Position getNextPosition(Position p, int move){
        Position newp = new Position(0,0);
        if(p.y+move>=n){
            newp.y = (p.y + move)%n;
            if(p.x + 1>=m){
                newp.x = n-1;
                newp.y = m-1;
            }
            else {
                newp.x = p.x + 1;
            }
        }
        else{
            newp.x = p.x;
            newp.y = p.y + move;
        }

        return newp;
    }

    boolean isEndPosition(Position p){
        if(p.x==m-1&&p.y==n-1)return true;
        return false;
    }

}
