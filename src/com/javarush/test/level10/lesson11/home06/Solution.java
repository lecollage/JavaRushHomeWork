package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {
    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        int i;
        short sh;
        byte b;
        long l;
        char ch;
        boolean bool;

        //1
        public Human(int p){
            this.i = p;
        }

        //2
        public Human(short p){
            this.sh = p;
        }

        //3
        public Human(byte p){
            this.b = p;
        }

        //4
        public Human(long p){
            this.l = p;
        }

        //5
        public Human(char p){
            this.ch = p;
        }

        //6
        public Human(boolean p){
            this.bool = p;
        }

        //7
        public Human(int p1, boolean p){
            this.i = p1;
            this.bool = p;
        }

        //8
        public Human(short p1, boolean p){
            this.i = p1;
            this.bool = p;
        }

        //9
        public Human(char p1, boolean p){
            this.ch = p1;
            this.bool = p;
        }

        //10
        public Human(long p1, boolean p){
            this.l = p1;
            this.bool = p;
        }
    }
}
