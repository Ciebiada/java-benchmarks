package com.ciebiada.forkjoin;

import com.ciebiada.forkjoin.tests.NativeSort;
import com.ciebiada.forkjoin.tests.OurQuickSort;
import com.ciebiada.forkjoin.tests.OurQuickSortParallelized;

public class Benchmark {

    private static final int PROBLEM_SIZE = 20000000;

    public static void main(String[] args) {
        new NativeSort(PROBLEM_SIZE);
        new OurQuickSort(PROBLEM_SIZE);
        new OurQuickSortParallelized(PROBLEM_SIZE);
    }
}
