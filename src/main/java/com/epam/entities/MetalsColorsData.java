package com.epam.entities;

import static com.epam.enums.Colors.RED;
import static com.epam.enums.Even.EIGHT;
import static com.epam.enums.Metals.SELEN;
import static com.epam.enums.Nature.FIRE;
import static com.epam.enums.Nature.WATER;
import static com.epam.enums.Odds.THREE;
import static com.epam.enums.Vegetables.CUCUMBER;
import static com.epam.enums.Vegetables.TOMATO;

public class MetalsColorsData {
    public static MetalsColorsData INITIAL_DATA = new MetalsColorsData(new int[]{
            THREE.digitValue, EIGHT.digitValue}, new String[]{WATER.value, FIRE.value}
            , RED.value, SELEN.value, new String[]{CUCUMBER.value, TOMATO.value});
    private int[] summary;
    private String[] elements;
    private String color;
    private String metals;
    private String[] vegetables;

    private MetalsColorsData(int[] summary, String[] elements, String color, String metals, String[] vegetables) {
        this.summary = summary;
        this.elements = elements;
        this.color = color;
        this.metals = metals;
        this.vegetables = vegetables;
    }

    public String getOdds() {
        return String.valueOf(summary[0]);
    }

    public String getEven() {
        return String.valueOf(summary[1]);
    }

    public String[] getElements() {
        return elements;
    }


    public String getColor() {
        return color;
    }

    public String getMetal() {
        return metals;
    }

    public String[] getVegetables() {
        return vegetables;
    }
}
