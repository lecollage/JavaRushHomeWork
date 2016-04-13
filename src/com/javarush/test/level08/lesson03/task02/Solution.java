package com.javarush.test.level08.lesson03.task02;

/* HashMap из 10 пар
Создать коллекцию HashMap<String, String>, занести туда 10 пар строк:
арбуз – ягода, банан – трава, вишня – ягода, груша – фрукт, дыня – овощ, ежевика – куст, жень-шень – корень, земляника – ягода, ирис – цветок, картофель – клубень.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Пример вывода (тут показана только одна строка):
картофель – клубень
*/

import java.util.*;


public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Map<String, String> maps = new HashMap<String, String>();
        maps.put("арбуз", "ягода");
        maps.put("банан", "трава");
        maps.put("вишня", "ягода");
        maps.put("груша", "фрукт");
        maps.put("дыня", "овощ");
        maps.put("ежевика", "куст");
        maps.put("жень-шень", "корень");
        maps.put("земляника", "ягода");
        maps.put("ирис", "цветок");
        maps.put("картофель", "клубень");
        for (Map.Entry<String, String> pair : maps.entrySet()){
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }
    }
}