package com.javarush.test.level13.lesson11.home03;

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        //add your code here
        //D:\WORK\Locale Servers.txt
        Scanner s = new Scanner(System.in);
        FileInputStream in = null;
        try{
            in = new FileInputStream(s.nextLine());
            byte[] b = new byte[1024];
            int n = 0;
            while(in.available()>0){
                System.out.print((char)in.read());
            }
        }catch(Exception e){
        }finally {
            s.close();
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
