package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<Integer> nums = new ArrayList<Integer>();

        Scanner in = new Scanner (System.in);

        for(int i = 0; i < 3; i++)
        {
            nums.add(Integer.parseInt(in.nextLine()));
        }
        Integer min = nums.get(0);
        Integer max = nums.get(0);

        for(int i = 0; i < 3; i++)
        {
            if(nums.get(i)<min)
                min = nums.get(i);
            if(nums.get(i)>max)
                max = nums.get(i);
        }



        nums.remove(min);
        nums.remove(max);
        System.out.println(max);
        System.out.println(nums.get(0));
        System.out.println(min);

    }
}
