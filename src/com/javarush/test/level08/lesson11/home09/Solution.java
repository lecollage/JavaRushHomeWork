package com.javarush.test.level08.lesson11.home09;

import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        //System.out.println(isDateOdd("JANUARY 1 2013"));


        //isDateOdd("01 01 2013");
    }

    public static boolean isDateOdd(String date)
    {

        //Date currentDate = new Date(date);

        String[] dateArr = date.split(" ");

        Map<String, Integer> dates = new HashMap<String, Integer>();
        dates.put("JANUARY"   ,GregorianCalendar.JANUARY);
        dates.put("FEBRUARY"  ,GregorianCalendar.FEBRUARY);
        dates.put("MARCH"     ,GregorianCalendar.MARCH);
        dates.put("APRIL"     ,GregorianCalendar.APRIL);
        dates.put("MAY"       ,GregorianCalendar.MAY);
        dates.put("JUNE"      ,GregorianCalendar.JUNE);
        dates.put("JULY"      ,GregorianCalendar.JULY);
        dates.put("AUGUST"    ,GregorianCalendar.AUGUST);
        dates.put("SEPTEMBER" ,GregorianCalendar.SEPTEMBER);
        dates.put("OCTOBER"	  ,GregorianCalendar.OCTOBER);
        dates.put("NOVEMBER"  ,GregorianCalendar.NOVEMBER);
        dates.put("DECEMBER"  ,GregorianCalendar.DECEMBER);

        System.out.println(dates.get(dateArr[0]));

        GregorianCalendar d = new GregorianCalendar(Integer.parseInt(dateArr[2]), dates.get(dateArr[0]), Integer.parseInt(dateArr[1]));

//        System.out.println(d);
//        System.out.println(d.get(Calendar.DAY_OF_YEAR));


        return (d.get(Calendar.DAY_OF_YEAR)%2) == 0?false:true;
    }
}