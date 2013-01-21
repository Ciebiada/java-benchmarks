package com.ciebiada.memoryalignment.tests;

public class BooleanAlignmentTest {

    class Foo {
        boolean bar;
    }

    public BooleanAlignmentTest() {
        System.gc();
        Runtime runtime = Runtime.getRuntime();
        Foo[] foos = new Foo[1000000];
        for (int i = 0; i < foos.length; i++) {
            foos[i] = new Foo();
        }
        System.out.println((runtime.totalMemory() - runtime.freeMemory()) / 1024 / 1024 + " mb");
    }
}
