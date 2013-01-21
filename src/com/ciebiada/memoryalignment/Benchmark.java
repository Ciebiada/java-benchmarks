package com.ciebiada.memoryalignment;

import com.ciebiada.memoryalignment.tests.BooleanAlignmentTest;
import com.ciebiada.memoryalignment.tests.DoubleAlignmentTest;
import com.ciebiada.memoryalignment.tests.FloatAlignmentTest;
import com.ciebiada.memoryalignment.tests.TwoFloatsAlignmentTest;

public class Benchmark {

    public static void main(String[] args) {
        new FloatAlignmentTest();
        new DoubleAlignmentTest();
        new TwoFloatsAlignmentTest();
        new BooleanAlignmentTest();
    }
}
