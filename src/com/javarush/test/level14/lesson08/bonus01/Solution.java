package com.javarush.test.level14.lesson08.bonus01;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        //Add your code here
        //1
        try{
            Integer.parseInt("S");
        }catch(Exception e){
            exceptions.add(e);
        }
        //2
        try{
            FileInputStream fis = null;
            fis.close();
        }catch(Exception e){
            exceptions.add(e);
        }
        //3
        try{
            throw new Exception();
        }catch(Exception e){
            exceptions.add(e);
        }
        //4
        try{
            throw new ClassCastException();
        }catch(Exception e){
            exceptions.add(e);
        }
        //5
        try{
            throw null;
        }catch(Exception e){
            exceptions.add(e);
        }
        //6
        try{
            int[] arr = new int[10];
            System.out.println(arr[-11]);
        }catch(Exception e){
            exceptions.add(e);
        }
        //7
        try{
            class C{
                public void f(NullPointerException e) throws Throwable{
                    try {
                        throw e;
                    }catch(NullPointerException npe){
                        this.f(npe);
                    }
                }
            }
            new C().f(null);
        }catch(Throwable e){
            try {
                exceptions.add((Exception) e);
            }catch(Exception ex){
                exceptions.add(ex);
            }
        }
        //8
        try{
            throw new IllegalArgumentException("НЕВЕРНЫЕ АРГУМЕНТЫ!");
        }catch(Exception e){
            exceptions.add(e);
        }
        //9
        try{
            throw new Exception();
        }catch(Exception e){
            exceptions.add(e);
        }
    }
}
