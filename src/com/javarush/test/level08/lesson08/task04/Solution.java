package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{

    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stallone1", new Date("JUNE 1 1980"));
        map.put("Stallone2", new Date("JUNE 1 1980"));
        map.put("Stallone3", new Date("JUNE 1 1980"));
        map.put("Stallone4", new Date("JUNE 1 1980"));
        map.put("Stallone5", new Date("JUNE 1 1980"));
        map.put("Stallone6", new Date("JUNE 1 1980"));
        map.put("Stallone7", new Date("APRIL 1 1980"));
        map.put("Stallone8", new Date("JUNE 1 1980"));
        map.put("Stallone9", new Date("JUNE 1 1980"));


        return map;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        HashSet<String> set = new HashSet<String>();
        for (Map.Entry<String,Date> pair : map.entrySet())
        {

            if (isSummer(pair.getValue()))
            {
                set.add(pair.getKey());
            }
        }
        for (String s : set)
        {
            map.remove(s);
        }
    }
    public static boolean isSummer(Date date)
    {
        boolean res = date.getMonth() <= 7 && date.getMonth() >= 5 ? true:false;
        return res;
    }
}