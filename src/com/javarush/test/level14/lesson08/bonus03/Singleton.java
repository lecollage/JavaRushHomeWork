package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by ekalashnikov on 03.04.2016.
 */
public class Singleton {

    private static Singleton singleton = null;

    //private Singleton singleton = null;

    public static Singleton getInstance(){
        if(singleton == null)
            singleton = new Singleton();

        return singleton;
    }

    private Singleton(){

    }
}
