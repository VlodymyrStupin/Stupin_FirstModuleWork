package firstModuleWork.firstModuleWork;


import java.util.Arrays;
import java.util.Scanner;

// Ход коня по шахматной доске. Вводится текущее положение коня и клетка в которую пробуют его передвинуть за 1 ход.
// Программа должна проверить, возможно ли это сделать.
// Пример ввода "D2"
public class Task2 {

    public static void main(String[] args) {
        String[] chessBoardVerticalRows = {"A", "B", "C", "D", "E", "F", "G", "H"};
        String[] chessBoardHorizontalRows = {"1", "2", "3", "4", "5", "6", "7", "8"};
        possibilityToMoveForKnight(chessBoardVerticalRows, chessBoardHorizontalRows);

    }

    private static String inputStartKnightPosition() {
        System.out.println("Input start position for the knight:");
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }

    private static String inputPositionToMoveTheKnight() {
        System.out.println("Input position to move the knight:");
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }

    public static void possibilityToMoveForKnight(String[] chessBoardVerticalRows, String[] chessBoardHorizontalRows) {
        String positionOfTheKnight = inputStartKnightPosition();
        String newPositionOfTheKnight = inputPositionToMoveTheKnight();
        String boardHorizontalRows = positionOfTheKnight.split("")[0].toUpperCase();
        String boardVerticalRows = positionOfTheKnight.split("")[1].toUpperCase();
        String newBoardHorizontalRows = newPositionOfTheKnight.split("")[0].toUpperCase();
        String newBoardVerticalRows = newPositionOfTheKnight.split("")[1].toUpperCase();
        if ((Arrays.asList(chessBoardVerticalRows).contains(boardHorizontalRows) &&
                Arrays.asList(chessBoardHorizontalRows).contains(boardVerticalRows)) &&
                (Arrays.asList(chessBoardVerticalRows).contains(newBoardHorizontalRows) &&
                Arrays.asList(chessBoardHorizontalRows).contains(newBoardVerticalRows))) {
            if (((newBoardHorizontalRows.charAt(0) - boardHorizontalRows.charAt(0)) == 1 && (newBoardVerticalRows.charAt(0) - boardVerticalRows.charAt(0)) == 2) ||
                    ((newBoardHorizontalRows.charAt(0) - boardHorizontalRows.charAt(0)) == 2 && (newBoardVerticalRows.charAt(0) - boardVerticalRows.charAt(0)) == 1) ||
                    ((newBoardHorizontalRows.charAt(0) - boardHorizontalRows.charAt(0)) == -1 && (newBoardVerticalRows.charAt(0) - boardVerticalRows.charAt(0)) == -2) ||
                    ((newBoardHorizontalRows.charAt(0) - boardHorizontalRows.charAt(0)) == -2 && (newBoardVerticalRows.charAt(0) - boardVerticalRows.charAt(0)) == -1) ||
                    ((newBoardHorizontalRows.charAt(0) - boardHorizontalRows.charAt(0)) == -2 && (newBoardVerticalRows.charAt(0) - boardVerticalRows.charAt(0)) == 1) ||
                    ((newBoardHorizontalRows.charAt(0) - boardHorizontalRows.charAt(0)) == -1 && (newBoardVerticalRows.charAt(0) - boardVerticalRows.charAt(0)) == 2) ||
                    ((newBoardHorizontalRows.charAt(0) - boardHorizontalRows.charAt(0)) == 1 && (newBoardVerticalRows.charAt(0) - boardVerticalRows.charAt(0)) == -2) ||
                    ((newBoardHorizontalRows.charAt(0) - boardHorizontalRows.charAt(0)) == 2 && (newBoardVerticalRows.charAt(0) - boardVerticalRows.charAt(0)) == -1)) {
                System.out.println("Knight can move to " + newPositionOfTheKnight);
            } else {
                System.out.println("Knight can't move to " + newPositionOfTheKnight);
            }
        } else {
            System.out.println("Inputted row doesn't exist on chess board");
        }


    }
}
