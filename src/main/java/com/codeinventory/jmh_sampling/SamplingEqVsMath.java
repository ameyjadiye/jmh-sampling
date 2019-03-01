package com.codeinventory.jmh_sampling;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;

/**
 * This class checks the avrage running time for sampling if equals method vs math for checking empty strings.
 * @author Amey
 *
 */
public class SamplingEqVsMath {

    @Benchmark
    //@BenchmarkMode(Mode.AverageTime)
    public void eqTest() {

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
