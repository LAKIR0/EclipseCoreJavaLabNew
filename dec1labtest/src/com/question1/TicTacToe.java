package com.question1;
import java.io.FileReader; 
import java.io.BufferedReader; 
import java.io.File; 
import java.io.IOException; 
import java.io.FileWriter; 
import java.util.*;


public class TicTacToe { 
    private static int[][] board = new int[3][3]; 
    private static int turn = 0; 
    private static int player1Wins = 0; 
    private static int player2Wins = 0; 
    private static int draws = 0; 

    public static void main(String[] args) { 
        // Create a Scanner to read user input 
        Scanner input = new Scanner(System.in); 

        // Display the menu
        displayMenu(); 

        // Read the user's choice 
        int choice = input.nextInt(); 

        while (choice != 4) { 
            if (choice == 1) { 
                // Play the game
                playGame(); 
            } else if (choice == 2) { 
                // Display instructions 
                showInstructions(); 
            } else if (choice == 3) { 
                // Display the win percentages 
                displayWinPercentages(); 
            } else { 
                System.out.println("Invalid choice!"); 
            } 

            // Display the menu 
            displayMenu(); 

            // Read the user's choice 
            choice = input.nextInt(); 
            input.close();
        } 

        // Exit the program 
        System.out.println("Thanks for playing!"); 
    } 

    // Method to display the menu 
    public static void displayMenu() { 
        System.out.println("\n1. Play"); 
        System.out.println("2. Instructions"); 
        System.out.println("3. Win Percentages"); 
        System.out.println("4. Exit"); 
        System.out.print("\nEnter your choice: "); 
    } 

    // Method to play the game 
    public static void playGame() { 
        // Create a Scanner to read user input 
        Scanner input = new Scanner(System.in); 

        // Initialize the board 
        initializeBoard(); 
        System.out.println("Game started!\n"); 

        // Continue the game until the board is full or someone wins 
        while (turn < 9 && checkWinner() == 0) { 
            // Print the board 
            printBoard(); 

            // Prompt the user for their move 
            System.out.print("Player " + (turn % 2 + 1) + ", enter your move: "); 
            int move = input.nextInt(); 

            // Make the move 
            makeMove(move); 
            input.close();
        } 

        // Print the board 
        printBoard(); 

        // Determine the winner 
        int winner = checkWinner(); 

        if (winner == 0) { 
            System.out.println("It's a draw!"); 
            draws++; 
        } else { 
            System.out.println("Player " + winner + " wins!"); 
            if (winner == 1) 
                player1Wins++; 
            else 
                player2Wins++; 
        } 
        // Update the scores in the text file 
        updateScores(); 

        // Reset the board 
        resetBoard(); 
    } 

    // Method to show instructions
    public static void showInstructions() { 
        System.out.println("\nInstructions:"); 
        System.out.println("Two players take turns placing their symbol (X or O) on the 3x3 board."); 
        System.out.println("The player who gets three of their symbols in a row (horizontal, vertical, or diagonal) wins the game."); 
        System.out.println("If all nine squares are filled and neither player has three symbols in a row, the game is a draw.\n"); 
    } 

    // Method to display the win percentages
    public static void displayWinPercentages() { 
        // Read the scores from the text file 
        readScores(); 
        System.out.println("\nPlayer 1 Win Percentage: " + (player1Wins * 100.0 / (player1Wins + player2Wins + draws)) + "%"); 
        System.out.println("Player 2 Win Percentage: " + (player2Wins * 100.0 / (player1Wins + player2Wins + draws)) + "%"); 
    } 

    // Method to initialize the board 
    public static void initializeBoard() { 
        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 3; j++) { 
                board[i][j] = 0; 
            } 
        } 
    } 

    // Method to print the board 
    public static void printBoard() { 
        System.out.println("------------"); 
        for (int i = 0; i < 3; i++) { 
            System.out.print("| "); 
            for (int j = 0; j < 3; j++) { 
                if (board[i][j] == 1) 
                    System.out.print("X | "); 
                else if (board[i][j] == 2) 
                    System.out.print("O | "); 
                else 
                    System.out.print("  | "); 
            } 
            System.out.println("\n------------"); 
        } 
    } 

    // Method to make a move 
    public static void makeMove(int move) { 
        if (move < 1 || move > 9) { 
            System.out.println("Invalid move!"); 
            return; 
        } 

        int row = (move - 1) / 3; 
        int col = (move - 1) % 3; 

        if (board[row][col] != 0) { 
            System.out.println("Invalid move!"); 
            return; 
        } 

        board[row][col] = (turn % 2) + 1; 
        turn++; 
    } 

    // Method to check the winner 
    public static int checkWinner() { 
        // Check the rows 
        for (int i = 0; i < 3; i++) { 
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2]) { 
                return board[i][0]; 
            } 
        } 

        // Check the columns 
        for (int j = 0; j < 3; j++) { 
            if (board[0][j] == board[1][j] && board[1][j] == board[2][j]) { 
                return board[0][j]; 
            } 
        } 

        // Check the diagonals 
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) { 
            return board[0][0]; 
        } 
        if (board[2][0] == board[1][1] && board[1][1] == board[0][2]) { 
            return board[2][0]; 
        } 

        return 0; 
    } 

    // Method to reset the board 
    public static void resetBoard() { 
        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 3; j++) { 
                board[i][j] = 0; 
            } 
        } 
        turn = 0; 
    } 

    // Method to update the scores in a text file 
    public static void updateScores() { 
        try { 
            File file = new File("scores.txt"); 
            FileWriter fw = new FileWriter(file); 
            fw.write(player1Wins + "\n" + player2Wins + "\n" + draws); 
            fw.close(); 
        } catch (IOException e) { 
            System.out.println("Error writing to file!"); 
        } 
    } 

    // Method to read the scores from the text file 
    public static void readScores() { 
        try { 
            FileReader fr = new FileReader("scores.txt"); 
            BufferedReader br = new BufferedReader(fr); 
            player1Wins = Integer.parseInt(br.readLine()); 
            player2Wins = Integer.parseInt(br.readLine()); 
            draws = Integer.parseInt(br.readLine()); 
            br.close(); 
        } catch (IOException e) { 
            System.out.println("Error reading from file!"); 
        } 
    } 
}