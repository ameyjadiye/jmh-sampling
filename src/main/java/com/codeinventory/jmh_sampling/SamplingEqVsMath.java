package com.codeinventory.jmh_sampling;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Mode;

/**
 * This class checks the avrage running time for sampling if equals method vs math for checking empty strings.
 * @author Amey
 *
 */
public class SamplingEqVsMath {

    @Benchmark
    //@BenchmarkMode(Mode.AverageTime)
    @Fork(value = 1, warmups = 1)
    public void eqTest() {

        String left = "";
        String right = "";
        if ("".equals(left) || "".equals(right)) {

        }

    }

    @Benchmark
    //@BenchmarkMode(Mode.AverageTime)
    @Fork(value = 1, warmups = 1)
    public void mathTest() {

        String left = "";
        String right = "";

        if (Math.min(left.length(), right.length()) < 2) {
            
        }
    }
    
    @Benchmark
    //@BenchmarkMode(Mode.AverageTime)
    @Fork(value = 1, warmups = 1)
    public void lengthTest() {

        String left = "";
        String right = "";

        if (left.length() == 0 || right.length() == 0) {
            
        }
    }
}
