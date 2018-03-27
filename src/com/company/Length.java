package com.company;

import java.util.Objects;

//Understands length conversions
public class Length {

    private long magnitude;
    private Unit unit;

    private Length(long magnitude, Unit unit) {
        this.magnitude = magnitude;
        this.unit = unit;
    }

    static Length feet(long value) {
        return new Length(value, Unit.FEET);
    }

    static Length inch(long value) {
        return new Length(value, Unit.INCH);
    }

    static Length yard(long value) {
        return new Length(value, Unit.YARD);
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

    /*public Length add(Length that) {

        double otherConvertedValue = that.unit.convertToOtherUnit(this.unit, that.magnitude);
        return new Length(this.magnitude + otherConvertedValue, this.unit);
    }*/
}
