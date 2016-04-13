package com.javarush.test.level09.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Задача по алгоритмам
Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке, числа - в убывающем.
Пример ввода:
Вишня
1
Боб
3
Яблоко
2
0
Арбуз
Пример вывода:
Арбуз
3
Боб
2
Вишня
1
0
Яблоко
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<Integer> listNum = new ArrayList<Integer>();
        ArrayList<String> listAll = new ArrayList<String>();
        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            listAll.add(s);
            try{
                listNum.add(Integer.parseInt(s));
            }catch(NumberFormatException e){
                list.add(s);
            }
        }

        String[] array = list.toArray(new String[list.size()]);
        Integer[] arrayNum = listNum.toArray(new Integer[listNum.size()]);

        sort(array);
        sort(arrayNum);

        java.util.Iterator itAll = listAll.iterator();

        int i = 0, j = 0;
        while(itAll.hasNext())
        {
            try{
                Integer.parseInt((String)itAll.next());
                System.out.println(arrayNum[i]);
                i++;
            }catch(NumberFormatException e){
                System.out.println(array[j]);
                j++;
            }
        }
    }

    public static void sort(Integer[] array)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(Integer s: array)
            list.add(s);

        java.util.Collections.sort(list);

        for(int i = 0; i < array.length; i++)
            array[array.length-i-1]=list.get(i);
    }


    public static void sort(String[] array)
    {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        for(String s: array)
            list.add(s);

        java.util.Collections.sort(list);

        for(int i = 0; i < array.length; i++)
            array[i]=list.get(i);
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThen(String a, String b)
    {
        return a.compareTo(b) > 0;
    }


    //строка - это на самом деле число?
    public static boolean isNumber(String s)
    {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];
            if ((i != 0 && c == '-') //есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') ) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}

