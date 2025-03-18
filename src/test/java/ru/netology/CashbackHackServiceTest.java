package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void underBoundary() {
        CashbackHackService service=new CashbackHackService();
        int amount=900;
        int actual=service.remain(amount);
        assertEquals(actual, 100);
    }
    @Test
    public void aboveBoundary() {
        CashbackHackService service=new CashbackHackService();
        int amount=1100;
        int actual=service.remain(amount);
        assertEquals(actual, 900);
    }
    @Test
    public void equalBoundary() {
        CashbackHackService service=new CashbackHackService();
        int amount=1000;
        int actual=service.remain(amount);
        assertEquals(actual, 0);
    }
}