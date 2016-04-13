package com.javarush.test.level12.lesson04.task04;

/* Три метода возвращают минимальное из двух переданных в него чисел
Написать public static методы: int min(int, int), long min(long, long), double min(double, double).
Каждый метод должен возвращать минимальное из двух переданных в него чисел.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    //Напишите тут ваши методы
    public static int min(int v1, int v2){
        return v1<v2?v1:v2;
    }
    public static long min(long v1, long v2){return v1<v2?v1:v2;}
    public static double min(double v1, double v2){return v1<v2?v1:v2;}
}
