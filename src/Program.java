import chess.ChessMacth;
import chess.ChessPiece;
import chess.ChessPosition;

import java.util.Scanner;

public class Program {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        ChessMacth chassMacth = new ChessMacth();
        while (true){
            UI.printBoard(chassMacth.getPieces());
            System.out.println();
            System.out.println("Source: ");
            ChessPosition source = UI.readChessPosition(sc);

            System.out.println();
            System.out.println("Target: ");
            ChessPosition target = UI.readChessPosition(sc);

            ChessPiece capturedPiece = chassMacth.performChessMove(source, target);
        }

    }
}
