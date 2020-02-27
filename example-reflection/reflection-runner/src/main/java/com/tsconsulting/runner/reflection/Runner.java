package com.tsconsulting.runner.reflection;

import com.tsconsulting.module.reflection.Cat;

import java.lang.reflect.Field;

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
    }

}
