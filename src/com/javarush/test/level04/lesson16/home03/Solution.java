package com.javarush.test.level04.lesson16.home03;

import java.io.*;
import java.util.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        ArrayList<Integer> nums = new ArrayList<Integer>();
        Scanner in = new Scanner (System.in);


        int sum = 0;
        while(true){
            int tmp = Integer.parseInt(in.nextLine());
            sum += tmp;
            if(tmp == -1)
                break;


        }
        System.out.println(""+sum);
    }
}
