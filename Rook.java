import java.util.ArrayList;
public class Rook extends ChessPiece implements Piece{
    private int xCoord; 
    private int yCoord;
    private char color; 
    
    public ArrayList<String> possibleMoves;
    
     /**
     * Rook object initializer. X and Y coordinates will be updated as the Rook is moved. Does not contain error checking as it is never used by the user.
     * 
     * @param x Starting X coordinate
     * @param y Starting y Coordinate
     * @param color Rook color 
     */
    public Rook(int x, int y, char color2){
        color = color2; 
        xCoord = x;
        yCoord = y;
    }
    /**
     * Checks possible moves of the selected Rook and adds them to an ArrayList type String. Chess.java uses this to see if a user requested move is valid.
     * 
     * @return ArrayList type String containing all possible moves in format "xCoord: x, yCoord: y"
     */
    public ArrayList<String> checkMoves(){ 
        possibleMoves = new ArrayList<String>();
        int i = 1;
        while (true){ //west moves
            if (((xCoord - i) >= 0) && ChessBoard.board[xCoord - i][yCoord] == null) {
                possibleMoves.add("xCoord:" + (xCoord - i) + ",yCoord: " + (yCoord));
                i++;
            }  
            if  (((xCoord - i) >= 0) && ChessBoard.board[xCoord - i][yCoord].getColor() == color){ //same color peice blocks movement
                break;
            }
            else if  (((xCoord - i) >= 0) && ChessBoard.board[xCoord - i][yCoord].getColor() != color){//different color, take move DOUBLE CHECK!!!!
                possibleMoves.add("xCoord:" + (xCoord - i) + ",yCoord: " + (yCoord));
            }
            break;
        }
        i = 1;
        while (true){ //east moves
            if (((xCoord + i) < 8) && ChessBoard.board[xCoord + i][yCoord] == null) {
                possibleMoves.add("xCoord:" + (xCoord + i) + ",yCoord: " + (yCoord));
                i++;
            }  
            if  (((xCoord + i) < 8) && ChessBoard.board[xCoord + i][yCoord].getColor() == color){ //same color peice blocks movement
                break;
            }
            else if  (((xCoord + i) < 8) && ChessBoard.board[xCoord + i][yCoord].getColor() != color){//different color, take move DOUBLE CHECK!!!!
                possibleMoves.add("xCoord:" + (xCoord + i) + ",yCoord: " + (yCoord));
            }
            break;
        }
        int j = 1;
        while (true){ //north
            if (((yCoord - j) >= 0) && ChessBoard.board[xCoord][yCoord - j] == null) {
                possibleMoves.add("xCoord:" + (xCoord) + ",yCoord: " + (yCoord - j));
                j++;
            }  
            if  (((yCoord - j) >= 0) && ChessBoard.board[xCoord][yCoord - j].getColor() == color){ //same color peice blocks movement
                break;
            }
            else if  (((yCoord - j) >= 0) && ChessBoard.board[xCoord][yCoord - j].getColor() != color){//different color, take move DOUBLE CHECK!!!!
                possibleMoves.add("xCoord:" + (xCoord) + ",yCoord: " + (yCoord - j));
            }
            break;        
        }
        j = 1;
        while (true){ //south
            if (((yCoord + j) < 8) && ChessBoard.board[xCoord][yCoord + j] == null) {
                possibleMoves.add("xCoord:" + (xCoord) + ",yCoord: " + (yCoord + j));
                j++;
            }  
            if  (((yCoord + j) < 8) && ChessBoard.board[xCoord][yCoord + j].getColor() == color){ //same color peice blocks movement
                break;
            }
            else if  (((yCoord - j) < 8 ) && ChessBoard.board[xCoord][yCoord + j].getColor() != color){//different color, take move DOUBLE CHECK!!!!
                possibleMoves.add("xCoord:" + (xCoord) + ",yCoord: " + (yCoord + j));
            }
            break;        
        }
        //maybe add castling here too
        return possibleMoves;
    }
    /**
     * To String method used to print the board
     * 
     * @return T for "Rook" plus the color of the Rook. w for white, b for black.
     * 
     */
    @Override
    public String toString(){ 
        return " R" + color;
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
