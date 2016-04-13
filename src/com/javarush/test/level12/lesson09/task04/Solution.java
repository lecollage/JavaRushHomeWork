package com.javarush.test.level12.lesson09.task04;

/* Fly, Run, Swim для классов Human, Duck, Penguin, Airplane
Есть public интерфейсы Fly(летать), Run(бежать/ездить), Swim(плавать).
Добавь эти интерфейсы классам Human(человек), Duck(утка), Penguin(пингвин), Airplane(самолет).
*/

public class Solution
{
    public static enum Group {
        Procurement,
        Batch,
        Contract,
        Claim,
        ;

        public int getGroupId() {
            switch (this) {
                case Procurement:
                    return 1;
                case Batch:
                    return 2;
                case Contract:
                    return 3;
                case Claim:
                    return 4;
                default:
                    return -1;
            }
        }
    }

    public static enum Type {
        PROCUREMENT,
        BATCH,
        CONTRACT,
        SUBCONTR,
        TERMINATION,
        CANCELLATION,
        CLAIM,
        CANCEL,
        LAWSUIT,
        ;

        public Group getGroup() {
            switch (this) {
                case PROCUREMENT:
                    return Group.Procurement;
                case BATCH:
                    return Group.Batch;
                case CONTRACT:
                    return Group.Contract;
                case SUBCONTR:
                    return Group.Contract;
                case TERMINATION:
                    return Group.Contract;
                case CANCELLATION:
                    return Group.Contract;
                case CLAIM:
                    return Group.Claim;
                case CANCEL:
                    return Group.Claim;
                case LAWSUIT:
                    return Group.Claim;
                default:
                    return null;
            }

        }

    }

    public static void main(String[] args)
    {
        String entityTypeSUBCONTR = "SUBCONTR";
        String entityTypeTERMINATION = "TERMINATION";
        String entityTypeCANCELLATION = "CANCELLATION";

        String entityType = entityTypeSUBCONTR;

        switch(Solution.Type.valueOf(entityType)){
            case TERMINATION:
            case CANCELLATION: {
                System.out.println("[TERMINATION|CANCELLATION]");
                break;
            }
            case SUBCONTR: {
                System.out.println("SUBCONTR");
                break;
            }
        }

    }

    public interface Fly
    {
        public void fly();
    }

    public interface Run
    {
        public void run();
    }

    public interface Swim
    {
        public void swim();
    }


    public class Human implements Run, Swim
    {



        @Override
        public void run()
        {

        }

        @Override
        public void swim()
        {

        }
    }

    public class Duck implements Fly, Run, Swim
    {

        @Override
        public void fly()
        {

        }

        @Override
        public void run()
        {

        }

        @Override
        public void swim()
        {

        }
    }

    public class Penguin implements Run, Swim
    {

        @Override
        public void run()
        {

        }

        @Override
        public void swim()
        {

        }
    }

    public class Airplane implements Fly, Run
    {

        @Override
        public void fly()
        {

        }

        @Override
        public void run()
        {

        }
    }
}
