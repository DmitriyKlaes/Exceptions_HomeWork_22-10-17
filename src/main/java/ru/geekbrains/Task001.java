package ru.geekbrains;

/*
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
и возвращающий новый массив, каждый элемент которого равен разности элементов
двух входящих массивов в той же ячейке. Если длины массивов не равны,
необходимо как-то оповестить пользователя.
*/

import java.util.Arrays;

public class Task001 {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 6, -2, -10, 2, 21, 3};
        int[] arr2 = {-2, 0, 3, -21, 2, 12, -3};
        System.out.println(Arrays.toString(arrDifference(arr1, arr2)));
    }

    public static int[] arrDifference (int[] arrFirst, int[] arrSecond) {
        if (arrFirst == null || arrSecond == null) {
            throw new RuntimeException("Один из массивов null!");
        }
        int[] result;
        if (arrFirst.length != arrSecond.length) {
            System.out.println("Массивы разной длины! Итоговый массив будет равен длине меньшего!");
            result = new int[Math.min(arrFirst.length, arrSecond.length)];
        } else {
            result = new int[arrFirst.length];
        }
        for (int i = 0; i < result.length; i++) {
            result[i] = arrFirst[i] - arrSecond[i];
        }
        return result;
    }
}
