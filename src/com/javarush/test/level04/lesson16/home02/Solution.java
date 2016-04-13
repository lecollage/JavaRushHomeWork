package com.javarush.test.level04.lesson16.home02;

import java.io.*;
import java.util.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{

    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        ArrayList<Integer> nums = new ArrayList<Integer>();

        Scanner in = new Scanner (System.in);

        for(int i = 0; i < 3; i++)
        {
            nums.add(Integer.parseInt(in.nextLine()));
            //if(nums.get(i)>)
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
        System.out.println(nums.get(0));
    }
}
