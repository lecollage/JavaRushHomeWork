package com.javarush.test.level04.lesson06.task04;

/* Сравнить имена
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны». Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
*/

import java.io.*;
import java.util.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код

        Scanner in = new Scanner(System.in);
        String name1 = in.nextLine();
        String name2 = in.nextLine();

        if(name1.equals(name2))
            System.out.println("Имена идентичны");
        else
            if(name1.length() == name2.length())
                System.out.println("Длины имен равны");
    }
}
