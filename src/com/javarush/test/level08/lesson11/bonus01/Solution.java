package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //напишите тут ваш код
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        //String s = in.readLine();

        //Date d = new Date();

        //SimpleDateFormat sd = new SimpleDateFormat("12.12.12");



        Map<String, Integer> dates = new HashMap<String, Integer>();

        dates.put("January",  GregorianCalendar.JANUARY);
        dates.put("February", GregorianCalendar.FEBRUARY);
        dates.put("March",    GregorianCalendar.MARCH);
        dates.put("April",    GregorianCalendar.APRIL);
        dates.put("May"  ,    GregorianCalendar.MAY);
        dates.put("June",     GregorianCalendar.JUNE);
        dates.put("July",     GregorianCalendar.JULY);
        dates.put("August",   GregorianCalendar.AUGUST);
        dates.put("September",GregorianCalendar.SEPTEMBER);
        dates.put("November", GregorianCalendar.NOVEMBER);
        dates.put("December", GregorianCalendar.DECEMBER);
        dates.put("October",  GregorianCalendar.OCTOBER);

        String month = in.readLine();

        System.out.println(month+ " is "+(dates.get(month)+1)+" month");


    }

}
