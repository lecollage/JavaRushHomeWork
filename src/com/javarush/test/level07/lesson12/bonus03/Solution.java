package com.javarush.test.level07.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(int[] array)
    {
        //напишите тут ваш код

        ArrayList<Integer> ls =new ArrayList<Integer>();
        for(int i = 0; i<array.length; i++)
            ls.add(array[i]);

        Collections.sort(ls);
        //ls.toArray();

        //System.out.println(ls);

        for(int i = 0; i<array.length; i++){
            Integer k = ls.get(ls.size()-1);
            ls.remove(ls.size()-1);
            ls.add(k);
        }

        ArrayList<Integer> ls2 =new ArrayList<Integer>();

        for(int i = array.length-1; i>=0; i--){
            ls2.add(ls.get(i));
        }


        //System.out.println(ls2);

        for(int i = 0; i<array.length; i++)
            array[i] = ls2.get(i);
    }
}
