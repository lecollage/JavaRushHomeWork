package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        String regex = "(?:^|(?<=\\s))([A-Za-zА-Яа-я])";

        StringBuilder sbTmp = new StringBuilder(s);
        java.util.regex.Matcher m = java.util.regex.Pattern.compile(regex).matcher(sbTmp);
        while(m.find())
            sbTmp.replace(m.start(), m.end(), m.group().toUpperCase());
        System.out.println(sbTmp);
    }
}
