import java.util.ArrayList;

public class ChessPiece {

    public static boolean WHITE_PRINT_POSSIBLE_MOVES = true;
    public static boolean BLACK_PRINT_POSSIBLE_MOVES = true;

    private char color; 


    /**Move 
     * 
     * @param input Location to move to. In XY unless i get unlazy and change to to conventional system (unlikely, would require a lot of work)
     * @return returns taken chess piece if any. Null otherwise. Chess.java handles null return
     */
    public ChessPiece move(String input, char color2){ //Might need another input for color. Shouldn't be run by the user so it shouldnt be a problem
        
        //read in user input for move
        //check if move is valid
        //if so, do it
        //if not, tell user they are stupid and ask for it again

        //if it is pawn moving, check to see if it is valid to be promoted using promote() after move

        return null; 
    }
    public char getColor(){ //This will never be called, but it needs to exist. Idk why
        return 'f';
    }

    public ArrayList<String> checkMoves(){
        return new ArrayList<String>();
    }


    
    


}
