package org.example.SnakeLadder;

import java.util.List;

public class Game {
    Dice dice;
    List<Player> playerList;

    Board board;

    public Game(Dice dice, List<Player> playerList, Board board){
        this.dice = dice;
        this.playerList = playerList;
        this.board = board;
    }

    void play(){
        while(true){
            for(Player p: playerList){
                int move = dice.roll();
                Position nextPos = board.getNextPosition(p.position, move);
                while(board.isSnakePresent(nextPos)||board.isLadderPresent(nextPos)){
                    if(board.isSnakePresent(nextPos)){
                        nextPos = board.getEndPositionSnake(nextPos);
                    }
                    if(board.isLadderPresent(nextPos)){
                        nextPos = board.getEndPositionLadder(nextPos);
                    }
                }
                p.setPosition(nextPos);
                if(isWinner(p.position)){
                    System.out.println("Winner ");
                    return;
                }
            }
        }
    }

    boolean isWinner(Position p){
        if(board.isEndPosition(p))return true;
        return false;
    }

}
