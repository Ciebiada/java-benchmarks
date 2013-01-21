package com.ciebiada.memoryalignment.tests;

public class TwoFloatsAlignmentTest {

    class Foo {
        float bar1, bar2;
    }

    public TwoFloatsAlignmentTest() {
        System.gc();
        Runtime runtime = Runtime.getRuntime();
        Foo[] foos = new Foo[1000000];
        for (int i = 0; i < foos.length; i++) {
            foos[i] = new Foo();
        }
        System.out.println((runtime.totalMemory() - runtime.freeMemory()) / 1024 / 1024 + " mb");
    }
}
