package com.kata.prime;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;


public class PrimeTest {

    Prime testObj = new Prime();

    @Test
    public void shouldBePrime() {
        // given
        int givenNumber = 5;

        // when
        boolean result = testObj.isPrime(givenNumber);

        // then
        assertThat(result).isTrue();
    }

    @Test
    public void shouldNotBePrime() {
        // given
        int givenNumber = 6;

        // when
        boolean result = testObj.isPrime(givenNumber);

        // then
        assertThat(result).isFalse();
    }

    @Test
    public void shouldNotBePrimeForNegativeNumber() {
        // given
        int givenNumber = -6;

        // when
        boolean result = testObj.isPrime(givenNumber);

        // then
        assertThat(result).isFalse();
    }

    @Test
    public void shouldNotBePrimeForZero() {
        // given
        int givenNumber = 0;

        // when
        boolean result = testObj.isPrime(givenNumber);

        // then
        assertThat(result).isFalse();
    }
}
