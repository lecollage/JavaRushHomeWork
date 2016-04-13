package com.javarush.test.level04.lesson10.task03;

import java.io.*;
import java.util.Scanner;

/* Хорошего не бывает много
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner in = new Scanner (System.in);
        String s = in.nextLine();
        int i = Integer.parseInt(in.nextLine());


        while(i--!=0)
            System.out.println(""+s);

    }
}
