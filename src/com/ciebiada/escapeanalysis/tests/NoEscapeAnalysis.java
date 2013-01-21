package com.ciebiada.escapeanalysis.tests;

import com.ciebiada.StopWatch;
import com.ciebiada.escapeanalysis.Vector3d;

public class NoEscapeAnalysis {

    private static final int PROBLEM_SIZE = 1000000000;

    public Vector3d vector3dField;

    public NoEscapeAnalysis() {
        StopWatch stopWatch = new StopWatch();

        float result = 0;
        for (int i = 0; i < PROBLEM_SIZE; i++) {
            vector3dField = new Vector3d(i, i, i);
            result += vector3dField.add(vector3dField).dot(vector3dField);
        }

        System.out.println(result + " " + stopWatch);
    }
}
