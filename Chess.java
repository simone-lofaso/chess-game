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
            while (true){
                System.out.println("It is whites turn. Please select a piece you would like to move. Input as is follows: xCoord, YCoord. Ex: 0, 1");
                int xPos = in.nextInt();
                int yPos = in.nextInt();

                if (xPos > 8 || xPos < 0){
                 System.out.println("X position is not accurate.");

                }
                else if (yPos > 8 || yPos < 0){
                    System.out.println("Y position is not accurate."); 
                }
                else if (board[xPos][yPos] == null){
                    System.out.println("There is no piece there.");
                }
                else if (board[xPos][yPos].getColor() != 'w'){
                    System.out.println("Thats not your piece.");
                }
                else{
                    System.out.println("ASFWF");
                }
            }
            
        }
    }
}
