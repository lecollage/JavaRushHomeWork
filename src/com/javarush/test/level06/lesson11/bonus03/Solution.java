package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> nums = new ArrayList<Integer>();

        int i = 5;
        while(i-- != 0)
            nums.add(Integer.parseInt(br.readLine()));

        //System.out.println(nums);

        Collections.sort(nums);

        //напишите тут ваш код
        //System.out.println(nums);
        for(Integer j: nums)
        {
            System.out.println(j);
        }
    }
}
