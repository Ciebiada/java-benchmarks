package com.ciebiada.methodinlining.tests;

import com.ciebiada.methodinlining.Vector3d;

public class Benchmark {

    public static float method(int problemSize) {
        Vector3d vec = new Vector3d(0, 0, 0);
        Vector3d vec2 = new Vector3d(1.618f, 1.618f, 1.618f);
        float result = 0;
        for (int i = 0; i < problemSize; i++) {
            vec.setX(i);
            vec.setY(i);
            vec.setZ(i);
            result += vec.dot(vec2);
        }

        return result;
    }

    public static float inlined(int problemSize) {
        Vector3d vec = new Vector3d(0, 0, 0);
        Vector3d vec2 = new Vector3d(1.618f, 1.618f, 1.618f);
        float result = 0;
        for (int i = 0; i < problemSize; i++) {
            vec.x = i;
            vec.y = i;
            vec.z = i;
            result += (vec.x * vec2.x + vec.y * vec2.y + vec.z * vec2.z);
        }

        return result;
    }
}
