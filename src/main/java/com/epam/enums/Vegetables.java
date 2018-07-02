package com.epam.enums;

public enum Vegetables {
    CUCUMBER("Cucumber"),
    TOMATO("Tomato"),
    DEFAULT_VEGETABLE("Vegetables"),
    ONION("Onion");

    public String value;

    Vegetables(String text) {
        this.value = text;
    }

    @Override
    public String toString() {
        return value;
    }
}
