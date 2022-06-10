import java.util.ArrayList;
public class Bishop extends ChessPiece implements Piece{
    private int xCoord; //check Bishop.java for com
    private int yCoord;
    private char color;

    public ArrayList<String> possibleMoves;

    /**
     * Bishop object initializer. X and Y coordinates will be updated as the Bishop is moved. Does not contain error checking as it is never used by the user.
     * 
     * @param x Starting X coordinate
     * @param y Starting y Coordinate
     * @param color Bishop color 
     */
    public Bishop(int x, int y, char color){
        this.color = color;
        xCoord = x;
        yCoord = y;
    }
    
    public ArrayList<String> checkMoves(){
        possibleMoves = new ArrayList<String>();
        while (true){ //northwest
            int i = 1; //horizontal
            int j = 1; // vertical
            if ((xCoord - i >= 0) && (yCoord - j >= 0) && ChessBoard.board[xCoord - i][yCoord - j] == null){
                possibleMoves.add("xCoord:" + (xCoord - i) + ",yCoord: " + (yCoord - j));
                i++;
                j++;
            }
            if ((xCoord - i >= 0) && (yCoord - j >= 0) && ChessBoard.board[xCoord - i][yCoord - j].getColor() == color){ //same color blocks movement
                break;
            }
            else if ((xCoord - i >= 0) && (yCoord - j >= 0) && ChessBoard.board[xCoord - i][yCoord - j].getColor() != color){ //different color, take
                possibleMoves.add("xCoord:" + (xCoord - i) + ",yCoord: " + (yCoord - j));
                break;
            } 

        } 
        while (true){ //northeast
            int i = 1; 
            int j = 1; 
            if ((xCoord + i < 8) && (yCoord - j >= 0) && ChessBoard.board[xCoord + i][yCoord - j] == null){
                possibleMoves.add("xCoord:" + (xCoord + i) + ",yCoord: " + (yCoord - j));
                i++;
                j++;
            }
            if ((xCoord + i < 8) && (yCoord - j >= 0) && ChessBoard.board[xCoord + i][yCoord - j].getColor() == color){ 
                break;
            }
            else if ((xCoord + i < 8) && (yCoord - j >= 0) && ChessBoard.board[xCoord + i][yCoord - j].getColor() != color){
                possibleMoves.add("xCoord:" + (xCoord + i) + ",yCoord: " + (yCoord - j));
                break;
            } 

        }
        while (true){ //southwest
            int i = 1; 
            int j = 1; 
            if ((xCoord + i < 8) && (yCoord + j < 8 ) && ChessBoard.board[xCoord + i][yCoord + j] == null){
                possibleMoves.add("xCoord:" + (xCoord + i) + ",yCoord: " + (yCoord + j));
                i++;
                j++;
            }
            if ((xCoord + i < 8) && (yCoord + j < 8) && ChessBoard.board[xCoord + i][yCoord + j].getColor() == color){
                break;
            }
            else if ((xCoord + i < 8) && (yCoord + j < 8) && ChessBoard.board[xCoord + i][yCoord + j].getColor() != color){
                possibleMoves.add("xCoord:" + (xCoord + i) + ",yCoord: " + (yCoord + j));
                break;
            } 

        }  
        while (true){ //southeast
            int i = 1; 
            int j = 1; 
            if ((xCoord - i >= 0) && (yCoord + j < 8 ) && ChessBoard.board[xCoord - i][yCoord + j] == null){
                possibleMoves.add("xCoord:" + (xCoord - i) + ",yCoord: " + (yCoord + j));
                i++;
                j++;
            }
            if ((xCoord - i >= 0) && (yCoord + j < 8) && ChessBoard.board[xCoord - i][yCoord + j].getColor() == color){
                break;
            }
            else if ((xCoord - i >= 0) && (yCoord + j < 8) && ChessBoard.board[xCoord - i][yCoord + j].getColor() != color){
                possibleMoves.add("xCoord:" + (xCoord - i) + ",yCoord: " + (yCoord + j));
                break;
            } 

        }  
        return possibleMoves;
    }
    /**
     * To String method used to print the board
     * 
     * @return "B" for "Bishop" plus the color of the Bishop. w for white, b for black
     * 
     */
    @Override
    public String toString(){
        return " B" + color;
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
