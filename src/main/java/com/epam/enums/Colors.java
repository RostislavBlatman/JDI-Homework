package com.epam.enums;

public enum Colors {
    COLORS("Colors"), RED("Red"), GREEN("Green"), BLUE("Blue"), YELLOW("Yellow");

    public String value;

    Colors(String text) {
        this.value = text;
    }
}
