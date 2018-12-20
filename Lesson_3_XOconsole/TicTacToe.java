package Lesson_3_XOconsole;

/*
    Переписать проверку победы
    Переписать логику проверки победы для поля 5*5 и количества фишек 4
    Доработать ИИ, чтобы мог блокировать ходы игрока
 */

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = '0';
    private static final char DOT_EMPTY = '.';
    private static int fieldSizeY;
    private static int fieldSizeX;
    private static char[][] field;

    private static void initMap(){
        fieldSizeX = 3;
        fieldSizeY = 3;
        field = new char[fieldSizeY][fieldSizeX];
        for (int i=0; i<fieldSizeY; i++){
            for (int j=0; j<fieldSizeX; j++){
                field[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap(){
        System.out.println("-------");
        for (int i=0; i<fieldSizeY; i++){
            System.out.print("|");
            for (int j=0; j<fieldSizeX; j++){
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println("-------");
    }

    private static void humanTurn(){
        int x, y;
        do{
            System.out.println("Введите координаты X и Y (от 1 до 3) через пробел: ");
            x = SCANNER.nextInt()-1;
            y = SCANNER.nextInt()-1;
        } while (!isValidSell(x, y) || !isEmptySell(x, y));
        field[y][x] = DOT_HUMAN;
    }

    private static void aiTurn(){
        int x, y;
        do{
            x = RANDOM.nextInt(fieldSizeX);
            y = RANDOM.nextInt(fieldSizeY);
        } while (!isEmptySell(x, y));
        field[y][x] = DOT_AI;
    }

    private static boolean checkWin(char c){
        if (field[0][0] == c && field[0][1] == c && field[0][2] == c) return true;
        if (field[1][0] == c && field[1][1] == c && field[1][2] == c) return true;
        if (field[2][0] == c && field[2][1] == c && field[2][2] == c) return true;

        if (field[0][0] == c && field[1][0] == c && field[2][0] == c) return true;
        if (field[0][1] == c && field[1][1] == c && field[2][1] == c) return true;
        if (field[0][2] == c && field[1][2] == c && field[2][2] == c) return true;

        if (field[0][0] == c && field[1][1] == c && field[2][2] == c) return true;
        if (field[0][2] == c && field[1][1] == c && field[2][0] == c) return true;

        return false;
    }

    private static boolean isMapFull(){
        for (int i=0; i<fieldSizeY; i++){
            for (int j=0; j<fieldSizeX; j++){
                if (field[i][j] == DOT_EMPTY)
                    return false;
            }
        }
        return true;
    }

    private static boolean isValidSell(int x, int y){
        return x>=0 && x<fieldSizeX && y>=0 && y<fieldSizeY;
    }

    private static boolean isEmptySell(int x, int y){
        return field[y][x] == DOT_EMPTY;
    }

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true){
            humanTurn();
            printMap();
            if (checkWin(DOT_HUMAN)){
                System.out.println("Выиграл игрок!");
                break;
            }
            if (isMapFull()){
                System.out.println("Ничья!");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_AI)){
                System.out.println("Выиграл компьютер!");
                break;
            }
            if (isMapFull()){
                System.out.println("Ничья!");
                break;
            }
        }
        SCANNER.close();
    }
}
