package com.codeinventory.jmh_sampling;

import java.io.IOException;

import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

/**
 * 
 *
 */
public class App 
{
    public static void main( String[] args ) throws RunnerException, IOException
    {

        Options opt = new OptionsBuilder()
                .include(SamplingEqVsMath.class.getSimpleName())
                 .build();

       new Runner(opt).run();
    }
}
