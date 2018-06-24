package com.epam.enums;

public enum Odds {
    ONE("1", 1), THREE("3", 3), FIVE("5", 5), SEVEN("7", 7);

    public String value;
    public int digitValue;

    Odds(String value, int digitValue) {
        this.value = value;
        this.digitValue = digitValue;
    }
}
