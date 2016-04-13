package com.javarush.test.level08.lesson11.home03;

import java.util.HashMap;
import java.util.Map;

/* Люди с одинаковыми именами и/или фамилиями
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList()
    {
        //напишите тут ваш код
        Map<String, String> people = new HashMap<String, String>();
        people.put("Вася1" , "Пупкин1" );
        people.put("Вася2" , "Пупкин2" );
        people.put("Вася3" , "Пупкин3" );
        people.put("Вася4" , "Пупкин4" );
        people.put("Вася5" , "Пупкин5" );
        people.put("Вася6" , "Пупкин6" );
        people.put("Вася7" , "Пупкин" );
        people.put("Вася8" , "Пупкин" );
        people.put("Вася" , "Пупкин9" );
        people.put("Вася", "Пупкин10");


        return people;
    }

    public static void printPeopleList(Map<String, String> map)
    {
        for (Map.Entry<String, String> s : map.entrySet())
        {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }

}
