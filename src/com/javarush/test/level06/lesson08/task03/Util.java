package com.javarush.test.level06.lesson08.task03;

/* Класс Util
Реализовать статический метод double getDistance(x1, y1, x2, y2). Он должен вычислять расстояние между точками.
Используй метод double Math.sqrt(double a), который вычисляет квадратный корень переданного параметра
*/

import java.math.*;

public class Util
{
    public static double getDistance(int x1, int y1, int x2, int y2)
    {
        //напишите тут ваш код

        //d=(x2−x1)2+(y2−y1)2

        double d2 = ((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));

        return Math.sqrt(d2);

    }
}
