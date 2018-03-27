package com.company;

import java.util.Objects;

//Understands length conversions
public class Length {

    private double magnitude;
    private Unit unit;

    public Length(double magnitude, Unit unit) {
        this.magnitude = magnitude;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        return this.compare((Length) that);
    }

    private boolean compare(Length that) {
        return this.magnitude == that.unit.convertToOtherUnit(this.unit, that.magnitude);
    }

    @Override
    public String toString() {
        return "Length{" +
                "magnitude=" + magnitude +
                ", unit=" + unit +
                '}';
    }

    @Override
    public int hashCode() {

        return Objects.hash(unit, magnitude);
    }

}
