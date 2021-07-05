package edu.gateway.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BalanceCheckControllerTest {

    @Test
    public void testgetBalance(){

        BalanceCheckController balanceCheckController =
                    new BalanceCheckController();

        String res = balanceCheckController.getBalance();
        assertEquals("Your Balance is Rs.1000 Only", res);
    }
}
