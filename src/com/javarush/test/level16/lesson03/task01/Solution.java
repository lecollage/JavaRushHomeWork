package com.javarush.test.level16.lesson03.task01;

/* My first thread
Создать public static class TestThread - нить с помощью интерфейса Runnable.
TestThread должен выводить в консоль "My first thread".
*/
public class Solution {
    public static void main(String[] args) {

        for(int i = 10; i>0; i--){
            TestThread task = new TestThread(i);
            new Thread(task).start();
        }
    }

    static class TestThread implements Runnable{
        private int i = 0;
        public TestThread(int i){
            this.i = i;
        }
        @Override
        public void run() {
            System.out.println("My first thread> "+i);
        }
    }
}
