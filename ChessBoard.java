import java.util.ArrayList;
public class ChessBoard {
    public static ChessPiece[][] board;

    public static ChessPiece[][] createBoard(){
        board = new ChessPiece[8][8]; //initalizes 8x8 2d array of type chessPeice
        populate();
        return board;
    }
    public static void populate(){
        //populate chessboard
    }
}
