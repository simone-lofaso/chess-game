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
        return possibleMoves;
    }
}
