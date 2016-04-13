package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int N = Integer.parseInt(in.readLine());
        int M = Integer.parseInt(in.readLine());
        ArrayList<String> list = new ArrayList<String>();

        for(int i = 0; i < N; i++)
            list.add(in.readLine());

        for(int i = 0; i < M; i++){
            String tmp = list.get(0);
            list.remove(0);
            list.add(tmp);
        }

        for(String s: list)
            System.out.println(s);
    }
}