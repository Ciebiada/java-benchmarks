package com.ciebiada.forkjoin;

import com.ciebiada.forkjoin.tests.NativeSort;
import com.ciebiada.forkjoin.tests.OurQuickSort;
import com.ciebiada.forkjoin.tests.OurQuickSortParallelized;

public class Benchmark {

    public static void main(String[] args) {
        new NativeSort(20000000);
        new OurQuickSort(20000000);
        new OurQuickSortParallelized(20000000);
    }
}
