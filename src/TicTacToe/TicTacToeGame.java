package TicTacToe;

import TicTacToe.models.ListOfPlayers;
import TicTacToe.models.Player;
import TicTacToe.core.TicTacToe;
import TicTacToe.models.PlayingPiece;

import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter board dimensions (rows and columns):");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        TicTacToe game = new TicTacToe(rows, cols);
        ListOfPlayers players = new ListOfPlayers();

        System.out.println("Enter number of players:");
        int numberOfPlayers = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 1; i <= numberOfPlayers; i++) {
            System.out.println("Enter name for Player " + i + ":");
            String name = scanner.nextLine();
            System.out.println("Enter symbol for Player " + i + ":");
            String symbol = scanner.nextLine();
            players.addPlayer(new Player(name, new PlayingPiece(symbol)));
        }

        boolean gameWon = false;
        while (!game.isFull() && !gameWon) {
            game.printBoard();
            Player currentPlayer = players.getNextPlayer();
            System.out.println(currentPlayer.getName() + "'s turn (Symbol: " + currentPlayer.getPiece().getSymbol() + ")");
            System.out.println("Enter row and column:");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (game.placePiece(row, col, currentPlayer.getPiece().getSymbol())) {
                if (game.checkWin(currentPlayer.getPiece().getSymbol())) {
                    gameWon = true;
                    game.printBoard();
                    System.out.println(currentPlayer.getName() + " wins!");
                    break;
                }
            } else {
                System.out.println("Invalid move, try again.");
            }
        }

        if (!gameWon) {
            System.out.println("It's a draw!");
        }
    }
}
