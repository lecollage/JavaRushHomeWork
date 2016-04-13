package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Zerg zerg1  = new Zerg();
        Zerg zerg2  = new Zerg();
        Zerg zerg3  = new Zerg();
        Zerg zerg4  = new Zerg();
        Zerg zerg5  = new Zerg();
        Zerg zerg6  = new Zerg();
        Zerg zerg7  = new Zerg();
        Zerg zerg8  = new Zerg();
        Zerg zerg9  = new Zerg();
        Zerg zerg10 = new Zerg();

        zerg1.name  = "A";
        zerg1.name  = "B";
        zerg2.name  = "C";
        zerg3.name  = "D";
        zerg4.name  = "E";
        zerg5.name  = "F";
        zerg6.name  = "G";
        zerg7.name  = "H";
        zerg8.name  = "R";
        zerg9.name  = "M";
        zerg10.name = "N";

        Protos protos1 = new Protos();
        Protos protos2 = new Protos();
        Protos protos3 = new Protos();
        Protos protos4 = new Protos();
        Protos protos5 = new Protos();

        protos1.name  = "B";
        protos2.name  = "C";
        protos3.name  = "D";
        protos4.name  = "E";
        protos5.name  = "F";

        Terran terran1  = new Terran();
        Terran terran2  = new Terran();
        Terran terran3  = new Terran();
        Terran terran4  = new Terran();
        Terran terran5  = new Terran();
        Terran terran6  = new Terran();
        Terran terran7  = new Terran();
        Terran terran8  = new Terran();
        Terran terran9  = new Terran();
        Terran terran10 = new Terran();
        Terran terran11 = new Terran();
        Terran terran12 = new Terran();

        terran1.name  = "B";
        terran2.name  = "C";
        terran3.name  = "D";
        terran4.name  = "E";
        terran5.name  = "F";
        terran6.name  = "G";
        terran7.name  = "H";
        terran8.name  = "R";
        terran9.name  = "M";
        terran10.name = "N";
        terran11.name = "O";
        terran12.name = "P";

    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}