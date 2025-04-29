package org.example.TicTacToe;

import java.util.List;
import java.util.Scanner;

public class Game {
    List<Player> playerList;

    Board board;

    BoardPrinter boardPrinter;

    public Game(Board board, List<Player> playerList, BoardPrinter boardPrinter){
        this.playerList = playerList;
        this.board = board;
        this.boardPrinter = boardPrinter;
    }


    boolean makeMove(int x, int y, Player player){
        return board.placePiece(x, y, player.piece);
    }

    boolean win(){
        if(board.allSameCol() || board.allSameRow() || board.sameRightDiagonal() || board.sameLeftDiagonal())return true;
        return false;
    }

    boolean draw(){
        return board.allFilled();
    }

    void startGame(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            for(var player: playerList){
                boardPrinter.print();
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                makeMove(x,y, player);
                if(win()){
                    System.out.println("\n Player wins "+player.name);
                    boardPrinter.print();
                    return;
                }
                if(draw()){
                    System.out.println("\n Game is draw");
                    boardPrinter.print();
                    return;
                }
            }
        }
    }



}
