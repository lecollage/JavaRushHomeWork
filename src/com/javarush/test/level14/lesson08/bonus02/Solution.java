package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception {
        //while(true)
        {
            BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
            int x = Integer.parseInt(reader.readLine());
            int y = Integer.parseInt(reader.readLine());

            int i = 0;

            if (x == 0 && y != 0)
                i = y;
            else if (x != 0 && y == 0)
                i = x;
            else if (x == 1 || y == 1)
                //i = x >= y ? x : y;
                i=1;
            else {
                i = (x <= y ? x : y) + 1;
                while ((--i) > 0) {
                    if (x % i == 0 && y % i == 0)
                        break;
                }
            }

            System.out.println(i);

            //for(; i>0; i--)
            //    if(x%i==0 && y==0)
        }

    }
}