package com.company.sorting;

public class SortFactory {

    public Sort create(SortType sortType) {
        switch(sortType) {
            case BUBBLESORT -> {
                return new BubbleSort("BubbleSort", "Sorting an array using bubble sort.");
            }
            default -> {
                return null;
            }
        }
    }
}
