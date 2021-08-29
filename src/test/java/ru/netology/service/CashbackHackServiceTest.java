package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService cashbackService = new CashbackHackService();

    @Test
    public void shouldReturnCashbackIfAmountLess1000() {
        int amount = 850;
        int actual = cashbackService.remain(amount);
        int expected = 150;
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
        int amount = 1010;
        int actual = cashbackService.remain(amount);
        int expected = 990;
        assertEquals(actual, expected);
    }


}