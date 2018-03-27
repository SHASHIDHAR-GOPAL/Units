package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class LengthTest {
    @Test
    public void equalWhenTwelveInchAndTwelveInch() {
        assertEquals(new Length(12, Unit.INCH),new Length(12, Unit.INCH));
    }
    @Test
    public void equalWhenTwelveInchAndOneFeet() {
        assertEquals(new Length(12, Unit.INCH),new Length(1, Unit.FEET));
    }

    @Test
    public void equalWhenOneYardAndOneHundredAndNintyCentimeters() {
        assertEquals(new Length(1, Unit.YARD),new Length(90, Unit.CENTIMETER));
    }


}