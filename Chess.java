import java.util.ArrayList;
import java.util.Scanner;

public class Chess {
    //main method will be here.
    ArrayList<ChessPiece> whiteTook = new ArrayList<ChessPiece>();
    ArrayList<ChessPiece> blackTook = new ArrayList<ChessPiece>();

    public static void main(String[] args) {

        ChessPiece[][] board = ChessBoard.createBoard();
        //ChessPiece test = board[0][1];
        Scanner in = new Scanner(System.in);
        
        System.out.println("Initializing board...");
        ChessBoard.visualize(board);
        System.out.println("Board initalizied."); //yes im doing this because it makes me feel like im launching a rocket.
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
                System.out.println("It is whites turn. Please select a piece you would like to move. Input as is follows: xCoord, YCoord. Ex: 0, 1");
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
                else if (board[xPos][yPos].getColor() != 'w' ){
                    System.out.println("This isn't your piece. Choose a white piece.");
                }
                else{
                    while (true){//move loop
                        System.out.println("Choose a place to move the piece to. Input is as follows: xCoord, yCoord. Ex; 0, 1. Q to select a different piece");{
                            String firstInput = "q"; //If this happens, something went wrong and it didnt get caught properly.
                            int xCoord = 9;
                            int yCoord = 9;
                            try{
                                String input = in.nextLine().replace(",", ""); //Issue here. 
                                input = input.replaceAll("\\s+","");
                                firstInput = input.substring(0, 0); //Surround with try catch. Index out of bounds
                                String secondInput = input.substring(1, 1);

                                xCoord = Integer.parseInt(firstInput);
                                yCoord = Integer.parseInt(secondInput);
                                }
                            catch (IndexOutOfBoundsException x){
                                System.out.println("Something bad."); //think of better message
                                continue;
                            }   
                            

                            if (firstInput.toLowerCase().equals("q")){  //quit
                                break;
                            }
                            else if (xCoord > 8 ||xCoord< 0){
                                System.out.println("The given X Position is not within the bounds of the board. Please try again.");
                                continue; //may not be needed but keeping it here for now
                            }
                            else if (yCoord > 8 || yCoord < 0){
                                System.out.println("The given Y Position is not within the bounds of the board. Please try again.");
                                continue;
                            }
                            else{
                                String location = "xCoord:" + xCoord + ",yCoord: " + yCoord;
                                ChessPiece piece = board[xPos][yPos];
                                ArrayList moves = piece.checkMoves(); //might need to do same magic with getColor();. Not sure if this will work. I geuss we will see!!
                            }

                        }
                    }
                }
            }
            
        }
    }
}
