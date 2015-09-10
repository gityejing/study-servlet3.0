package com.foo.spi;

import java.util.ServiceLoader;

/**
 * @author bjliuyong
 * @version 1.0
 * @created date 15-9-10
 */
public class SpiDemo {

    public static void main(String args[]){

        ServiceLoader<Gun> serviceLoader =   ServiceLoader.load(Gun.class);

        Gun gun = serviceLoader.iterator().next();


        gun.fire();

    }

}
