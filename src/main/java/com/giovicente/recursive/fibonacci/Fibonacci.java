package com.giovicente.recursive.fibonacci;

public class Fibonacci implements FibonacciBase {
    @Override
    public long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        // f(n) = f(n - 1) + f(n - 2) ∴ O(2^n)
        return (fibonacci(n - 1) + fibonacci(n - 2));
    }
}
