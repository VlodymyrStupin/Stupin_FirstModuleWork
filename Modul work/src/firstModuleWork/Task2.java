package firstModuleWork;


import java.util.Scanner;

// Ход коня по шахматной доске. Вводится текущее положение коня и клетка в которую пробуют его передвинуть за 1 ход.
// Программа должна проверить, возможно ли это сделать.
// Пример ввода "D2"
public class Task2 {
    public static void main(String[] args) {
        String[] chessDesk = {"a1", "b1", "c1", "d1", "e1", "f1", "g1", "h1",
                "a2", "b2", "c2", "d2", "e2", "f2", "g2", "h2",
                "a3", "b3", "c3", "d3", "e3", "f3", "g3", "h3",
                "a4", "b4", "c4", "d4", "e4", "f4", "g4", "h4",
                "a5", "b5", "c5", "d5", "e5", "f5", "g5", "h5",
                "a6", "b6", "c6", "d6", "e6", "f6", "g6", "h6",
                "a7", "b7", "c7", "d7", "e7", "f7", "g7", "h7",
                "a8", "b8", "c8", "d8", "e8", "f8", "g8", "h8",
        };
        possibleMoveForKnight(chessDesk);
    }

    private static String inputKnightStartPosition() {
        Scanner s = new Scanner(System.in);
        System.out.println("Input start position of the knight: ");
        return s.nextLine();
    }
    private static String inputKnightPositionToMove() {
        Scanner s = new Scanner(System.in);
        System.out.println("Input position to move the knight: ");
        return s.nextLine();
    }

    //    static  int CountOfRoutes ( int x, int y, final  int fieldRows, final  int fieldCols )
//    {
//        if  ( x == fieldCols && y == fieldRows )
//            return  1 ;
//        if  (x < fieldCols && y < fieldRows )
//            return CountOfRoutes ( x + 2 , y + 1 , fieldRows , fieldCols ) + CountOfRoutes ( x + 1 , y + 2 , fieldRows, fieldCols ) ;
//        else  return  0 ;
//    }
    public static String possibleMoveForKnight(String[] chessDesk) {
         for (int i = 0; i<chessDesk.length; i++){
             if (inputKnightStartPosition().equals()) {
                 System.out.println("next");
             }
         }

        return "True";
    }
}
