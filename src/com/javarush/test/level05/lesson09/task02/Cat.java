package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача конструктора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    //напишите тут ваш код
    String n;
    int h = 0;
    int y = 0;
    String с;
    String a;
    public Cat(String n){
        this.n = n;
    }
    public Cat(String n, int h,int y){
        this.n = n;
        this.h= h;
        this.y= y;
    }
    public Cat(String n, int y){
        this.n = n;
        this.h= 10;
        this.y= y;
    }
    public Cat(int h , String с){
        this.h= h;
        this.с= с;
    }
    public Cat(int h , String с, String a){
        this.h= h;
        this.с= с;
        this.a= a;
    }


}
