package com.ciebiada.escapeanalysis.tests;

import com.ciebiada.escapeanalysis.StopWatch;

public class Inlined {

    private static final int PROBLEM_SIZE = 1000000000;

    public Inlined() {
        StopWatch stopWatch = new StopWatch();

        float result = 0;
        for (int i = 0; i < PROBLEM_SIZE; i++) {
            float v1x = i;
            float v1y = i;
            float v1z = i;

            float vx = v1x + v1x;
            float vy = v1y + v1y;
            float vz = v1z + v1z;

            result += vx * v1x + vy * v1y + vz * v1z;
        }

        System.out.println(result + " " + stopWatch);
    }
}
