package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    //напишите тут ваш код
    String n;
    int h = 0;
    String с;
    public void initialize(String n, int h, String с){
        this.n = n;
        this.h = h;
        this.с = с;
    }
    public void initialize(String n, int h){
        this.n = n;
        this.h = h;
    }
    public void initialize(String n){
        this.n = n;
    }

}
