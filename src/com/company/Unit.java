package com.company;

enum Unit {
    INCH(2.5), FEET(30.0), YARD(90), CENTIMETER(1);

    private final double conversionFactor;

    Unit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }


    double convertToOtherUnit(Unit unit, double magnitude) {
        return magnitude * this.conversionFactor / unit.conversionFactor;
    }


}
