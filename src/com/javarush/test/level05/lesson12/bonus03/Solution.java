package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());

        int tmp = 0;

        if(count>0)
        {
            int maximum = 0;
            maximum = Integer.parseInt(reader.readLine());
            while (count-- != 1)
            {
                tmp = Integer.parseInt(reader.readLine());
                if (tmp>maximum)
                    maximum = tmp;
            }
            System.out.println(maximum);
        }
    }
}
