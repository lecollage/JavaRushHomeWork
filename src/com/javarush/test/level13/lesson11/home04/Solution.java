package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String fileName = in.nextLine();
        String s = null;

        FileOutputStream out = null;
        try {
            out = new FileOutputStream(fileName);
            while(!(s = in.nextLine()).equals("exit")){
                out.write((s + "\r\n").getBytes());
            }
            out.write(("exit").getBytes());
        } catch (Exception e) {
        }finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
