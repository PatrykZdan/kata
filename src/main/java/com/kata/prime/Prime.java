package com.kata.prime;

import java.math.BigInteger;

public class Prime {
    public boolean isPrime(int num) {
        return num > 1 && BigInteger.valueOf(num).isProbablePrime(20);
    }
}
