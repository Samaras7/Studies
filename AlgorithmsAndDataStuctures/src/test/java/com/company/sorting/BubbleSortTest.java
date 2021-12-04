package com.company.sorting;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    static BubbleSort bubbleSort;

    Integer [] array;

    @BeforeAll
    static void initializeBubbleSort() {
         bubbleSort = new BubbleSort("Bubble sort", "Sorting array using a bubble sort");
    }

    @BeforeEach
    void initializeArray() {
        array = new Integer[]{1,6,3,4,67,6,1};
    }

    @Test
    void bubbleSortTest() {
        try {
            bubbleSort.sort(array);
            Arrays.stream(array).forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}