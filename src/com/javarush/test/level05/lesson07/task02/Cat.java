package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    //напишите тут ваш код
    String n;
    int h = 0;
    int y = 0;
    String с;
    String a;
    public void initialize(String n){
        this.n = n;
    }
    public void initialize(String n, int h,int y){
        this.n = n;
        this.h= h;
        this.y= y;
    }
    public void initialize(String n, int y){
        this.n = n;
        this.h= 10;
        this.y= y;
    }
    public void initialize(int h , String с){
        this.h= h;
        this.с= с;
    }
    public void initialize(int h , String с, String a){
        this.h= h;
        this.с= с;
        this.a= a;
    }


}
