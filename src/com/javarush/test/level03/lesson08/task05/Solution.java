package com.javarush.test.level03.lesson08.task05;

/* Чистая любовь
Ввести с клавиатуры три имени, вывести на экран надпись:
name1 + name2 + name3 = Чистая любовь, да-да!
Пример: Вася + Ева + Анжелика = Чистая любовь, да-да!
*/

import java.util.*;
import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner sin = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        names.add(sin.nextLine());
        names.add(sin.nextLine());
        names.add(sin.nextLine());

        System.out.println(names.get(0)+" + "+names.get(1)+" + "+names.get(2)+" = Чистая любовь, да-да!");
    }
}