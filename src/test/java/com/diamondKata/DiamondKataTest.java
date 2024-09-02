package com.diamondKata;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiamondKataTest {

    @Test
    public void testDiamondA() {
        String expected = "A\n";
        assertEquals(expected, RecursiveDiamondKata.printDiamond('A'));
//        assertEquals(expected, RecursiveDiamondKata.printDiamond('a'));
    }

    @Test
    public void testDiamondB() {
        String expected =
                " A\n" +
                        "B B\n" +
                        " A\n";
        assertEquals(expected, RecursiveDiamondKata.printDiamond('B'));
    }
}