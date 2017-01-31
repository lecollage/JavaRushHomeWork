package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.regex.Pattern;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String key = null;
        try {
            key = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] parametersWithValues = (Pattern.compile(".+\\?").matcher(key).replaceAll("")).split("\\&");

        ArrayList<Pair> parameters = new ArrayList<Pair>();

        for(String parameterWithValue: parametersWithValues)
            parameters.add(new Pair(Pattern.compile("=.+").matcher(parameterWithValue).replaceAll(""), Pattern.compile(".+=").matcher(parameterWithValue).replaceAll("")));

        for(Pair parameter: parameters){
            System.out.print(parameter.getParameter() + " ");
        }

        System.out.println("");

        for(Pair parameter: parameters)
            if(parameter.getParameter().equals("obj"))
                try{
                    alert(new Double(parameter.getValue()).doubleValue());
                }catch(NumberFormatException e){
                    alert(parameter.getValue());
                }
    }

    private static class Pair{
        private String parameter = "";
        private String value = "";

        Pair(String parameter, String value){
            this.parameter = parameter;
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public String getParameter() {
            return parameter;
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
