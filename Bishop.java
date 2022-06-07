import java.util.ArrayList;
public class Bishop extends ChessPiece implements Piece{
    private int xCoord; //check Bishop.java for com
    private int yCoord;
    private char color;

    public ArrayList<String> possibleMoves;

    public Bishop(int x, int y, char color2){
        color = color2;
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
    public char getColor(){
        return color; 
    }
    
    @Override
    public String toString(){
        return " B" + color;
    }
    
}
