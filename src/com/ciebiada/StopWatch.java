package com.ciebiada;

public class StopWatch {

    private long timestamp;

    public StopWatch() {
        reset();
    }

    public void reset() {
        timestamp = System.currentTimeMillis();
    }

    @Override
    public String toString() {
        return ((System.currentTimeMillis() - timestamp) / 1000.0f) + "s";
    }
}
