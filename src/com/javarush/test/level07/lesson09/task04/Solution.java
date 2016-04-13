package com.javarush.test.level07.lesson09.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.*;

/* Буква «р» и буква «л»
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву «р»
2.2. удваивать все слова содержащие букву «л».
2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
2.4. с другими словами ничего не делать.
Пример:
роза
лира
лоза
Выходные данные:
лира
лоза
лоза
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лира"); //1
        list.add("лоза"); //2
        list = fix(list);

        for (String s : list)
        {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list)
    {
        //напишите тут ваш код
        {
            Iterator i = list.iterator();

            while (i.hasNext())
            {

                String tmp = (String) i.next();

                //if (tmp.matches("р"))
                if (Pattern.compile("р").matcher(tmp).find() && !Pattern.compile("л").matcher(tmp).find())
                    i.remove();

            }
        }

        //System.out.println("1");

        for(int i = 0; i < list.size(); i++)
        {
            if (Pattern.compile("л").matcher(list.get(i)).find()&& !Pattern.compile("р").matcher(list.get(i)).find())
            {
                list.add(i, list.get(i));
                i++;
            }
        }

        return list;
    }
}