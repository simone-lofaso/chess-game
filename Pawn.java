import java.util.ArrayList;
import java.util.Scanner;
public class Pawn extends ChessPiece implements Piece{
    private int xCoord; //check King.java for com
    private int yCoord;
    private char color;

    public ArrayList<String> possibleMoves;

    public Pawn(int x, int y, char color2){
        color = color2;
        xCoord = x;
        yCoord = y;
    }
    public ArrayList<String> checkMoves(){ //will only check the selected pawn. Up to user to select which pawn. Not checking if move is possible with bounds because promotion() will run if the peice reaches the edge
        possibleMoves = new ArrayList<String>();
        //black
        if (xCoord == 1 && (ChessBoard.board[xCoord][yCoord + 1] != null) && (ChessBoard.board[xCoord][yCoord + 2] != null) && color == 'b');{ //pawns can move two at start, so checking their x to see if they moved
            possibleMoves.add("xCoord:" + xCoord + ",yCoord: " + (yCoord + 2) + ",");                                          //check forward two spaces to see if they are empty
        }
        if (ChessBoard.board[xCoord][yCoord + 1] != null){ //normal move
            possibleMoves.add("xCoord:" + xCoord + ",yCoord: " + (yCoord + 1) + ","); 
        }
        if (ChessBoard.board[xCoord + 1][yCoord + 1] != null && ChessBoard.board[xCoord + 1][yCoord + 1].getColor() != color){ //take moving move east. Taking will take place in move()
            possibleMoves.add("xCoord:" + (xCoord + 1) + ",yCoord: " + (yCoord + 1) + ","); 
        }
        if (ChessBoard.board[xCoord + - 1][yCoord + 1] != null && ChessBoard.board[xCoord + 1][yCoord + 1].getColor() != color){ //take moving west
            possibleMoves.add("xCoord:" + (xCoord - 1) + ",yCoord: " + (yCoord + 1) + ","); 
        }

        //white
        if (xCoord == 6 && (ChessBoard.board[xCoord][yCoord - 1] != null) && (ChessBoard.board[xCoord][yCoord - 2] != null) && color == 'w');{
            possibleMoves.add("xCoord:" + xCoord + ",yCoord: " + (yCoord + 1) + ",");
        }
        if (ChessBoard.board[xCoord][yCoord - 1] != null){
            possibleMoves.add("xCoord:" + xCoord + ",yCoord: " + (yCoord - 1) + ",");
        }
        if (ChessBoard.board[xCoord + 1][yCoord - 1] != null && ChessBoard.board[xCoord + 1][yCoord + 1].getColor() != color){ //take moving east
            possibleMoves.add("xCoord:" + (xCoord + 1) + ",yCoord: " + (yCoord - 1) + ","); 
        }
        if (ChessBoard.board[xCoord - 1][yCoord - 1] != null && ChessBoard.board[xCoord + 1][yCoord + 1].getColor() != color){ //take moving west
            possibleMoves.add("xCoord:" + (xCoord - 1) + ",yCoord: " + (yCoord - 1) + ","); 
        }

        return possibleMoves;
    }
    public void promotion(){ //will call on every pawn move.    
                             //prompt user to promote to a queen, knight, rook, or bishop. Then convert pawn to it. Can probably create new peice and replace it over the pawn
        if ((xCoord == 0 && color == 'w') || (xCoord == 7 && color == 'b')){
            Scanner in = new Scanner(System.in);
            if (color == 'w'){ //seperated by color to avoid further nesting
                System.out.println("White pawn is ready for promotion. Would you like to promote to a queen, knight, rook, or bishop?");
                String input = in.nextLine();
                while (true){
                    if (input.toLowerCase().equals("queen")){
                        //ChessBoard.board[xCoord][yCoord] = new Queen(xCoord, yCoord,'w');
                        break;
                    }
                    else if (input.toLowerCase().equals("knight")){
                        //ChessBoard.board[xCoord][yCoord] = new Knight(xCoord, yCoord,'w');
                        break;
                    }
                    else if (input.toLowerCase().equals("rook")){
                        ChessBoard.board[xCoord][yCoord] = new Rook(xCoord, yCoord, 'w');
                        break;
                    }
                    else if (input.toLowerCase().equals("bishop")){
                        //ChessBoard.board[xCoord][yCoord] = new Bishop(xCoord, yCoord,'w');
                        break;
                    }
                    else{
                      System.out.println("Input not recognized. Please try again.");
                    }
                }
            }
            else if (color == 'b'){//black
                System.out.println("Black pawn is ready for promotion. Would you like to promote to a queen, knight, rook, or bishop?");
                String input = in.nextLine();
                while (true){
                    if (input.toLowerCase().equals("queen")){
                        //ChessBoard.board[xCoord][yCoord] = new Queen(xCoord, yCoord,'b');
                        break;
                    }
                    else if (input.toLowerCase().equals("knight")){
                        //ChessBoard.board[xCoord][yCoord] = new Knight(xCoord, yCoord,'b');
                        break;
                    }
                    else if (input.toLowerCase().equals("rook")){
                        ChessBoard.board[xCoord][yCoord] = new Rook(xCoord, yCoord,'b');
                        break;
                    }
                    else if (input.toLowerCase().equals("bishop")){
                        //ChessBoard.board[xCoord][yCoord] = new Bishop(xCoord, yCoord,'b');
                        break;
                    }
                    else{
                        System.out.println("Input not recognized. Please try again.");
                    }
                }
            }
        in.close();
        }
    }
}
