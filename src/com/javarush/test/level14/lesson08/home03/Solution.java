package com.javarush.test.level14.lesson08.home03;

import com.javarush.test.level14.lesson08.home05.Person;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* User, Looser, Coder and Proger
1. Ввести [в цикле] с клавиатуры несколько строк (ключей).
Строки(ключи) могут быть такими: "user", "looser", "coder", "proger".
Ввод окончен, когда строка не совпадает ни с одной из выше указанных.

2. Для каждой введенной строки нужно:
2.1. Создать соответствующий объект [см Person.java], например, для строки "user" нужно создать объект класса User.
2.2. Передать этот объект в метод doWork.

3. Написать реализацию метода doWork, который:
3.1. Вызывает метод live() у переданного обекта, если этот объект (person) имеет тип User.
3.2. Вызывает метод doNothing(), если person имеет тип Looser.
3.3. Вызывает метод coding(), если person имеет тип Coder.
3.4. Вызывает метод enjoy(), если person имеет тип Proger.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        //тут цикл по чтению ключей, пункт 1
        ArrayList<String> keys = new ArrayList<String>();
        boolean exit = false;
        while(!exit){
            key = reader.readLine();
            switch(key) {
                case "user":
                case "looser":
                case "coder":
                case "proger":
                    keys.add(key);
                    break;
                default:
                    exit = true;
                    break;
            }
        }



        {
        //создаем объект, пункт 2
            for (String keyTmp: keys){
                switch(keyTmp){
                    case "user":
                        person = new Person.User();
                        break;
                    case "looser":
                        person = new Person.Looser();
                        break;
                    case "coder":
                        person = new Person.Coder();
                        break;
                    case "proger":
                        person = new Person.Proger();
                        break;
                }
                doWork(person); //вызываем doWork
            }
        }
    }

    public static void doWork(Person person)
    {
        // пункт 3
//        if(person instanceof Person.Coder){
//            ((Person.Coder) person).coding();
//        }else if(person instanceof Person.Looser){
//            ((Person.Looser) person).doNothing();
//        }else if(person instanceof Person.Proger){
//            ((Person.Proger) person).enjoy();
//        }else if(person instanceof Person.User){
//            ((Person.User) person).live();
//        }
    }
}
