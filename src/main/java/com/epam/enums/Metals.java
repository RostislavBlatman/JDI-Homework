package com.epam.enums;

public enum Metals {
    METALS("Metals"), GOLD("Gold"), SILVER("Silver"), BRONZE("Bronze"), SELEN("Selen");

    public String value;

    Metals(String text) {
        this.value = text;
    }
}
