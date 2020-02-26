package com.tsconsulting.modules.runner;

import com.tsconsulting.modules.hello.Welcomer;

import java.util.ServiceLoader;

public class Runner {

    public static void main(String[] args) {
        ServiceLoader<Welcomer> sl = ServiceLoader.load(Welcomer.class);
        sl.forEach(Welcomer::sayHello);
    }

}
