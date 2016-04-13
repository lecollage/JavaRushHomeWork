package com.javarush.test.level03.lesson06.task02;

/* Таблица умножения
Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 …
2 4 6 …
3 6 9 …
…
*/

import java.util.*;

public class Solution
{
    private static int mul(int a, int b){
        return a*b;
    }

    public static void main(String[] args)
    {
        //напишите тут ваш код

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();

        for(int i = 1; i < 11; i++){
            ArrayList<Integer> temp  = new ArrayList<Integer>();
            temp.add(i);
            if(i == 1)
                for(int j = 2; j < 11; j++)
                    temp.add(j);

            matrix.add(temp);
        }

        for(int i = 1; i < 10; i++){
            ArrayList<Integer> temp  = new ArrayList<Integer>();
            temp = matrix.get(i);
            for(int j = 1; j < 10; j++)
                matrix.get(i).add(mul(matrix.get(i).get(0), matrix.get(0).get(j)));
        }

        for(ArrayList temp: matrix)
        {
            Iterator it = temp.iterator();
            while(it.hasNext())
                System.out.print(it.next() + " ");
            System.out.print("\n");
        }

        //System.out.println(matrix.toString());
    }
}