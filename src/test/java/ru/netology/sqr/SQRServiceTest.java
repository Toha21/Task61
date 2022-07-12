package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void sqrNumbersTheRangeTest() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.calculate(200, 300);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void sqrNoNumbersTheRangeTest() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.calculate(200, 220);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void sqrNumbersTheZeroRangeTest() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.calculate(200, 200);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void sqrNumbersTheRangeTheNumberZeroTest() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.calculate(0, 0);

        Assertions.assertEquals(expected, actual);

    }
}
