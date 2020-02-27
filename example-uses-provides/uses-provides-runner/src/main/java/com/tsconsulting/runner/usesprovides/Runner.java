package com.tsconsulting.runner.usesprovides;

import com.tsconsulting.module.usesprovides.Welcomer;

import java.util.ServiceLoader;

public class Runner {

    public static void main(String[] args) {
        ServiceLoader<Welcomer> sl = ServiceLoader.load(Welcomer.class);
        sl.forEach(Welcomer::sayHello);
    }

}
