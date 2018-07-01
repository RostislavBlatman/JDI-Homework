package com.epam.entities;

import com.epam.enums.Colors;
import com.epam.enums.Metals;
import com.epam.enums.Nature;
import com.epam.enums.Vegetables;

import static com.epam.enums.Colors.COLORS;
import static com.epam.enums.Colors.RED;
import static com.epam.enums.Even.DEFAULT_SUM;
import static com.epam.enums.Metals.METALS;
import static com.epam.enums.Metals.SELEN;
import static com.epam.enums.Nature.FIRE;
import static com.epam.enums.Nature.WATER;
import static com.epam.enums.Vegetables.*;
import static com.epam.utils.OperationsWithData.stringToInt;

public class MetalsColorsResult {

    public static MetalsColorsResult RESULT_DATA = new MetalsColorsResult(11, new Nature[]{WATER, FIRE}
            , RED, SELEN, new Vegetables[]{CUCUMBER, TOMATO});
    private String resultOfCalculation;
    private int summary;
    private Nature[] elements;
    private Colors color;
    private Metals metal;
    private Vegetables[] vegetables;

    public MetalsColorsResult() {
        super();
    }

    ;

    public MetalsColorsResult(int summary, Nature[] elements, Colors color, Metals metal
            , Vegetables[] vegetables) {
        this.summary = summary;
        this.elements = elements;
        this.color = color;
        this.metal = metal;
        this.vegetables = vegetables;
    }

    public String getLog(String name, String... values) {
        return newResultLine(name, values);
    }

    public String newResultLine(String name, String... values) {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        for (int i = 0; i < values.length; i++) {
            sb.append(values[i]);
            if (values.length > 1 && i < (values.length - 1)) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public String[] getResult(MetalsColorsData data) {
        resultOfCalculation = (data.getOdds() != null && data.getEven() != null) ?
                (Integer.toString(stringToInt(data.getOdds()) +
                        stringToInt(data.getEven()))) : DEFAULT_SUM.value;
        return (data.getElements() == null) ?
                new String[]{getLog("Summary: ", resultOfCalculation),
                        getLog("Color: ", (data.getColor() == null) ? COLORS.value : data.getColor()),
                        getLog("Metal: ", (data.getMetal() == null) ? METALS.value : data.getMetal()),
                        getLog("Vegetables: ", (data.getVegetables() == null) ? new String[]{DEFAULT_VEGETABLE.value}
                                : data.getVegetables())} :
                new String[]{getLog("Summary: ", resultOfCalculation),
                        getLog("Elements: ", data.getElements()),
                        getLog("Color: ", (data.getColor() == null) ? COLORS.value : data.getColor()),
                        getLog("Metal: ", (data.getMetal() == null) ? METALS.value : data.getMetal()),
                        getLog("Vegetables: ", (data.getVegetables() == null) ? new String[]{DEFAULT_VEGETABLE.value}
                                : data.getVegetables())};
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
