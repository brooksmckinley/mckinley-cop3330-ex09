/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brooks McKinley
 */

package com.brooksmckinley;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    public void testPaintReport() {
        String expected = "You will need to purchase 2 gallons of paint to cover 360 square feet.";
        String actual = App.generatePaintReport(6, 60);
        Assertions.assertEquals(expected, actual);
    }
}