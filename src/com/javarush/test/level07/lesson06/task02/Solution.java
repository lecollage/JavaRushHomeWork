package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
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
        int maxLength = 0;
        for(int i = 0; i < 5; i++)
        {
            sArr.add(in.readLine());
            if(sArr.get(i).length()>=maxLength)
            {
                maxLength =sArr.get(i).length();

            }
        }

        for(String s: sArr)
            if(s.length()==maxLength)
                sArr_1.add(s);

        for(String s: sArr_1)
            System.out.println(s);
    }
}
