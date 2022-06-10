import java.util.ArrayList;

public class ChessPiece {

    /**
     * Dummy class to extend piece types.
     * 
     */
    
    public static boolean WHITE_PRINT_POSSIBLE_MOVES = true;
    public static boolean BLACK_PRINT_POSSIBLE_MOVES = true;

    public int xCoord;
    public int yCoord;

    /**
     * Color getter. This will never be called but it is needed for the child classes to work.
     * 
     * @return 'f'.
     */
    public char getColor(){ 
        return 'f';
    }

    /**
     * Parent method for checkMoves(). 
     * 
     * @return ArrayList type String containing all possible moves in format "xCoord: x, yCoord: y"
     */
    public ArrayList<String> checkMoves(){
        return new ArrayList<String>();
    }
    /**
     * X coordinate setter. Parent method for setX();
     * 
     * @param x The new X coordinate after the move
     */
    public void setX(int x){
        xCoord = x;
    }

    /**
     *  Y coordinate setter. Parent method for setY();
     * 
     * @param y The new Y coordinate after the move
     */
    public void setY(int y){
        yCoord = y;
    }
    


}
