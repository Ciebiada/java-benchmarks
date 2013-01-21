package com.ciebiada.memoryalignment.tests;

public class DoubleAlignmentTest {

    class Foo {
        double bar;
    }

    public DoubleAlignmentTest() {
        System.gc();
        Runtime runtime = Runtime.getRuntime();
        Foo[] foos = new Foo[1000000];
        for (int i = 0; i < foos.length; i++) {
            foos[i] = new Foo();
        }
        System.out.println((runtime.totalMemory() - runtime.freeMemory()) / 1024 / 1024 + " mb");
    }
}
