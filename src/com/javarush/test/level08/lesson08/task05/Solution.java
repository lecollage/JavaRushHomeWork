package com.javarush.test.level08.lesson08.task05;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
//    public static void main(String[] args){
//        HashMap<String, String> people =  createMap();
//        for(Map.Entry<String, String> entry: people.entrySet())
//            System.out.println(entry.getKey()+ " "+ entry.getValue());
//
//        //removeTheFirstNameDuplicates(
//    }
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> people = new HashMap<String, String>();

        people.put("Пупкин1" , "Вася1" );
        people.put("Пупкин2" , "Вася2" );
        people.put("Пупкин3" , "Вася" );
        people.put("Пупкин4" , "Вася4" );
        people.put("Пупкин5" , "Вася" );
        people.put("Пупкин6" , "Вася" );
        people.put("Пупкин7" , "Вася7" );
        people.put("Пупкин8" , "Вася8" );
        people.put("Пупкин9" , "Вася9" );
        people.put("Пупкин10", "Вася10");

        return people;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код
//        java.util.Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
//        while(it.hasNext())
//            if

        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (String value : copy.values())
            if (Collections.frequency(copy.values(), value) > 1)
                removeItemFromMapByValue(map, value);


    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
