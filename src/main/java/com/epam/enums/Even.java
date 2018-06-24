package com.epam.enums;

public enum Even {
    TWO("2", 2), FOUR("4", 4), SIX("6", 6), EIGHT("8", 8);

    public String value;
    public int digitValue;

    Even(String value, int digitValue) {
        this.value = value;
        this.digitValue = digitValue;
    }
}
