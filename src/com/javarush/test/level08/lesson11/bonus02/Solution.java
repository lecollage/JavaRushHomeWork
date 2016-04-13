package com.javarush.test.level08.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

/* Нужно добавить в программу новую функциональность
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        //List<String> addresses = new ArrayList<String>();

        Map<String, String> addressesMap = new HashMap<String, String>();

        while (true)
        {
            String family = reader.readLine();
            if (family.isEmpty()) break;
            String city = reader.readLine();
            if (city.isEmpty()) break;

            //addresses.add(family);
            //addressesMap.put(city, family);
            addressesMap.put(family, city);
        }

        //System.out.println("1");

        //read home number
        /*int houseNumber = Integer.parseInt(reader.readLine());

        if (0 <= houseNumber && houseNumber < addresses.size())
        {
            String familySecondName = addresses.get(houseNumber);
            System.out.println(familySecondName);
        }*/

        //read city

        String city = reader.readLine();
        //System.out.println("1");
        //city = reader.readLine();
        //System.out.println((city));
        System.out.println(addressesMap.get(city));

        /*for(Map.Entry<String, String> entry: addressesMap.entrySet())
           *//* if(entry.getKey().equals("Лондон"))
                System.out.println(entry.getKey());*//*
            System.out.println(entry.getKey() + " " +entry.getValue());*/

    }
}
