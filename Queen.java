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
        return possibleMoves;
    }

}
