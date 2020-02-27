package com.tsconsulting.modules.runner;

import com.tsconsulting.modules.hello.Cat;
import com.tsconsulting.modules.hello.Welcomer;

import java.lang.reflect.Field;
import java.util.ServiceLoader;

public class Runner {

    public static void main(String[] args) {

        Cat cat = new Cat("Dimasik");
        System.out.println(cat.toString());
        Class<Cat> catClass = Cat.class;
        try {
            Field catNameField = catClass.getDeclaredField("name");
            catNameField.setAccessible(true);
            catNameField.set(cat, "Jenya");
            System.out.println(cat.toString());
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

        ServiceLoader<Welcomer> sl = ServiceLoader.load(Welcomer.class);
        sl.forEach(Welcomer::sayHello);
    }

}
