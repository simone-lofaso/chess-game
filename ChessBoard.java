public class ChessBoard {
    public static ChessPiece[][] board;

    public static ChessPiece[][] createBoard(){
        board = new ChessPiece[8][8]; //initalizes 8x8 2d array of type chessPeice
        populate();
        return board;
    }
    public static void populate(){
        board[0][0] = new Rook(0,0,'b');
        board[1][0] = new Knight(1, 0, 'b');
        board[2][0] = new Bishop(2, 0, 'b');
        board[3][0] = new King(3, 0, 'b');
        board[4][0] = new Queen(4, 0, 'b');
        board[5][0] = new Knight(5, 0, 'b');
        board[6][0] = new Bishop(6, 0, 'b');
        board[7][0] = new Rook(7, 0, 'b');

        board[0][1] = new Pawn(0, 0, 'b');
        board[1][1] = new Pawn(1, 0, 'b');
        board[2][1] = new Pawn(2, 0, 'b');
        board[3][1] = new Pawn(3, 0, 'b');
        board[4][1] = new Pawn(4, 0, 'b');
        board[5][1] = new Pawn(5, 0, 'b');
        board[6][1] = new Pawn(6, 0, 'b');
        board[7][1] = new Pawn(7, 0, 'b');

        board[0][7] = new Rook(0,7,'w');
        board[1][7] = new Knight(1, 7, 'w');
        board[2][7] = new Bishop(2, 7, 'w');
        board[3][7] = new King(3, 7, 'w');
        board[4][7] = new Queen(4, 7, 'w');
        board[5][7] = new Knight(5, 7, 'w');
        board[6][7] = new Bishop(6, 7, 'w');
        board[7][7] = new Rook(7, 7, 'w');

        board[0][6] = new Pawn(0, 7, 'b');
        board[1][6] = new Pawn(1, 7, 'b');
        board[2][6] = new Pawn(2, 7, 'b');
        board[3][6] = new Pawn(3, 7, 'b');
        board[4][6] = new Pawn(4, 7, 'b');
        board[5][6] = new Pawn(5, 7, 'b');
        board[6][6] = new Pawn(6, 7, 'b');
        board[7][6] = new Pawn(7, 7, 'b');
    }

    @Override
    public String toString(){ //this is ugly as shit and is temproary until i get around to doing a better one
            for (int i = 0; i < 8; i++){
                for (int j = 0; i < 8; j++){
                    if (board[i][j] != null){
                        System.out.print(board[i][j] + " ");
                    }
                    else System.out.print("     ");
                }
                System.out.println("");
            }

        return null;

    }
}
