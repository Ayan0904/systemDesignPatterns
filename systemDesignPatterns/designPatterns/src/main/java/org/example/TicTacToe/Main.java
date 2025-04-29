package org.example.TicTacToe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Player> playerList = new ArrayList<>();
        playerList.add(new Player("Ayan", new Piece(PieceType.X)));
        playerList.add(new Player("Sasuke", new Piece(PieceType.O)));

        Board board = new Board(3);
        BoardPrinter boardPrinter = new ConsoleBoardPrinter(board);
        Game game = new Game(board, playerList, boardPrinter);
        game.startGame();

    }
}
