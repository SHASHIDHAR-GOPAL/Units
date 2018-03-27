package com.company;

enum Unit {
    INCH(1), FEET(12), YARD(36);

    private final long conversionFactor;

    Unit(long conversionFactor) {
        this.conversionFactor = conversionFactor;
    }


    double convertToOtherUnit(Unit unit, long magnitude) {
        return magnitude * this.conversionFactor / unit.conversionFactor;
    }


}
