package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        // напишите тут ваш код
        //D:\WORK\test.txt
        BufferedReader br = null;

        ArrayList<Integer> evens = new ArrayList<Integer>();
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream((new Scanner(System.in)).nextLine())));
            String tmp = null;
            while((tmp = br.readLine()) != null){
                //System.out.println(tmp);
                try {
                    Integer num = new Integer(tmp);
                    if(num%2 == 0)
                        evens.add(num);
                }catch(NumberFormatException e){
                    //System.out.println("Не цифра!");
                }
            }
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }

        Integer[] ints = new Integer[evens.size()];

        for (int i = 0; i < evens.size(); i++) {
            ints[i] = evens.get(i);
        }

        Arrays.sort(ints);

        for(Integer i: ints){
            System.out.println(i);
        }
    }
}
