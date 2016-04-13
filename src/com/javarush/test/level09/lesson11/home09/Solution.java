package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        //напишите тут ваш код
        HashMap<String, Cat> cats = new HashMap<String, Cat>();

        cats.put("Вася1" , new Cat("Вася1" ));
        cats.put("Вася2" , new Cat("Вася2" ));
        cats.put("Вася3" , new Cat("Вася3" ));
        cats.put("Вася4" , new Cat("Вася4" ));
        cats.put("Вася5" , new Cat("Вася5" ));
        cats.put("Вася6" , new Cat("Вася6" ));
        cats.put("Вася7" , new Cat("Вася7" ));
        cats.put("Вася8" , new Cat("Вася8" ));
        cats.put("Вася9" , new Cat("Вася9" ));
        cats.put("Вася10", new Cat("Вася10"));

        return cats;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        //напишите тут ваш код
        Set cats = new HashSet<Cat>();
        for(Map.Entry<String, Cat> entry:map.entrySet())
            cats.add(entry.getValue());

        return cats;

    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
