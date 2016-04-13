package com.javarush.test.level08.lesson11.home02;

import java.util.HashSet;
import java.util.Set;

/* Множество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog.
2. Реализовать метод createCats, котороый должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, котороый должен возвращать множество с 3 собаками.
4. Реализовать метод join, котороый должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, котороый должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, котороый должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        //System.out.println("1");

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats()
    {
        HashSet<Cat> result = new HashSet<Cat>();

        //напишите тут ваш код
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());

        return result;
    }

    public static Set<Dog> createDogs()
    {
        //напишите тут ваш код
        HashSet<Dog> dogs = new HashSet<Dog>();

        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());

        return dogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs)
    {
        //напишите тут ваш код
        HashSet<Object> pets = new HashSet<Object>();
        pets.addAll(cats);
        pets.addAll(dogs);


        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats)
    {
        //напишите тут ваш код

        java.util.Iterator<Cat> it1 = cats.iterator();
        while(it1.hasNext())
        {
            Cat cat = it1.next();
            java.util.Iterator<Object> it = pets.iterator();
            while (it.hasNext())
                if (it.next().equals(cat))
                    it.remove();
        }
    }

    public static void printPets(Set<Object> pets)
    {
        //напишите тут ваш код
        for(Object o: pets)
            System.out.println(o.toString());
    }

    //напишите тут ваш код
    public static class Cat{}
    public static class Dog{}
}