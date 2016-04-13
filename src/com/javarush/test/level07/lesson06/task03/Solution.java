package com.javarush.test.level07.lesson06.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая короткая строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        ArrayList<String> sArr = new ArrayList<String>();

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> sArr_1 = new ArrayList<String>();
        sArr.add(in.readLine());
        int mixLength = sArr.get(0).length();
        for(int i = 1; i < 5; i++)
        {
            sArr.add(in.readLine());
            if(sArr.get(i).length()<=mixLength)
            {
                mixLength =sArr.get(i).length();

            }
        }

        for(String s: sArr)
            if(s.length()==mixLength)
                sArr_1.add(s);

        for(String s: sArr_1)
            System.out.println(s);
    }
}
