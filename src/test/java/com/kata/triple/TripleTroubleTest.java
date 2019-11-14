package com.kata.triple;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class TripleTroubleTest {
    private TripleTrouble testObj = new TripleTrouble();

    @Test
    public void shouldGetOneFromTripleTrouble() {
        // given
        long givenNumber1 = 11122334455L;
        long givenNumber2 = 1122233334444L;
        int expectedNumber = 1;

        // when
        int result = testObj.runTripleDouble(givenNumber1, givenNumber2);

        // then
        Assertions.assertThat(result).isEqualTo(expectedNumber);
    }

    @Test
    public void shouldGetZeroFromTripleTrouble() {
        // given
        long givenNumber1 = 11122334455L;
        long givenNumber2 = 11122233334444L;
        int expectedNumber = 0;

        // when
        int result = testObj.runTripleDouble(givenNumber1, givenNumber2);

        // then
        Assertions.assertThat(result).isEqualTo(expectedNumber);
    }
}
