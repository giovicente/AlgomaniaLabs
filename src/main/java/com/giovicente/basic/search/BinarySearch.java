package com.giovicente.basic.search;

import java.util.List;

public class BinarySearch implements BasicSearch {
    @Override
    public boolean searchDesiredElement(int desired, List<Integer> elements) {
        int left = 0;
        int right = elements.size() - 1;

        // O(log n)
        while (left <= right ) {
            int middle = left + (right - left) / 2;

            if (elements.get(middle) == desired) {
                return true;
            }

            if (elements.get(middle) < desired) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return false;
    }
}
