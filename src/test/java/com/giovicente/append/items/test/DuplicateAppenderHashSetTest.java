package com.giovicente.append.items.test;

import com.giovicente.append.items.DuplicateAppenderHashSet;
import com.giovicente.append.items.ItemsBuilder;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

public class DuplicateAppenderHashSetTest {

    private static List<String> expected;
    private static List<String> list1;
    private static List<String> list2;
    private static DuplicateAppenderHashSet appenderHashSet;

    @BeforeClass
    public static void setUp() {
        expected = List.of(
                "Apple",
                "Banana",
                "Orange",
                "Pineapple",
                "Mango",
                "Strawberry",
                "Blueberry",
                "Grapes",
                "Watermelon",
                "Kiwi",
                "Peach",
                "Pear",
                "Plum",
                "Cherry",
                "Papaya",
                "Apricot",
                "Blackberry",
                "Cantaloupe",
                "Date",
                "Elderberry",
                "Fig",
                "Grapefruit",
                "Honeydew",
                "Jackfruit",
                "Kumquat",
                "Lemon",
                "Lychee",
                "Nectarine",
                "Olive",
                "Passionfruit",
                "Quince",
                "Raspberry",
                "Starfruit",
                "Tangerine",
                "Ugli fruit",
                "Vanilla Bean",
                "Watercress",
                "Xigua",
                "Yellow Passionfruit",
                "Zucchini",
                "Coconut",
                "Durian",
                "Acai",
                "Cranberry",
                "Dragonfruit",
                "Persimmon",
                "Rambutan",
                "Tamarind"
        );

        list1 = ItemsBuilder.buildList1();
        list2 = ItemsBuilder.buildList2();

        appenderHashSet = new DuplicateAppenderHashSet();
    }

    @Test
    public void shouldReturnAppendedList() {
        Assert.assertEquals(expected, appenderHashSet.appendDuplicates(list1, list2));
    }

    @Test
    public void shoudReturnEmptyList() {
        List<String> auxiliarList = List.of("John", "Doe", "Foo", "Bar");
        Assert.assertTrue(appenderHashSet.appendDuplicates(auxiliarList, list2).isEmpty());
    }

}
