package com.tsconsulting.modules.runner;

import com.tsconsulting.modules.hello.Welcomer;
import com.tsconsulting.modules.hello.WelcomerImpl;

public class Runner {

    public static void main(String[] args) {
        Welcomer welcomer = new WelcomerImpl();
        welcomer.sayHello();
    }

}
