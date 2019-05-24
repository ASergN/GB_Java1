package Lesson_6;

import java.io.*;
import java.util.Scanner;

public class Less_6_IO {
    public static void main(String[] args) {

//        char c=72;
//        System.out.println(c);
        try {
//            FileInputStream fis = new FileInputStream("test.txt");

            // чтение файла посимвольно
//            int b;
//            b = fis.read();
//            System.out.println(b);
//            b = fis.read();                        // теперь читает конец файла -1
//            System.out.println(b);

            // чтение файла до конца
//            while ((b = fis.read()) != -1) {
//                System.out.print((char)b);
//            }
//            fis.close();

            // работа с чтением из файла через класс-обёртку Scanner
            Scanner sc = new Scanner(new FileInputStream("test.txt"));
            while (sc.hasNext())                                    // "проглатывает" энтеры
                System.out.println(sc.next());
            sc.close();

            // работа с записью в файл через класс-обёртку PrintStream
            PrintStream ps = new PrintStream(new FileOutputStream("test.txt", true));
            ps.print("super string");
            ps.close();


//            FileOutputStream fos = new FileOutputStream("test.txt", true);
//            fos.write('\n');
//            fos.write(72);
//            fos.write('\n');
//            byte[] a = {'h', 'e', 'l', 'l', 'o'};
//            fos.write(a);
//            fos.write('\n');
//            fos.write("Hello World".getBytes());
//            fos.flush();
//            fos.close();
        } catch(FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
