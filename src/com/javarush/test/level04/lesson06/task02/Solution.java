package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static int max(int a, int b){
        return a>b?a:b;
    }

    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner in = new Scanner (System.in);

        int a = Integer.parseInt(in.nextLine());
        int b = Integer.parseInt(in.nextLine());
        int c = Integer.parseInt(in.nextLine());
        int d = Integer.parseInt(in.nextLine());

        System.out.println(max(max(a, b), max(c,d)));

    }
}
