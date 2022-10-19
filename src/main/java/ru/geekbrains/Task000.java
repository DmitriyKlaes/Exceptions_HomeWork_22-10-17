package ru.geekbrains;

/*
Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
*/

public class Task000 {
    public static void main(String[] args) {
        //--- NullPointerException
        int[] array1 = null;
        arrayChangeFirstElement(array1, 1);

        //--- ArithmeticException
        division(2, 0);

        //--- ArrayIndexOutOfBoundsException
        int[] array2 = {1, 2, 3};
        numberFromIndex(array2, 3);
    }

    public static void arrayChangeFirstElement(int[] arr, int number) {
        arr[0] = number;
    }

    public static void division(int dividend, int divisor) {
        System.out.println(dividend / divisor);
    }

    public static void numberFromIndex(int[] arr, int index) {
        System.out.println(arr[index]);
    }
}
