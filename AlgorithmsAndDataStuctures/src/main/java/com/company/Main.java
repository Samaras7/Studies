package com.company;

import com.company.sorting.SortFacade;

public class Main {

    public static void main(String[] args) throws Exception {
        Integer [] array = new Integer[] {1, 5, 6, 3, 11, 8, 14};

        SortFacade sortFacade = new SortFacade();

        sortFacade.chooseSortOption("BUBBLESORT", array);
    }
}
