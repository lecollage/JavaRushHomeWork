package com.javarush.test.level03.lesson08.task04;

/* Спонсор - это звучит гордо
Ввести с клавиатуры два имени и вывести надпись:
name1 проспонсировал name2, и она стала известной певицей.
Пример:
Коля проспонсировал Лену, и она стала известной певицей.
*/

import java.io.*;
import java.util.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner in = new Scanner(System.in);

        ArrayList<String> strings = new ArrayList<String>();
        strings.add(in.nextLine());
        strings.add(in.nextLine());

        System.out.println(strings.get(0)+" проспонсировал "+strings.get(1)+", и она стала известной певицей.");
    }
}