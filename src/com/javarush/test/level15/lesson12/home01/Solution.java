package com.javarush.test.level15.lesson12.home01;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Разные методы для разных типов
1. Считать с консоли данные, пока не введено слово "exit".
2. Для каждого значения, кроме "exit", вызвать метод print. Если значение:
2.1. содержит точку '.', то вызвать метод print для Double;
2.2. больше нуля, но меньше 128, то вызвать метод print для short;
2.3. больше либо равно 128, то вызвать метод print для Integer;
2.4. иначе, вызвать метод print для String.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> keys = new ArrayList<String>();

        {
            String key = "";
            while (!(key = r.readLine()).equals("exit")) {
                keys.add(key);
            }
        }

        for(String key: keys){
            try {
                if (key.contains("."))
                    print(new Double(key));
                else {
                    Integer tmpInt = new Integer(key);
                    if (tmpInt >= 0 && tmpInt < 128)
                        print((short) tmpInt.intValue());//short tmpSh = (short)tmpInt.intValue();
                    else
                        print(tmpInt);
                }
            }catch(Exception e){
                print(key);
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
