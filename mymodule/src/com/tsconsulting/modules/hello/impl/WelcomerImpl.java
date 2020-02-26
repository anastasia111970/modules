package com.tsconsulting.modules.hello.impl;

import com.tsconsulting.modules.hello.Welcomer;

public class WelcomerImpl implements Welcomer {

    @Override
    public void sayHello() {
        System.out.println("Hello. We use modules");
    }

}
