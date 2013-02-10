package com.ciebiada.multiplicationvsdivision.benchmarks;

import com.ciebiada.StopWatch;

public class LiteralsBenchmarkOne {

    private class Multiplication {
        private Multiplication() {
            StopWatch stopWatch = new StopWatch();

            float a = 3.1415f;
            for (int i = 0; i < 100000; i++) {
                for (int j = 0; j < 20000; j++) {
                    a *= 2f;

                    a *= 0.5f;
                }
            }

            System.out.println(a + " - " + stopWatch);
        }
    }

    private class Division {
        private Division() {
            StopWatch stopWatch = new StopWatch();

            float a = 3.1415f;
            for (int i = 0; i < 100000; i++) {
                for (int j = 0; j < 20000; j++) {
                    a *= 2f;

                    a /= 2f;
                }
            }

            System.out.println(a + " - " + stopWatch);
        }
    }

    public LiteralsBenchmarkOne() {
        new Multiplication();
        new Division();
    }
}
