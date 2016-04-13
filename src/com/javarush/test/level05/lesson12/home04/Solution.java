package com.javarush.test.level05.lesson12.home04;

/* Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде "21 02 2014".
*/
import java.text.SimpleDateFormat;
import java.util.*;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Date curDate = new Date();
        SimpleDateFormat df = new SimpleDateFormat("dd M yyyy");
        System.out.println(df.format(curDate));
    }
}
