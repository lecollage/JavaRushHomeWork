package com.javarush.test.level03.lesson08.task02;

/* Зарплата через 5 лет
Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись:
«Имя» получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
*/

import java.io.*;
import java.util.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner in = new Scanner (System.in);
        String name = in.nextLine();
        int n1 = Integer.parseInt(in.nextLine());
        int n2 = Integer.parseInt(in.nextLine());

        System.out.println(name+" получает "+n1+" через "+n2+" лет.");
    }
}