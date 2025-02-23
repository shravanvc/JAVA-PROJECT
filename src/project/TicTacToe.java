package project;
import java.util.Scanner;

public class TicTacToe {
    // Declare the board as a 3x3 array
    static char[][] board = new char[3][3];
    static char currentPlayer = 'X';
    static boolean gameWon = false;

    public static void main(String[] args) {
        initializeBoard();
        printBoard();
        while (!gameWon) {
            playerMove();
            printBoard();
            gameWon = checkWinner();
            if (!gameWon) {
                switchPlayer();
            }
        }
        System.out.println("Player " + currentPlayer + " wins!");
    }

    // Initialize the Tic-Tac-Toe board
    public static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    // Print the current state of the board
    public static void printBoard() {
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                System.out.print("|");
            }
            System.out.println();
            System.out.println("---------");
        }
    }

    // Handle the player's move
    public static void playerMove() {
        Scanner scanner = new Scanner(System.in);
        int row, col;

        // Keep prompting the user until they choose a valid empty cell
        while (true) {
            System.out.println("Player " + currentPlayer + ", enter row (0-2) and column (0-2): ");
            row = scanner.nextInt();
            col = scanner.nextInt();
            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                board[row][col] = currentPlayer;
                break;
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
    }

    // Check if the current player has won
    public static boolean checkWinner() {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) ||
                    (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)) {
                return true;
            }
        }
        // Check diagonals
        if ((board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
                (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer)) {
            return true;
        }
        return false;
    }

    // Switch to the other player
    public static void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }
}
