import java.util.ArrayList;
public class Rook extends ChessPiece implements Piece{
    private int xCoord; //check King.java for comments
    private int yCoord;
    private char color; 
    
    public ArrayList<String> possibleMoves;
    
    public Rook(int x, int y, char color2){
        color = color2; 
        xCoord = x;
        yCoord = y;
    }
    public ArrayList<String> checkMoves(){ //will only check the selected rook
        possibleMoves = new ArrayList<String>();
        while (true){ //west moves
            int i = 0;
            if (((xCoord - i) >= 0) && ChessBoard.board[xCoord - i][yCoord] == null) {
                possibleMoves.add("xCoord:" + (xCoord - i) + ",yCoord: " + (yCoord) + ",");
                i += 1;
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
            int i = 0;
            if (((xCoord + i) < 8) && ChessBoard.board[xCoord + i][yCoord] == null) {
                possibleMoves.add("xCoord:" + (xCoord + i) + ",yCoord: " + (yCoord) + ",");
                i += 1;
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
            int j = 0;
            if (((yCoord - j) >= 0) && ChessBoard.board[xCoord][yCoord - j] == null) {
                possibleMoves.add("xCoord:" + (xCoord) + ",yCoord: " + (yCoord - j) + ",");
                j += 1;
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
            int j = 0;
            if (((yCoord + j) < 8) && ChessBoard.board[xCoord][yCoord + j] == null) {
                possibleMoves.add("xCoord:" + (xCoord) + ",yCoord: " + (yCoord + j) + ",");
                j += 1;
            }  
            if  (((yCoord + j) < 8) && ChessBoard.board[xCoord][yCoord + j].getColor() == color){ //same color peice blocks movement
                break;
            }
            else if  (((yCoord - j) < 8 ) && ChessBoard.board[xCoord][yCoord + j].getColor() != color){//different color, take move DOUBLE CHECK!!!!
                possibleMoves.add("xCoord:" + (xCoord) + ",yCoord: " + (yCoord + j) + ",");
            }
            break;        
        }
        //maybe add castling here too
        return possibleMoves;
    }
}
