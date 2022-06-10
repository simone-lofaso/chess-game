import java.util.ArrayList;
public interface Piece {
    ArrayList<String> checkMoves();
    char getColor();
    String toString();
    void setX(int X);
    void setY(int Y);
}
