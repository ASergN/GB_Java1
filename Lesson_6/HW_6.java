package Lesson_6;

/*
    1. Создать 2 текстовых файла, примерно по 50-100 символов в каждом.
    2. Написать метод, "склеивающий" содержимое этих файлов. То есть сначала идёт текст из первого файла, потом текст из второго.
    3. * Написать метод, который проверяет, присутствует ли в файле указанное пользователем слово.
    4. ** Написать метод, проверяющий, есть ли указанное слово в файлах папки
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class HW_6 {
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("textfile_result.txt", true);
            FileInputStream fis = new FileInputStream("textfile_1.txt");

            writeToFile(fis, fos);
            fos.write('\n');

            fis = new FileInputStream("textfile_2.txt");
            writeToFile(fis, fos);

            fos.write('\n');

            fis.close();
            fos.flush();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.getMessage();
        }
    }

    private static void writeToFile(FileInputStream fis, FileOutputStream fos) throws IOException {
        int text;
        while ((text=fis.read()) != -1){
            fos.write(text);
        }
    }
}