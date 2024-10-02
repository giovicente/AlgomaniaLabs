package com.giovicente.recursive.fibonacci;

public class OptimizedFibonacci implements FibonacciBase {

    @Override
    public long fibonacci(int n) {
        long[] fibonacciCache = new long[n + 1];

        if (n <= 1) {
            return n;
        }

        if (fibonacciCache[n] != 0) {
            return fibonacciCache[n];
        }

        long nthFibonacciNumber = (fibonacci(n - 1) + fibonacci(n - 2));
        fibonacciCache[n] = nthFibonacciNumber;

        return nthFibonacciNumber;
    }
}

