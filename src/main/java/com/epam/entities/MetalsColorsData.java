package com.epam.entities;

import com.epam.enums.*;

import static com.epam.enums.Colors.RED;
import static com.epam.enums.Even.EIGHT;
import static com.epam.enums.Metals.SELEN;
import static com.epam.enums.Nature.FIRE;
import static com.epam.enums.Nature.WATER;
import static com.epam.enums.Odds.THREE;
import static com.epam.enums.Vegetables.CUCUMBER;
import static com.epam.enums.Vegetables.TOMATO;

public class MetalsColorsData {
    public static MetalsColorsData INITIAL_DATA = new MetalsColorsData(
            THREE, EIGHT, new Nature[]{WATER, FIRE}
            , RED, SELEN, new Vegetables[]{CUCUMBER, TOMATO});
    private Odds odds;
    private Even even;
    private Nature[] elements;
    private Colors color;
    private Metals metal;
    private Vegetables[] vegetables;

    public MetalsColorsData(
            Odds odds, Even even, Nature[] elements, Colors color, Metals metal
            , Vegetables[] vegetables) {
        this.odds = odds;
        this.even = even;
        this.elements = elements;
        this.color = color;
        this.metal = metal;
        this.vegetables = vegetables;
    }

    public Odds getOdds() {
        return odds;
    }

    public Even getEven() {
        return even;
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
