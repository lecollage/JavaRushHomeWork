package com.javarush.test.level03.lesson04.task04;

/* Произведение 10 чисел
Вывести на экран произведение 10 чисел от 1 до 10. Результат - 1 число.
Подсказка: будет три миллиона с хвостиком.
*/

import java.util.*;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код

        int result = 1;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i = 1; i <= 10; i++)
            numbers.add(i);
        Iterator it  = numbers.iterator();

        while(it.hasNext())
        {
            Integer temp = (Integer)it.next();
            result *= temp.intValue();
        }

        System.out.println(""+result);




    }
}