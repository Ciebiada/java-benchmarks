package com.ciebiada.escapeanalysis.tests;

import com.ciebiada.StopWatch;
import com.ciebiada.escapeanalysis.Vector3d;

public class EscapeAnalysis {

    private static final int PROBLEM_SIZE = 1000000000;

    public EscapeAnalysis() {
        StopWatch stopWatch = new StopWatch();

        float result = 0;
        for (int i = 0; i < PROBLEM_SIZE; i++) {
            Vector3d v1 = new Vector3d(i, i, i);
            result += v1.add(v1).dot(v1);
        }

        System.out.println(result + " " + stopWatch);
    }
}
