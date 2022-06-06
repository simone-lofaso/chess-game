import java.util.ArrayList;
public class Knight extends ChessPiece implements Piece{
    private int xCoord; //check King.java for com
    private int yCoord;
    private char color;

    public ArrayList<String> possibleMoves;

    public Knight(int x, int y, char color2){
        color = color2;
        xCoord = x;
        yCoord = y;
    }

    public ArrayList<String> checkMoves(){
        possibleMoves = new ArrayList<String>();
        if(xCoord - 2 >= 0 && yCoord + 1 < 8 && ChessBoard.board[xCoord -2][yCoord + 1].getColor() !=color){
            possibleMoves.add("xCoord:" + (xCoord - 2) + ",yCoord: " + (yCoord + 1) + ",");
        }
        if(xCoord - 2 >= 0 && yCoord - 1 >=0 && ChessBoard.board[xCoord -2][yCoord - 1].getColor()!=color){
            possibleMoves.add("xCoord:" + (xCoord - 2) + ",yCoord: " + (yCoord - 1) + ",");
        }
        if(xCoord - 1 >= 0 && yCoord + 2 < 8 && ChessBoard.board[xCoord - 1][yCoord + 2].getColor()!=color){
            possibleMoves.add("xCoord:" + (xCoord - 1) + ",yCoord: " + (yCoord + 2) + ",");
        }
        if(xCoord + 1 < 8 && yCoord + 2 < 8 && ChessBoard.board[xCoord + 1][yCoord + 2].getColor()!=color){
            possibleMoves.add("xCoord:" + (xCoord + 1) + ",yCoord: " + (yCoord + 2) + ",");
        }
        if(xCoord + 2 < 8 && yCoord + 1 < 8 && ChessBoard.board[xCoord + 2][yCoord + 1].getColor()!=color){
            possibleMoves.add("xCoord:" + (xCoord +2) + ",yCoord: " + (yCoord + 1) + ",");
        }
        if(xCoord + 2 < 8 && yCoord - 1 >= 0 && ChessBoard.board[xCoord + 2][yCoord - 1].getColor()!=color){
            possibleMoves.add("xCoord:" + (xCoord + 2) + ",yCoord: " + (yCoord - 1) + ",");
        }
        if(xCoord - 1 >= 0 && yCoord - 2 >= 0 && ChessBoard.board[xCoord -1][yCoord - 2].getColor()!=color){
            possibleMoves.add("xCoord:" + (xCoord - 1) + ",yCoord: " + (yCoord - 2) + ",");
        }
        if(xCoord + 1 < 8 && yCoord - 2 >= 0 && ChessBoard.board[xCoord + 1][yCoord - 2].getColor()!=color){
            possibleMoves.add("xCoord:" + (xCoord + 1) + ",yCoord: " + (yCoord - 2) + ",");
        }
        return possibleMoves;
    }
    
    public String toString(ChessPiece piece){
        String s = "";
        s = "Kn" + color;

        return s;
    }
}
