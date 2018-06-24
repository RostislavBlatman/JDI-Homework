package com.epam.entities;

import com.epam.enums.Colors;
import com.epam.enums.Metals;
import com.epam.enums.Nature;
import com.epam.enums.Vegetables;

import static com.epam.enums.Colors.RED;
import static com.epam.enums.Metals.SELEN;
import static com.epam.enums.Nature.FIRE;
import static com.epam.enums.Nature.WATER;
import static com.epam.enums.Vegetables.CUCUMBER;
import static com.epam.enums.Vegetables.TOMATO;

public class MetalsColorsResult {
    public static MetalsColorsResult RESULT_DATA = new MetalsColorsResult(11, new Nature[]{WATER, FIRE}
            , RED, SELEN, new Vegetables[]{CUCUMBER, TOMATO});
    private int summary;
    private Nature[] elements;
    private Colors color;
    private Metals metal;
    private Vegetables[] vegetables;

    public MetalsColorsResult(int summary, Nature[] elements, Colors color, Metals metal
            , Vegetables[] vegetables) {
        this.summary = summary;
        this.elements = elements;
        this.color = color;
        this.metal = metal;
        this.vegetables = vegetables;
    }

    public int getSummary() {
        return summary;
    }

    public Nature[] getElements() {
        return elements;
    }

    public Colors getColor() {
        return color;
    }

    public Metals getMetal() {
        return metal;
    }

    public Vegetables[] getVegetables() {
        return vegetables;
    }
}
