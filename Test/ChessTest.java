
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ChessTest {   
    //Tests pawn methods
    @Test
    public void pawnTest(){
        //Tests getColor method
        Pawn pawn = new Pawn(2, 3, 'w');
        assertEquals('w', pawn.getColor());
        //Tests toString method
        assertEquals(" P" + 'w', pawn.toString());
    }

    //Tests king methods
    @Test
    public void kingTest(){
        //Tests getColor method
        King king = new King(2, 3, 'w');
        assertEquals('w', king.getColor());
        //Tests toString method
        assertEquals(" K" + 'w', king.toString());
    }

    //Tests bishop methods
    @Test
    public void bishopTest(){
        //Tests getColor method
        Bishop bishop = new Bishop(2, 3, 'w');
        assertEquals('w', bishop.getColor());
        //Tests toString method
        assertEquals(" B" + 'w', bishop.toString());
    }

    //Tests knight methods
    @Test
    public void knightTest(){
        //Tests getColor method
        Knight knight = new Knight(2, 3, 'w');
        assertEquals('w', knight.getColor());
        //Tests toString method
        assertEquals("KN" + 'w', knight.toString());
    }

    //Tests queen methods
    @Test
    public void queenTest(){
        //Tests getColor method
        Queen queen = new Queen(2, 3, 'w');
        assertEquals('w', queen.getColor());
        //Tests toString method
        assertEquals(" Q" + 'w', queen.toString());
    }

    //Tests rook methods
    @Test
    public void rookTest(){
        //Tests getColor method
        Rook rook = new Rook(2, 3, 'w');
        assertEquals('w', rook.getColor());
        //Tests toString method
        assertEquals(" R" + 'w', rook.toString());
    }
}
