package ru.geekbrains;

/*
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
и возвращающий новый массив, каждый элемент которого равен частному элементов
двух входящих массивов в той же ячейке. Если длины массивов не равны,
необходимо как-то оповестить пользователя. Важно: При выполнении метода
единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше
*/

import java.util.Arrays;

public class Task002 {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 6, -2, -10, 2, 21, 3};
        int[] arr2 = {-2, 3, 3, -21, 2, 12, -3};
        System.out.println(Arrays.toString(arrQuotient(arr1, arr2)));
    }

    public static double[] arrQuotient (int[] arrFirst, int[] arrSecond) {
        if (arrFirst == null || arrSecond == null) {
            throw new RuntimeException("Один из массивов null!");
        }
        double[] result;
        if (arrFirst.length != arrSecond.length) {
            System.out.println("Массивы разной длины! Итоговый массив будет равен длине меньшего!");
            result = new double[Math.min(arrFirst.length, arrSecond.length)];
        } else {
            result = new double[arrFirst.length];
        }
        for (int i = 0; i < result.length; i++) {
            if (arrSecond[i] == 0) {
                throw new RuntimeException("Невозможно разделить на 0!");
            }
            result[i] = ((double)arrFirst[i]) / arrSecond[i];
        }
        return result;
    }
}
