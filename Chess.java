import java.util.ArrayList;
import java.util.Scanner;

public class Chess {
    
    static ArrayList<ChessPiece> whiteTook = new ArrayList<ChessPiece>();
    static ArrayList<ChessPiece> blackTook = new ArrayList<ChessPiece>();

    public static void main(String[] args) {

        ChessPiece[][] board = ChessBoard.createBoard();
        Scanner in = new Scanner(System.in);
        
        System.out.println("Initializing board...");
        ChessBoard.visualize(board);
        System.out.println("Board initialized."); //yes im doing this because it makes me feel like im launching a rocket.
                                                    //except the rocket is my code and therefore the inhabitants are doomed
        
        while (true){
            System.out.println("White, would you like possible moves to be printed?");
            String input = in.nextLine();
            if (input.toLowerCase().equals("no")){
                ChessPiece.WHITE_PRINT_POSSIBLE_MOVES = false;
                break;
            }
            else if (input.toLowerCase().equals("yes")){
                ChessPiece.WHITE_PRINT_POSSIBLE_MOVES = true;
                break;
            }
            else{
                System.out.println("Input not recognized. Please try again.");
            }
        }
        while (true){
            System.out.println("Black, would you like possible moves to be printed?");
            String input = in.nextLine();
            if (input.toLowerCase().equals("no")){
                ChessPiece.BLACK_PRINT_POSSIBLE_MOVES = false;
                break;
            }
            else if (input.toLowerCase().equals("yes")){
                ChessPiece.BLACK_PRINT_POSSIBLE_MOVES = true;
                break;
            }
            else{
                System.out.println("Input not recognized. Please try again.");
            }
        }
        while (true){ //game 
            while (true){ //white run
                System.out.println("It is White's turn. Please select a piece you would like to move. Input as is follows: xCoord, yCoord. Ex: 0, 1");
                int xPos = in.nextInt();
                int yPos = in.nextInt();

                if (xPos > 8 || xPos < 0){
                    System.out.println("X position is not within the bounds of the board. Choose a number from 0 to 7.");

                }
                else if (yPos > 8 || yPos < 0){
                    System.out.println("Y position is not within the bounds of the board. Choose a number from 0 to 7."); 
                }
                else if (board[xPos][yPos] == null){
                    System.out.println("There is no piece there.");
                    continue;
                }
                else if (board[xPos][yPos].getColor() != 'w' ){
                    System.out.println("This isn't your piece. Choose a white piece.");
                }
                else{
                    while (true){//move loop
                        System.out.println("Choose a place to move the piece to. Input is as follows: xCoord, yCoord. Ex; 0, 1. Q to select a different piece");
                            //Add possible moves here is WHITE_PRINT_POSSIBLE_MOVES is on. same for black
                            if (ChessPiece.WHITE_PRINT_POSSIBLE_MOVES){
                                ArrayList<String> possibleMovesWhite = board[xPos][yPos].checkMoves();
                                System.out.println(possibleMovesWhite);
                            }
                            
                            int xCoord;
                            int yCoord;
                            if (!in.hasNextInt()){
                                if (in.nextLine().toLowerCase().equals("q")){
                                    break;
                                }
                            }
                            else{
                                xCoord = in.nextInt();
                                yCoord = in.nextInt();
                                if (xCoord > 8 ||xCoord< 0){
                                    System.out.println("The given X Position is not within the bounds of the board. Please try again.");
                                    continue; //may not be needed but keeping it here for now
                                }
                                else if (yCoord > 8 || yCoord < 0){
                                    System.out.println("The given Y Position is not within the bounds of the board. Please try again.");
                                    continue;
                                }
                                else{
                                    String location = "xCoord: " + xCoord + ",yCoord: " + yCoord;
                                    ChessPiece piece = board[xPos][yPos];
                                    ArrayList<String> moves = piece.checkMoves(); //Seems to call right checkMoves. 
                                    if (moves.indexOf(location) != -1){
                                        if (board[xCoord][yCoord] != null){
                                            whiteTook.add(board[xCoord][yCoord]);
                                        }
                                        board[xCoord][yCoord] = piece;
                                        piece.setX(xCoord);
                                        piece.setY(yCoord);
                                        board[xPos][yPos] = null;
                                        ChessBoard.visualize(board);
                                        break;
                                    }
                                    else{
                                        System.out.println("That is not a possible move. Try turning on possible moves.");
                                    }
                                }
                            }
                    }
                }
                break;
            }
            while (true){ //black run
                System.out.println("It is Black's turn. Please select a piece you would like to move. Input as is follows: xCoord, yCoord. Ex: 0, 1");
                int xPos = in.nextInt();
                int yPos = in.nextInt();

                if (xPos > 8 || xPos < 0){
                    System.out.println("X position is not within the bounds of the board. Choose a number from 0 to 7.");

                }
                else if (yPos > 8 || yPos < 0){
                    System.out.println("Y position is not within the bounds of the board. Choose a number from 0 to 7."); 
                }
                else if (board[xPos][yPos] == null){
                    System.out.println("There is no piece there.");
                }
                else if (board[xPos][yPos].getColor() != 'b' ){
                    System.out.println("This isn't your piece. Choose a black piece.");
                }
                else{
                    while (true){//move loop
                        System.out.println("Choose a place to move the piece to. Input is as follows: xCoord, yCoord. Ex; 0, 1. Q to select a different piece");
                            
                            if (ChessPiece.BLACK_PRINT_POSSIBLE_MOVES){
                                ArrayList<String> possibleMovesBlack = board[xPos][yPos].checkMoves();
                                System.out.println(possibleMovesBlack);
                            }
                            int xCoord;
                            int yCoord;
                            if (!in.hasNextInt()){
                                if (in.nextLine().toLowerCase().equals("q")){
                                    break;
                                }
                            }
                            else{
                                xCoord = in.nextInt();
                                yCoord = in.nextInt();
                                if (xCoord > 8 ||xCoord< 0){
                                    System.out.println("The given X Position is not within the bounds of the board. Please try again.");
                                    continue; //may not be needed but keeping it here for now
                                }
                                else if (yCoord > 8 || yCoord < 0){
                                    System.out.println("The given Y Position is not within the bounds of the board. Please try again.");
                                    continue;
                                }
                                else{
                                    String location = "xCoord: " + xCoord + ",yCoord: " + yCoord;
                                    ChessPiece piece = board[xPos][yPos];
                                    ArrayList<String> moves = piece.checkMoves(); //Seems to call right checkMoves. 
                                    if (moves.indexOf(location) != -1){
                                        if (board[xCoord][yCoord] != null){
                                            blackTook.add(board[xCoord][yCoord]);
                                        }
                                        board[xCoord][yCoord] = piece;
                                        piece.setX(xCoord);
                                        piece.setY(yCoord);
                                        board[xPos][yPos] = null;
                                        ChessBoard.visualize(board);
                                        break;
                                    }
                                    else{
                                        System.out.println("That is not a possible move. Try turning on possible moves.");
                                    }
                                    
                                    
                                    
                                }
                            }
                            
                            

                    }
                }
                break;
            }
            
            
        }
        //in.close();
    }
    
}
