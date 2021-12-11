package com.company.sorting;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    private static BubbleSort bubbleSort;

    private Integer [] array;

    @BeforeAll
    static void initializeBubbleSort() {
         bubbleSort = new BubbleSort("Bubble sort", "Sorting array using a bubble sort");
    }

    @BeforeEach
    void initializeArray() {
        array = new Integer[]{1, 6, 3, 4, 67, 6, 1};
    }

    @Test
    void bubbleSortTest() {
        try {
            bubbleSort.sort(array);
            assertEquals(true, Arrays.equals(array, new Integer[] {1, 1, 3, 4, 6, 6, 67}));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}