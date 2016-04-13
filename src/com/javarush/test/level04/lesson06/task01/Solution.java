package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;
import java.util.*;

public class Solution
{
    public static int min(int a, int b){
        return a>b?b:a;
    }

    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner in = new Scanner (System.in);

        int a = Integer.parseInt(in.nextLine());
        int b = Integer.parseInt(in.nextLine());

        System.out.println(min(a,b));

    }
}