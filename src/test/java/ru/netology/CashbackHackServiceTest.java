package ru.netology;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void underBoundary() {
        CashbackHackService service=new CashbackHackService();
        int amount=900;
        int actual=service.remain(amount);
        assertEquals(100, actual);
    }
    @Test
    public void aboveBoundary() {
        CashbackHackService service=new CashbackHackService();
        int amount=1100;
        int actual=service.remain(amount);
        assertEquals(900, actual);
    }
    @Test
    public void equalBoundary() {
        CashbackHackService service=new CashbackHackService();
        int amount=1000;
        int actual=service.remain(amount);
        assertEquals(0, actual);
    }
}