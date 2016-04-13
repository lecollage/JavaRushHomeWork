package com.javarush.test.level03.lesson04.task01;

/* Дата рождения
Вывести на экран дату своего рождения в виде: MAY 1 2012
*/
import java.util.*;
import java.text.*;

public class Solution
{
    public static void main(String[] args)
    {
        GregorianCalendar myBirthDate = new GregorianCalendar(1992, Calendar.FEBRUARY, 13);
        System.out.println(myBirthDate);
        System.out.println(formatDate(myBirthDate));
    }

    public static String formatDate(GregorianCalendar calendar){
        SimpleDateFormat format = new SimpleDateFormat("MMM d YYYY");

        format.setCalendar(calendar);
        String formatDate = format.format(calendar.getTime());;

        return formatDate.toUpperCase();
    }
}