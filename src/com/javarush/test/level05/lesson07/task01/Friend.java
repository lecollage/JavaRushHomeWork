package com.javarush.test.level05.lesson07.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    //напишите тут ваш код
    String n;
    int y = 0;
    String с;
    public void initialize(String n, int y,String с){
        this.n = n;
        this.с= с;
        this.y= y;
    }
    public void initialize(String n, int y){
        this.n = n;
        this.y= y;
    }
    public void initialize(String n){
        this.n = n;
    }
}
