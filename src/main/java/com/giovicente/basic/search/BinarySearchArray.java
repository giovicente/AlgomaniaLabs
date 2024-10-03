package com.giovicente.basic.search;

import java.util.List;

public class BinarySearchArray implements BasicSearch {

    @Override
    public boolean searchDesiredElement(int desired, List<Integer> elements) {
        int[] elementsArray = new int[elements.size()];

        for (int i = 0; i < elementsArray.length; i++) {
            elementsArray[i] = elements.get(i);
        }

        int left = 0;
        int right = elementsArray.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (elementsArray[middle] == desired) {
                return true;
            }

            if (elementsArray[middle] < desired) {
                left = middle + 1;
            }

            if (elementsArray[middle] > desired) {
                right = middle - 1;
            }
        }

        return false;
    }
}
