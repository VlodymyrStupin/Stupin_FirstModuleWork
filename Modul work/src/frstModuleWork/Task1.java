package frstModuleWork;

// Найти количество различных элементов массива. Пример: для 1 4 5 1 1 3 ответ 4.
// *Создать метод, который принимает массив и возвращает количество различных элементов.
public class Task1 {

    public static void main(String[] args) {
        int[] newArray = {1, 4, 5, 1, 1, 3, 1, 4, 5, 1, 1, 3, 66, 7, 7, 66, 1, 4, 14};
        System.out.println("Number of different elements in array: " + checkArrayForDifferentElements(newArray));
    }

    public static int checkArrayForDifferentElements(int[] newArray) {
        int countOfEqualElements = 0;
        int countElementInArray = 0;
        for (int i = 0; i < newArray.length; i++) {
            countElementInArray++;
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[j] == newArray[i]) {
                    countOfEqualElements++;
                    break;
                }
            }
        }
        return countElementInArray - countOfEqualElements;
    }

}
