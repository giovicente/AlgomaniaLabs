package com.giovicente.append.items;

import java.util.ArrayList;
import java.util.List;

public class DuplicateAppenderList implements DuplicateAppender {

    @Override
    public List<String> appendDuplicates(List<String> list1, List<String> list2) {
        List<String> result = new ArrayList<>();

         /*
          * The complexity is O(n^2) because the lists are the same size.
          * If they were of different sizes, it would be O(n * m).
          */
        for (String item1 : list1) {
            for (String item2 : list2) {
                if (item1.equals(item2)) {
                    result.add(item1);
                }
            }
        }

        return result;
    }
}
