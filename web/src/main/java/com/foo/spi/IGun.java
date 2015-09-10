package com.foo.spi;

/**
 * @author bjliuyong
 * @version 1.0
 * @created date 15-9-10
 */
public class IGun implements Gun {

    @Override
    public void fire() {
        System.out.println("IGun !@#@#&$((!)#");
    }
}
