package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        final int length = 20;
        int[] iArr = new int[length];

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < length; i++)
            iArr[i] = Integer.parseInt(in.readLine());

        final int length1 = 10;
        int[] iArr_1 = new int[length1];
        int[] iArr_2 = new int[length1];

        int j = 0, k = 0;



        for(int i = 0; i < length; i++)
            if (i <= ((length / 2) - 1))
                iArr_1[j++] = iArr[i];
            else
                iArr_2[k++] = iArr[i];


        for(int i = 0; i < length1; i++)
            System.out.println(iArr_2[i]);

    }
}
