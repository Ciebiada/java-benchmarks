package com.ciebiada.methodinlining;

import com.ciebiada.StopWatch;
import com.ciebiada.methodinlining.tests.Benchmark;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.gc();

        int problemSize = 10000000;

        StopWatch stopWatch = new StopWatch();

        float result = 0;
        for (int i = 0; i < 300; i++)
            result += Benchmark.method(problemSize);
//            result += Benchmark.inlined(problemSize);

        System.out.println(result + " " + stopWatch);
    }
}
