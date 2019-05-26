package Lesson_6;

/*
    1. Создать 2 текстовых файла, примерно по 50-100 символов в каждом.
    2. Написать метод, "склеивающий" содержимое этих файлов. То есть сначала идёт текст из первого файла, потом текст из второго.
    3. * Написать метод, который проверяет, присутствует ли в файле указанное пользователем слово.
    4. ** Написать метод, проверяющий, есть ли указанное слово в файлах папки
*/

import java.io.*;

public class HW_6 {
    public static void main(String[] args) {
        try{
            String fileName_1 = "textfile_1.txt";
            String fileName_2 = "textfile_2.txt";
            String fileName_result = "textfile_result.txt";
            String matchString1 = "ringing";
            String matchString2 = "string12";
            FileOutputStream fos = new FileOutputStream(fileName_result, true);

            writeToFile(fileName_1, fileName_result);
            fos.write('\n');
            writeToFile(fileName_2, fileName_result);

            System.out.println("В файле " + fileName_result + " есть строка " + matchString1 + ": " + searchExpressionInFile(fileName_result, matchString1));
            String fileName = searchInFiles(matchString1);
            System.out.println("В текущей директории строка " + matchString1 + (fileName==null ? " отсутствует" : " присутствует в файле " + fileName));
            fileName = searchInFiles(matchString2);
            System.out.println("В текущей директории строка " + matchString2 + (fileName==null ? " отсутствует" : " присутствует в файле " + fileName));

            fos.write('\n');

            fos.flush();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.getMessage();
        }
    }

    private static void writeToFile(String fileName_In, String fileName_Out) throws IOException {
        FileInputStream fis = new FileInputStream(fileName_In);
        FileOutputStream fos = new FileOutputStream(fileName_Out, true);
        int text;
        while ((text=fis.read()) != -1){
            fos.write(text);
        }
        fis.close();
        fos.flush();
        fos.close();
    }

    private static boolean searchExpressionInFile(String fileName, String str) throws IOException{
        FileInputStream fis = new FileInputStream(fileName);
        int current_ch;
        byte[] seach_expression = str.getBytes();
        int i=0;

        while ((current_ch=fis.read()) != -1){
            if (current_ch == seach_expression[i]){
                i++;
            }
            else {
                i=0;
                if (current_ch == seach_expression[i]) i++;
            }

            if (i==seach_expression.length){
                fis.close();
                return true;
            }
        }
        fis.close();
        return false;
    }

    private static String searchInFiles(String searchStr) throws IOException{
        File path = new File(new File(".").getCanonicalPath());
        File[] dir = path.listFiles();

        for (int i=0; i<dir.length; i++) {
            if (dir[i].isDirectory())
                continue;
            else {
                if (searchExpressionInFile(dir[i].getName(), searchStr)){
                    return dir[i].getName();
                }
            }
        }
        return null;
    }
}


// переделать методы, чтоб было без fis, fos во входных пар-ах, доделать поиск по файлам