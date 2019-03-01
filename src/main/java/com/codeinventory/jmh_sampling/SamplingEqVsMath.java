package com.codeinventory.jmh_sampling;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;

public class SamplingEqVsMath {

    @Benchmark
    //@BenchmarkMode(Mode.AverageTime)
    public void ifTest() {

        String left = "";
        String right = "";
        if ("".equals(left) || "".equals(right)) {

        }

    }

    @Benchmark
    //@BenchmarkMode(Mode.AverageTime)
    public void mathTest() {

        String left = "";
        String right = "";

        if (Math.min(left.length(), right.length()) < 2) {
            
        }
    }
}
