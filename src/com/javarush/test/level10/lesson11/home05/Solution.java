package com.javarush.test.level10.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).  Вывести результат на экран.
Пример вывода:
а 5
б 8
в 3
г 7
…
я 9
*/

public class Solution
{
    public static void main(String[] args)  throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++)
        {
            alphabet.add(abcArray[i]);
        }

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(Character ch : alphabet)
            map.put(ch, 0);

        //ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        //напишите тут ваш код
        for(String s: list)
        {
            char[] tmp = s.toCharArray();
            for(int i = 0; i < tmp.length; i++)
            {
                int indx = -1;
                for(int j = 0; j < alphabet.size(); j++)
                {
                    if (tmp[i] == alphabet.get(j).charValue())
                    {
                        indx = j;
                        break;
                    }
                }
                if(indx >= 0)
                {
                    Character ch = alphabet.get(indx);
                    int iTmp = map.get(ch).intValue() + 1;
                    map.put(ch, iTmp);
                }
            }
        }

        for(Character ch : alphabet)
            System.out.println(ch + " " + map.get(ch));
    }
}
