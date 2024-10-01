package com.giovicente.append.items;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DuplicateAppenderHashSet implements DuplicateAppender {

    @Override
    public List<String> appendDuplicates(List<String> list1, List<String> list2) {
        // O(n) to instance the HashSet, additional overhead
        HashSet<String> setItemsList2 = new HashSet<>(list2);
        List<String> result = new ArrayList<>();

        /*
         * The complexity is O(n) because the lists are the same size.
         * If they were of different sizes, it would be O(n + m).
         */
        for (String item : list1) {
            if (setItemsList2.contains(item)) {
                result.add(item);
            }
        }

        return result;
    }
}
