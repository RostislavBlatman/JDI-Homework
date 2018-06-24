package com.epam.enums;

public enum ServiceButtons {
    SUPPORT("Support"), DATES("Dates"), COMPLEX_TABLE("Complex Table "), SIMPLE_TABLE("Simple Table "),
    TABLE_WITH_PAGES("Table with pages"), DIFFERENT_ELEMENTS("Different elements");

    public String value;

    ServiceButtons(String value) {
        this.value = value;
    }
}
