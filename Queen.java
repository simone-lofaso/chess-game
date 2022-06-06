import java.util.ArrayList;

public class Queen extends ChessPiece implements Piece {
    private int xCoord; //check King.java for com
    private int yCoord;
    private char color;

    public ArrayList<String> possibleMoves;

    public Queen(int x, int y, char color2){
        color = color2;
        xCoord = x;
        yCoord = y;
    }
    public ArrayList<String> checkMoves(){
        possibleMoves = new ArrayList<String>();
        while (true){ //west moves
            int i = 1;
            if (((xCoord - i) >= 0) && ChessBoard.board[xCoord - i][yCoord] == null) {
                possibleMoves.add("xCoord:" + (xCoord - i) + ",yCoord: " + (yCoord) + ",");
                i++;
            }  
            if  (((xCoord - i) >= 0) && ChessBoard.board[xCoord - i][yCoord].getColor() == color){ //same color peice blocks movement
                break;
            }
            else if  (((xCoord - i) >= 0) && ChessBoard.board[xCoord - i][yCoord].getColor() != color){//different color, take move DOUBLE CHECK!!!!
                possibleMoves.add("xCoord:" + (xCoord - i) + ",yCoord: " + (yCoord) + ",");
            }
            break;
        }
        while (true){ //east moves
            int i = 1;
            if (((xCoord + i) < 8) && ChessBoard.board[xCoord + i][yCoord] == null) {
                possibleMoves.add("xCoord:" + (xCoord + i) + ",yCoord: " + (yCoord) + ",");
                i++;
            }  
            if  (((xCoord + i) < 8) && ChessBoard.board[xCoord + i][yCoord].getColor() == color){ //same color peice blocks movement
                break;
            }
            else if  (((xCoord + i) < 8) && ChessBoard.board[xCoord + i][yCoord].getColor() != color){//different color, take move DOUBLE CHECK!!!!
                possibleMoves.add("xCoord:" + (xCoord + i) + ",yCoord: " + (yCoord) + ",");
            }
            break;
        }
        while (true){ //north
            int j = 1;
            if (((yCoord - j) >= 0) && ChessBoard.board[xCoord][yCoord - j] == null) {
                possibleMoves.add("xCoord:" + (xCoord) + ",yCoord: " + (yCoord - j) + ",");
                j++;
            }  
            if  (((yCoord - j) >= 0) && ChessBoard.board[xCoord][yCoord - j].getColor() == color){ //same color peice blocks movement
                break;
            }
            else if  (((yCoord - j) >= 0) && ChessBoard.board[xCoord][yCoord - j].getColor() != color){//different color, take move DOUBLE CHECK!!!!
                possibleMoves.add("xCoord:" + (xCoord) + ",yCoord: " + (yCoord - j) + ",");
            }
            break;        
        }
        while (true){ //south
            int j = 1;
            if (((yCoord + j) < 8) && ChessBoard.board[xCoord][yCoord + j] == null) {
                possibleMoves.add("xCoord:" + (xCoord) + ",yCoord: " + (yCoord + j) + ",");
                j++;
            }  
            if  (((yCoord + j) < 8) && ChessBoard.board[xCoord][yCoord + j].getColor() == color){ //same color peice blocks movement
                break;
            }
            else if  (((yCoord - j) < 8 ) && ChessBoard.board[xCoord][yCoord + j].getColor() != color){//different color, take move DOUBLE CHECK!!!!
                possibleMoves.add("xCoord:" + (xCoord) + ",yCoord: " + (yCoord + j) + ",");
            }
            break;        
        }
        while (true){ //northwest
            int i = 1; //horizontal
            int j = 1; // vertical
            if ((xCoord - i >= 0) && (yCoord - j >= 0) && ChessBoard.board[xCoord - i][yCoord - j] == null){
                possibleMoves.add("xCoord:" + (xCoord - i) + ",yCoord: " + (yCoord - j) + ",");
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
                possibleMoves.add("xCoord:" + (xCoord + i) + ",yCoord: " + (yCoord - j) + ",");
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
                possibleMoves.add("xCoord:" + (xCoord + i) + ",yCoord: " + (yCoord + j) + ",");
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
                possibleMoves.add("xCoord:" + (xCoord - i) + ",yCoord: " + (yCoord + j) + ",");
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

    @Override
    public String toString(){
        return " Q" + color;
    }
}
