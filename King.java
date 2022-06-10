import java.util.ArrayList;
public class King extends ChessPiece implements Piece {
    private int xCoord; //manual tracking of position
    private int yCoord;
    private char color; //stores color in a character. Not using string here since i don't really see a need to. b for black, c for white
    
    public ArrayList<String> possibleMoves;
    
    /**
     * King object initializer. X and Y coordinates will be updated as the King is moved. Does not contain error checking as it is never used by the user.
     * 
     * @param x Starting X coordinate
     * @param y Starting y Coordinate
     * @param color King color 
     */
    public King(int x, int y, char color){ 
        this.color = color;
        xCoord = x;
        yCoord = y; 
    }
    /**
     * Checks possible moves and adds them to an ArrayList type String. Chess.java uses this to see if a user requested move is valid.
     * 
     * @return ArrayList type String containing all possible moves in format "xCoord: x, yCoord: y"
     */
    public ArrayList<String> checkMoves(){ 
        possibleMoves = new ArrayList<String>(); 
        
        if ((yCoord - 1 >= 0) && (color != ChessBoard.board[xCoord][yCoord - 1].getColor())){//north move possible          
            possibleMoves.add( "xCoord:" + xCoord + ",yCoord: " + (yCoord - 1));
        } 
        if ((yCoord + 1 < 8) && (color != ChessBoard.board[xCoord][yCoord + 1].getColor())){ //south move possible
            possibleMoves.add("xCoord:" + xCoord + ",yCoord: " + (yCoord + 1));
        } 
        if ((xCoord + 1 < 8) && (color != ChessBoard.board[xCoord + 1][yCoord].getColor())){ //east move possible
            possibleMoves.add("xCoord:" + (xCoord + 1) + ",yCoord: " + yCoord);
        }
        if ((xCoord - 1 >= 0) && (color != ChessBoard.board[xCoord - 1][yCoord].getColor())){ //west move possible
            possibleMoves.add("xCoord:" + (xCoord - 1) + ",yCoord: " + yCoord);
        }
        if ((xCoord + 1 < 8)  && (yCoord + 1 < 8) && (color != ChessBoard.board[xCoord + 1][yCoord].getColor())){ //southeast move possible
            possibleMoves.add("xCoord:" + (xCoord + 1) + ",yCoord: " + (yCoord + 1));
        }
        if ((xCoord - 1 >= 0)  && (yCoord + 1 < 8) && (color != ChessBoard.board[xCoord + 1][yCoord].getColor())){ //southwest move possible
            possibleMoves.add("xCoord:" + (xCoord - 1) + ",yCoord: " + (yCoord + 1));
        }
        if ((xCoord + 1 < 8)  && (yCoord - 1 >= 0) && (color != ChessBoard.board[xCoord + 1][yCoord].getColor())){ //northeast move possible
            possibleMoves.add("xCoord:" + (xCoord + 1) + ",yCoord: " + (yCoord - 1));
        }
        if ((xCoord - 1 >= 0)  && (yCoord - 1 >= 0) && (color != ChessBoard.board[xCoord + 1][yCoord].getColor())){ //northwest move possible
            possibleMoves.add("xCoord:" + (xCoord - 1) + ",yCoord: " + (yCoord - 1));
        } 
        //maybe add castling? Should designate castling in prompt for move. 
        return possibleMoves;
    }
    
    /**
     * To String method used to print the board
     * 
     * @return "K" for "King" plus the color of the King. w for white, b for black
     */
    @Override
    public String toString(){
        return " K" + color;
    }

    /**
     * Color getter
     * 
     * @return The color of the designated piece.
     */
    public char getColor(){
        return color; 
    }
    /**
     * X coordinate setter
     * 
     * @param x The new X coordinate after the move
     */
    public void setX(int x){
        xCoord = x;
    }

    /**
     *  Y coordinate setter
     * 
     * @param y The new Y coordinate after the move
     */
    public void setY(int y){
        yCoord = y;
    }
}
