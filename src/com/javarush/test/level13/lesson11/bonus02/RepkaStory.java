package com.javarush.test.level13.lesson11.bonus02;

import java.util.List;

public class RepkaStory
{
    static void tell(List<Person> items) {

//        List<Person> plot = new ArrayList<Person>();
//        plot.add(new Person("Репка", "Репку"));
//        plot.add(new Person("Дедка", "Дедку"));
//        plot.add(new Person("Бабка", "Бабку"));
//        plot.add(new Person("Внучка", "Внучку"));

        Person first;
        Person second;
        for (int i = items.size() - 1; i > 0; i--) {
            first = items.get(i);
            second = items.get(i - 1);
            first.pull(second);
        }
    }
}
