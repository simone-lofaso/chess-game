import java.util.ArrayList;
public class King implements Piece {
    private int xCoord; //manual tracking of position
    private int yCoord;
    private char color; //stores color in a character. Not using string here since i don't really see a need to. b for black, c for white
    
    public ArrayList<String> possibleMoves;
    
    public King(int x, int y, char color2){ 
        color = color2;
        xCoord = x;
        yCoord = y; //No error checking since object wont be created by user
    }
    public ArrayList<String> checkMoves(){ //checks to see possible moves. Will use a lot of file space. Maybe only check moves when a peice is selected by the user.  User selects the location, not the object. Object is seleteced in code
        possibleMoves = new ArrayList<String>(); //May want to printmoves when checked as an option
        //char test = ChessBoard.board[xCoord][yCoord].getColor();
        if ((yCoord - 1 >= 0) && (color != ChessBoard.board[xCoord][yCoord - 1].getColor())){//south move possible          //might get nullpointerexception. check later
            possibleMoves.add( "xCoord:" + xCoord + ",yCoord: " + (yCoord - 1) + ","); //I'm tempted to change xCoord to a letter as is convetional in regular chess but it might be hard to implement and not effecient
        } 
        if ((yCoord + 1 < 8) && (color != ChessBoard.board[xCoord][yCoord + 1].getColor())){ //north move possible
            possibleMoves.add("xCoord:" + xCoord + ",yCoord: " + (yCoord + 1) + ",");
        } 
        if ((xCoord + 1 < 8) && (color != ChessBoard.board[xCoord + 1][yCoord].getColor())){ //east move possible  //relable north and south
            possibleMoves.add("xCoord:" + (xCoord + 1) + ",yCoord: " + yCoord + ",");
        }
        if ((xCoord - 1 >= 0) && (color != ChessBoard.board[xCoord - 1][yCoord].getColor())){ //west move possible
            possibleMoves.add("xCoord:" + (xCoord - 1) + ",yCoord: " + yCoord + ",");
        }
        if ((xCoord + 1 < 8)  && (yCoord + 1 < 8) && (color != ChessBoard.board[xCoord + 1][yCoord].getColor())){ //northeast move possible
            possibleMoves.add("xCoord:" + (xCoord + 1) + ",yCoord: " + (yCoord + 1) + ",");
        }
        if ((xCoord - 1 >= 0)  && (yCoord + 1 < 8) && (color != ChessBoard.board[xCoord + 1][yCoord].getColor())){ //northwest move possible
            possibleMoves.add("xCoord:" + (xCoord - 1) + ",yCoord: " + (yCoord + 1) + ",");
        }
        if ((xCoord + 1 < 8)  && (yCoord - 1 >= 0) && (color != ChessBoard.board[xCoord + 1][yCoord].getColor())){ //southeast move possible
            possibleMoves.add("xCoord:" + (xCoord + 1) + ",yCoord: " + (yCoord - 1) + ",");
        }
        if ((xCoord - 1 >= 0)  && (yCoord - 1 >= 0) && (color != ChessBoard.board[xCoord + 1][yCoord].getColor())){ //southwest move possible
            possibleMoves.add("xCoord:" + (xCoord - 1) + ",yCoord: " + (yCoord - 1) + ",");
        } //thinking for more complicated peices you can loop if it can move a distance
        //maybe add castling? Should designate castling in prompt for move. 
        return possibleMoves;
    }
}
