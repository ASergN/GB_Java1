package Lesson_1;

/*
 * 1. Написать метод, вычисляющий выражение a*(b+(c/d)) и возвращающий результат с плавающей точкой,
 *    где a, b, c, d - целочисленные входные параметры этого метода.
 * 2. Написать метод, принимающий на вход 2 целых числа, и проверяющий, что их сумма лежит в пределах от 10 до 20 включительно,
 *    если да - вернуть true, в противном случае - false.
 * 3. Написать метод, которому в качестве параметра передаётся целое число, метод должен проверить - положительное число передали
 *    или отрицательное. Ноль считается положительным числом. Результат работы метода вывести в консоль.
 * 4. Написать метод, которому в качестве параметра передаётся строка, обозначающая имя. Метод должен вернуть
 *    приветственное сообщение "Привет, переданное_имя!". Приветствие вывести в консоль.
 * 5. Написать метод, который определяет, является ли год високосным. Каждый 4-й год является високосным, кроме каждого сотого,
 *    при этом каждый 400-й - високосный. Результат работы метода вывести в консоль.
 */

public class Less_1 {
    public static void main(String[] args) {

        int a = 15, b = 4, c = 7, d = 2;
        int x1 = -5, x2 = 0, x3 = 5;
        String name = "Сергей";
        int year1 = 1900, year2 = 1980, year3 = 2017;

        System.out.println("Задание 1: вычисление выражения a*(b+(c/d))");
        System.out.println(calcExpression(a, b, c, d));
        System.out.println();

        System.out.println("Задание 2: проверка суммы.");
        System.out.println(checkSum(b, d));         // 4+2
        System.out.println(checkSum(a, b));         // 15+4
        System.out.println(checkSum(a, c));         // 15+7
        System.out.println();

        System.out.println("Задание 3: Проверить, положительное ли или отрицательное число");
        System.out.println(isPositive(x1));
        System.out.println(isPositive(x2));
        System.out.println(isPositive(x3));
        System.out.println();

        System.out.println("Задание 4: \"Привет, имя!\"");
        System.out.println(prName(name));
        System.out.println();

        System.out.println("Задание 5: Проверка года на високосность");
        System.out.println(year1 + ": " + (isLeapYear(year1) ? "Год является високосным" : "Год не является високосным"));
        System.out.println(year2 + ": " + (isLeapYear(year2) ? "Год является високосным" : "Год не является високосным"));
        System.out.println(year3 + ": " + (isLeapYear(year3) ? "Год является високосным" : "Год не является високосным"));
    }



    private static double calcExpression(int a, int b, int c, int d) {
        return a*(b+((double)c/d));
    }

    private static boolean checkSum(int a, int b) {
        return (a+b >= 10) && (a+b <= 20);
    }

    private static boolean isPositive(int x) {
        return !(x<0);
    }

    private static String prName(String name) {
        return "Привет, " + name + "!";
    }

    private static boolean isLeapYear(int year) {
        return (year%400 == 0) || ((year%4 == 0) && (year%100 != 0));
    }
}
