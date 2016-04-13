package com.javarush.test.level09.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();
        char[] ch = s.toCharArray();
        StringBuilder vowelsTmp = new StringBuilder();
        StringBuilder noVowelsTmp = new StringBuilder();
        for(int i = 0; i < ch.length; i++)
            if(isVowel(ch[i]))
            {
                vowelsTmp.append(ch[i]);
                if(i != ch.length - 1)
                    vowelsTmp.append(' ');
            }else if(ch[i]!=' '){
                noVowelsTmp.append(ch[i]);
                if(i != ch.length - 1)
                    noVowelsTmp.append(' ');
            }

        System.out.println(vowelsTmp.toString());
        System.out.println(noVowelsTmp.toString());
    }


    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    //метод проверяет, гласная ли буква
    public static boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);  //приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   //ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
