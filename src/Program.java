import chess.ChassMacth;
import chess.ChessPiece;

public class Program {

    public static void main (String[] args){

        ChassMacth chassMacth = new ChassMacth();
        UI.printBoard(chassMacth.getPieces());
    }
}
