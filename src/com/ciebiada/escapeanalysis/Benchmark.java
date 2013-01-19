package com.ciebiada.escapeanalysis;

import com.ciebiada.escapeanalysis.tests.EscapeAnalysis;
import com.ciebiada.escapeanalysis.tests.Inlined;
import com.ciebiada.escapeanalysis.tests.NoEscapeAnalysis;

public class Benchmark {

    public static void main(String[] args) {
        new EscapeAnalysis();
        new Inlined();
        new NoEscapeAnalysis();
    }
}
