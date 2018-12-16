package Lesson_2;

/*
 *  1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
 *      С помощью цикла и условия заменить 0 на 1, 1 на 0;
 *  2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 1 4 7 10 13 16 19 22;
 *  3. Задать массив [1, 5, 3, 2, 11, 4, 5, 2, 4,8, 9, 1], написать метод, принимающий на вход массив и умножающий числа меньше 6 на 2;
 *  4. Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;
 *  5. Создать квадратный 2-мерный целочисленный массив (количество строк и столбцов одинаковое),
 *      заполнить его диагональные элементы единицами, используя цикл;
 *  6. Написать метод, в который передаётся непустой одномерный целочисленный массив, метод должен вернуть true
 *      если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры:
 *      checkBalance ([1, 1, 1, || 2, 1]) > true,
 *      checkBalance ([2, 1, 1, 2, 1]) > false,
 *      checkBalance ([10, || 1, 2, 3, 4]) > true.
 *      Абстрактная граница показана символами ||, эти символы в массив не входят.
 *  7. Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
 *      при этом метод должен циклически сместить все элементы массива на n позиций.
 *  8. Решить задачу 7 без использования вспомогательного массива.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Less_2 {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        System.out.println("Задание 1: замена в массиве 1 и 0");
        printArray(array1);
//        System.out.println(Arrays.toString(array1));
        inverseArray(array1);
        printArray(array1);
        System.out.println();

        System.out.println("Задание 2: заполняем массив 1 4 7 10 13 16 19 22");
        int[] array2 = new int[8];
        printArray(array2);
        fillArray(array2);
        printArray(array2);
        System.out.println();

        System.out.println("Задание 3: в массиве умножаем на 2 те элементы, которые меньше 6");
        int[] array3 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4,8, 9, 1};
        printArray(array3);
        redubleElemOfArray(array3);
        printArray(array3);
        System.out.println();

        System.out.println("Задание 4: поиск минимального и максимального элементов массива");
        printArray(array3);
        System.out.println("Минимальный элемент массива: " + minElemOfArray(array3));
        System.out.println("Максимальный элемент массива: " + maxElemOfArray(array3));
        System.out.println();

        System.out.println("Задание 5: заполнение диагоналей квадратной матрицы заданным элементом");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер квадратной матрицы: ");
        int size = scanner.nextInt();
        int elem = 1;
        int[][] squareArray = new int[size][size];
        fillDiagonalElemOfArray(squareArray);
        printArray(squareArray);
        System.out.println();

        System.out.println("Задание 6: проверка массива, есть ли в нем место, которое делит левую и правую часть поровну");
        int[] array6_1 = {1, 1, 1, 2, 1};
        int[] array6_2 = {2, 1, 1, 2, 1};
        int[] array6_3 = {4, 2, 1, 3, 10};
        int[] array6_4 = {10, 2};
        System.out.println("For array " + Arrays.toString(array6_1) + ": " + checkBalance(array6_1));
        System.out.println("For array " + Arrays.toString(array6_2) + ": " + checkBalance(array6_2));
        System.out.println("For array " + Arrays.toString(array6_3) + ": " + checkBalance(array6_3));
        System.out.println("For array " + Arrays.toString(array6_4) + ": " + checkBalance(array6_4));
        System.out.println();

        System.out.println("Задание 7: Смещение массива на несколько элементов");
        int shift = 3;
        int shift1 = -4;

        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        System.out.println("Исходный массив: \t\t\t " + Arrays.toString(array));
        System.out.println();
        shiftArray(array, shift);
        System.out.println("Массив со смещением n=" + shift + " \t " + Arrays.toString(array));
        shiftArray(array, shift1);
        System.out.println("Массив со смещением n=" + shift1 + " \t " + Arrays.toString(array));
    }





    private static void printArray (int[] arr){                        // Метод выводит одномерный массив в консоль
        for (int i=0; i<arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    
    private static void printArray (int[][] arr){                       // Метод выводит двумерный массив в консоль
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }

    private static void inverseArray (int[] arr){                      // Метод заменяет в массиве 1 на 0, а 0 на 1
        for (int i=0; i<arr.length; i++){
            arr[i] = (arr[i]==0) ? 1 : 0;
        }
    }

    private static void fillArray (int[] arr){                          // Заполняем массив значениями 1 4 7 10 13 16 19 22...
        arr[0]=1;
        for (int i=1; i<arr.length; i++)
            arr[i] = arr[i-1]+3;
    }

    private static void redubleElemOfArray (int[] arr) {                // Метод умножает на 2 элементы массива, которые меньше 6
        for (int i=0; i<arr.length; i++)
            if (arr[i] < 6) arr[i] *= 2;
    }

    private static int minElemOfArray (int[] arr) {                     // Метод поиска минимального элемента массива
        int min = arr[0];
        for (int i=1; i<arr.length; i++)
            if (arr[i] < min) min = arr[i];
        return min;
    }

    private static int maxElemOfArray (int[] arr) {                     // Метод поиска максимального элемента массива
        int max = arr[0];
        for (int i=1; i<arr.length; i++)
            if (arr[i] > max) max = arr[i];
        return max;
    }
                                                                        // Метод заполняет диагонали квадратной матрицы единицами
    private static void fillDiagonalElemOfArray(int[][] squareArray) {
        for (int i=0; i<squareArray.length; i++){
            squareArray[i][i] = 1;
            squareArray[i][squareArray.length - 1 - i] = 1;
        }
    }

    private static boolean checkBalance(int[] array) {                  // Метод проверяет, есть ли в массиве место, которое делит левую и правую часть поровну
        int sumElemOfArr = 0;                                           // Вариант 1, через сравнение суммы нескольких элементов с половиной суммы всех элементов
        int sumAnyElem = 0;
        boolean flag = false;
        for (int i=0; i<array.length; i++)
            sumElemOfArr += array[i];
        if (sumElemOfArr%2 != 0)
            return false;
        sumElemOfArr /=2;
        for (int i=0; i<array.length; i++){
            sumAnyElem +=array[i];
            if (sumAnyElem == sumElemOfArr) {
                flag=true;
                break;
            }
        }
        return flag;
    }

    private static void shiftArray(int[] array, int n) {                  // Метод циклически сдвигает элементы массива на n элементов
        int lengthOfArray = array.length;
        int[] newArray = Arrays.copyOf(array, lengthOfArray);
        if (n >= lengthOfArray) n %= lengthOfArray;
        else if (n < 0){
            n = n + (-n/lengthOfArray * lengthOfArray) + lengthOfArray;
        }
        for (int i=0, j=i+n; i<lengthOfArray; i++, j++){
            if (j>=lengthOfArray) j%=lengthOfArray;
            array[i] = newArray[j];
        }
    }
}

