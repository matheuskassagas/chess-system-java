import chess.ChessMacth;
import chess.ChessPiece;
import chess.ChessPosition;
import chess.exception.ChessException;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        ChessMacth chessMacth = new ChessMacth();
        List<ChessPiece> captured = new ArrayList<>();

        while (true){
            try{
                UI.clearScreen();
                UI.printMatch(chessMacth, captured);
                System.out.println();
                System.out.println("Source: ");
                ChessPosition source = UI.readChessPosition(sc);

                boolean[][] possibleMoves = chessMacth.possibleMoves(source);
                UI.clearScreen();
                UI.printBoard(chessMacth.getPieces(), possibleMoves);

                System.out.println();
                System.out.println("Target: ");
                ChessPosition target = UI.readChessPosition(sc);

                ChessPiece capturedPiece = chessMacth.performChessMove(source, target);

                if (capturedPiece != null){
                    captured.add(capturedPiece);
                }
            } catch (ChessException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            } catch (InputMismatchException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }

    }
}
