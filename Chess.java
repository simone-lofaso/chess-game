import java.util.ArrayList;

public class Chess {
    //main method will be here.
    ArrayList<ChessPiece> whiteTook = new ArrayList<ChessPiece>();
    ArrayList<ChessPiece> blackTook = new ArrayList<ChessPiece>();

    public static void main(String[] args) {

        ChessBoard.board = ChessBoard.createBoard();
        
        System.out.println(ChessBoard.board[0][0]); //testing
        System.out.println("Initializing board...");
        System.out.println(ChessBoard.board.toString());
    }
}
