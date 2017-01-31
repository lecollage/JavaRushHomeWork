package com.javarush.test.level15.lesson02.task03;


public class Solution {
    public static void main(String[] args) {
        new Solution.LuxuriousCar().printlnDesire();
        new Solution.CheapCar().printlnDesire();
        new Solution.Ferrari().printlnDesire();
        new Solution.Lanos().printlnDesire();
    }

    public static class Ferrari extends LuxuriousCar
    {
        public void printlnDesire() {
            //add your code here
            System.out.println(Constants.WANT_STRING + Constants.FERRARY_NAME);
        }
    }

    public static class Lanos extends CheapCar
    {
        public void printlnDesire() {
            //add your code here
            System.out.println(Constants.WANT_STRING + Constants.LANOS_NAME);
        }
    }

    public static class Constants {
        public static String WANT_STRING = "Я хочу ездить на ";
        public static String LUXURIOUS_CAR = "роскошной машине";
        public static String CHEAP_CAR = "дешевой машине";
        public static String FERRARY_NAME = "Феррари";
        public static String LANOS_NAME = "Ланосе";
    }

    public static class LuxuriousCar
    {
        protected void printlnDesire() {
            System.out.println(Constants.WANT_STRING + Constants.LUXURIOUS_CAR);
        }
    }

    public static class CheapCar
    {
        void printlnDesire() {
            System.out.println(Constants.WANT_STRING + Constants.CHEAP_CAR);
        }
    }
}