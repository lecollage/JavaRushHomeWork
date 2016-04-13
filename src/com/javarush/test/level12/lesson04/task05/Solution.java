package com.javarush.test.level12.lesson04.task05;

/* Три метода возвращают максимальное из двух переданных в него чисел
Написать public static методы: int max(int, int), long max (long, long), double max (double, double).
Каждый метод должен возвращать максимальное из двух переданных в него чисел.
*/

public class Solution
{
    public static void main(String[] args)
    {
    }

    //Напишите тут ваши методы
    public static int max(int v1, int v2){
        return v1>v2?v1:v2;
    }

    public static long max(long v1, long v2){
        return v1>v2?v1:v2;
    }

    public static double max(double v1, double v2){
        return v1>v2?v1:v2;
    }
}
