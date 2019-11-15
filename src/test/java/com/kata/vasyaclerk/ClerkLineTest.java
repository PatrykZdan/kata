package com.kata.vasyaclerk;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class ClerkLineTest {
    private ClerkLine testObj = new ClerkLine();

    @Test
    public void shouldSellTicket() {
        // given
        int[] line = {25,25,50,100,25,50};
        String expectedString = "YES";

        // when
        String result = testObj.tickets(line);

        // then
        assertThat(result).isEqualTo(expectedString);
    }

    @Test
    public void shouldNotSellTicket() {
        // given
        int[] line = {25,25,50,100,50};
        String expectedString = "NO";

        // when
        String result = testObj.tickets(line);

        // then
        assertThat(result).isEqualTo(expectedString);
    }
}
