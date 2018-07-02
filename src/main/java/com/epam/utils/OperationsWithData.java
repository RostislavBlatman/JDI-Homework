package com.epam.utils;

import java.util.ArrayList;
import java.util.List;

public class OperationsWithData {

    static public int stringToInt(String digit) {
        try {
            return Integer.parseInt(digit);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    static public String[] getStringElements(Enum[] elements) {

        List<String> listForValues = new ArrayList<>();

        for (Enum element : elements) {
            listForValues.add(element.toString());
        }
        return listForValues.stream().toArray(String[]::new);

    }

}
