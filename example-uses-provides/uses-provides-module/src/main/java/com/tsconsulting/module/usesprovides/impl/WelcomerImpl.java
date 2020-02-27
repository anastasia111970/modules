package com.tsconsulting.module.usesprovides.impl;

import com.tsconsulting.module.usesprovides.Welcomer;

public class WelcomerImpl implements Welcomer {

    @Override
    public void sayHello() {
        System.out.println("Hello. We use modules");
    }

}
