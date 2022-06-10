import java.util.ArrayList;
import java.util.Scanner;
public class Pawn extends ChessPiece implements Piece{
    private int xCoord; //check King.java for com
    private int yCoord;
    private char color;

    public ArrayList<String> possibleMoves;
    /**
     * Pawn object initializer. X and Y coordinates will be updated as the Pawn is moved. Does not contain error checking as it is never used by the user.
     * 
     * @param x Starting X coordinate
     * @param y Starting y Coordinate
     * @param color Pawn color 
     */
    public Pawn(int x, int y, char color){
        this.color = color;
        xCoord = x;
        yCoord = y;
    }
    /**
     * Checks possible moves of the selected Pawn and adds them to an ArrayList type String. Chess.java uses this to see if a user requested move is valid.
     * 
     * @return ArrayList type String containing all possible moves in format "xCoord: x, yCoord: y"
     */
     //Seems to work fine. Consider removing y constraints for take moves.
    public ArrayList<String> checkMoves(){
        possibleMoves = new ArrayList<String>();
        if (color == 'b'){
            if (yCoord == 1){
                if(ChessBoard.board[xCoord][yCoord + 1] == null && (ChessBoard.board[xCoord][yCoord + 2] == null)){ 
                    possibleMoves.add("xCoord: " + xCoord + ",yCoord: " + (yCoord + 2)); 
                }
            }
            if (ChessBoard.board[xCoord][yCoord + 1] == null){;
                possibleMoves.add("xCoord: " + xCoord + ",yCoord: " + (yCoord + 1)); 
            }
            if (xCoord - 1 >= 0 && yCoord + 1 >= 0){
                if (ChessBoard.board[xCoord - 1][yCoord + 1] != null){ //take moving west
                    if (ChessBoard.board[xCoord - 1][yCoord + 1].getColor() == 'w' ){ 
                        possibleMoves.add("xCoord: " + (xCoord - 1) + ",yCoord: " + (yCoord + 1)); 
                    }
                }
            } 
            if (xCoord + 1 < 8 && yCoord + 1 >= 0){ 
                if (ChessBoard.board[xCoord + 1][yCoord + 1] != null){ //take move east
                    if (ChessBoard.board[xCoord + 1][yCoord + 1].getColor() == 'w'){
                        possibleMoves.add("xCoord: " + (xCoord + 1) + ",yCoord: " + (yCoord + 1)); 
                    }
                }
             } 
        }
        else if (color == 'w'){
            if (yCoord == 6){
                if(ChessBoard.board[xCoord][yCoord - 1] == null && (ChessBoard.board[xCoord][yCoord - 2] == null)){ 
                    possibleMoves.add("xCoord: " + xCoord + ",yCoord: " + (yCoord - 2)); 
                }
            }
            if (ChessBoard.board[xCoord][yCoord - 1] == null){
                possibleMoves.add("xCoord: " + xCoord + ",yCoord: " + (yCoord - 1)); 
            }
            if (xCoord - 1 >= 0 && yCoord - 1 >= 0){
                if (ChessBoard.board[xCoord - 1][yCoord - 1] != null){ //take moving west
                    if (ChessBoard.board[xCoord - 1][yCoord - 1].getColor() == 'b' ){ 
                        possibleMoves.add("xCoord: " + (xCoord - 1) + ",yCoord: " + (yCoord - 1)); 
                    }
                } 
            }
            if (xCoord + 1 < 8 && yCoord - 1 >= 0){  //can probably remove y constraint
                if (ChessBoard.board[xCoord + 1][yCoord - 1] != null){ //take move east
                    if (ChessBoard.board[xCoord + 1][yCoord - 1].getColor() == 'b'){
                        possibleMoves.add("xCoord: " + (xCoord + 1) + ",yCoord: " + (yCoord - 1)); 
                    }
                }
            } 
        }

        return possibleMoves;
    }
    /**
     * Used to promote a pawn to a Queen, Knight, Rook, or Bishop. 
     * 
     */
    public void promotion(){ //will call on every pawn move.    
                            
        if ((xCoord == 0 && color == 'w') || (xCoord == 7 && color == 'b')){
            Scanner in = new Scanner(System.in);
            if (color == 'w'){ //separated by color to avoid further nesting
                System.out.println("White pawn is ready for promotion. Would you like to promote to a queen, knight, rook, or bishop?");
                String input = in.nextLine();
                while (true){
                    if (input.toLowerCase().equals("queen")){
                        ChessBoard.board[xCoord][yCoord] = new Queen(xCoord, yCoord,'w');
                        break;
                    }
                    else if (input.toLowerCase().equals("knight")){
                        ChessBoard.board[xCoord][yCoord] = new Knight(xCoord, yCoord,'w');
                        break;
                    }
                    else if (input.toLowerCase().equals("rook")){
                        ChessBoard.board[xCoord][yCoord] = new Rook(xCoord, yCoord, 'w');
                        break;
                    }
                    else if (input.toLowerCase().equals("bishop")){
                        ChessBoard.board[xCoord][yCoord] = new Bishop(xCoord, yCoord,'w');
                        break;
                    }
                    else{
                      System.out.println("Input not recognized. Please try again.");
                    }
                }
            }
            else if (color == 'b'){//black
                System.out.println("Black pawn is ready for promotion. Would you like to promote to a queen, knight, rook, or bishop?");
                String input = in.nextLine();
                while (true){
                    if (input.toLowerCase().equals("queen")){
                        ChessBoard.board[xCoord][yCoord] = new Queen(xCoord, yCoord,'b');
                        break;
                    }
                    else if (input.toLowerCase().equals("knight")){
                        ChessBoard.board[xCoord][yCoord] = new Knight(xCoord, yCoord,'b');
                        break;
                    }
                    else if (input.toLowerCase().equals("rook")){
                        ChessBoard.board[xCoord][yCoord] = new Rook(xCoord, yCoord,'b');
                        break;
                    }
                    else if (input.toLowerCase().equals("bishop")){
                        ChessBoard.board[xCoord][yCoord] = new Bishop(xCoord, yCoord,'b');
                        break;
                    }
                    else{
                        System.out.println("Input not recognized. Please try again.");
                    }
                }
            }
        in.close();
        }
    }

    @Override
    public String toString(){
        return " P" + color;
    }

    public char getColor(){
        return color; 
    }
    public void setX(int x){
        xCoord = x;
    }
    public void setY(int y){
        yCoord = y;
    }
}
