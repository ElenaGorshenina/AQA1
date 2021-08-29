package ru.netology.service;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService cashbackService = new CashbackHackService();

    @Test
    public void shouldReturnCashbackIfAmountLess1000() {
        int amount = 950;
        int actual = cashbackService.remain(amount);
        int expected = 50;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnCashbackIfAmount1000() {
        int amount = 1000;
        int actual = cashbackService.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnCashbackIfMoreAmount1000() {
        int amount = 1400;
        int actual = cashbackService.remain(amount);
        int expected = 600;
        assertEquals(actual, expected);
    }
}
