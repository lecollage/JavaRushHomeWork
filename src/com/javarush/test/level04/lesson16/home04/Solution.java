package com.javarush.test.level04.lesson16.home04;

import java.io.*;
import java.util.Scanner;

/* Меня зовут 'Вася'...
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»
Пример:
Меня зовут Вася
Я родился 15.2.1988
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        Scanner in = new Scanner (System.in);
        String name = in.nextLine();
        int y = Integer.parseInt(in.nextLine());
        int m = Integer.parseInt(in.nextLine());
        int d = Integer.parseInt(in.nextLine());

        System.out.println("Меня зовут "+name);
        System.out.println("Я родился "+d+"."+m+"."+y);

    }
}
