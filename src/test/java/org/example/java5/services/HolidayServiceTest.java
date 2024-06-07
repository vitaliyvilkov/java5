package org.example.java5.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HolidayServiceTest {
    @Test
    public void testChanceToRest1(){
        HolidayService service = new HolidayService();
        int expected = 3;
        int actual = service.calculate(10000, 3000, 20000);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testChanceToRest2(){
        HolidayService service = new HolidayService();
        int expected = 2;
        int actual = service.calculate(100000, 60000, 150000);
        Assertions.assertEquals(expected,actual);
    }
}
