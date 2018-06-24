package com.epam.enums;

public enum MenuButtons {
    HOME("Home"), CONTACT_FORM("Contact form"), SERVICE("Service"), METALS_AND_COLORS("Metals & Colors");

    public String value;

    MenuButtons(String value) {
        this.value = value;
    }
}
