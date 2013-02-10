package com.ciebiada.multiplicationvsdivision.benchmarks;

import com.ciebiada.StopWatch;

import java.util.Random;

public class MorePracticalBenchmark {

    private class Division {
        private Division() {
            StopWatch stopWatch = new StopWatch();

            float a = 3.1415f;
            float b = 1.618f;

            float sum = 0;
            for (int i = 0; i < 10000; i++) {
                for (int j = 0; j < 20000; j++) {
                    float r = (1.0f / j);
                    sum += a / r;
                    sum += b / r;
                }
            }

            System.out.println(sum + " - " + stopWatch);
        }
    }

    private class Multiplication {

        private Multiplication() {
            StopWatch stopWatch = new StopWatch();

            float a = 3.1415f;
            float b = 1.618f;

            float sum = 0;
            for (int i = 0; i < 10000; i++) {
                for (int j = 0; j < 20000; j++) {
                    float r = (1.0f / j);
                    float tmp = 1 / r;
                    sum += a * tmp;
                    sum += b * tmp;
                }
            }

            System.out.println(sum + " - " + stopWatch);
        }

    }

    public MorePracticalBenchmark() {
        new Division();
        new Multiplication();
    }
}
