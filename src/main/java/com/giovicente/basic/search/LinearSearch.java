package com.giovicente.basic.search;

import java.util.List;

public class LinearSearch implements BasicSearch {
    @Override
    public boolean searchDesiredElement(int desiredNumber, List<Integer> elements) {
        // O(n)
        for (int element : elements) {
            if (element == desiredNumber) {
                return true;
            }
        }

        return false;
    }
}
