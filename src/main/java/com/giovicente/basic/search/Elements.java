package com.giovicente.basic.search;

import java.util.ArrayList;
import java.util.List;

public class Elements {
    public static List<Integer> returnElements() {
        List<Integer> elements = new ArrayList<>();
        int TOTAL_OF_ELEMENTS = 15000001;

        // O(n)
        for (int i = 0; i < TOTAL_OF_ELEMENTS; i++) {
            elements.add(i + 1);
        }

        return elements;
    }
}
