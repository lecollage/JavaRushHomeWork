package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        java.util.ArrayList<Human> ch= new java.util.ArrayList<Human>();
        Human sdf = new Human("sdf",true,3);
        Human sdd = new Human("sdd",true,3);
        Human sdd1 = new Human("sdd1",true,3);

        ch.add(sdf);
        ch.add(sdd);
        ch.add(sdd1);

        //папа мама и их список для добавления дедушкам - бабушкам
        Human f = new Human("pap",true,3,ch);
        Human m = new Human("mam",false,3,ch);
        java.util.ArrayList<Human> papmam= new java.util.ArrayList<Human>();
        papmam.add(f);papmam.add(m);
        //дедушки бабушки
        Human gf1 = new Human("ded1",true,3,papmam);
        Human gf2 = new Human("ded2",true,3,papmam);
        Human gm1 = new Human("bab1",false,3,papmam);
        Human gm2 = new Human("bab2",false,3,papmam);
        System.out.println(gf1);
        System.out.println(gf2);
        System.out.println(gm1);
        System.out.println(gm2);
        System.out.println(f);
        System.out.println(m);
        System.out.println(sdf);
        System.out.println(sdd);
        System.out.println(sdd1);



    }

    public static class Human
    {
        //напишите тут ваш код
        String  name ;
        boolean sex;
        int age;
        java.util.ArrayList<Human> children = new java.util.ArrayList<Human>();

        Human(String name,boolean sex,int age){
            this.name=name;
            this.sex=sex;
            this.age=age;
        }
        Human(String name,boolean sex,int age,java.util.ArrayList<Human> children){
            this.name=name;
            this.sex=sex;
            this.age=age;
            this.children = children;
        }
        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
