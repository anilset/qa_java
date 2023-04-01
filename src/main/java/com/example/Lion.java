package com.example;

import java.util.List;

public class Lion extends Feline {

    boolean hasMane;
    Predator predator;

    public Lion(String sex, Feline feline) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        } this.predator = feline;
    }

    public boolean doesHaveMane() {
        return hasMane;
    }
}
