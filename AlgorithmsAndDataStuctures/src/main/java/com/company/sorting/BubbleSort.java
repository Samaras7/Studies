package com.company.sorting;

public class BubbleSort extends AbstractSort {

    /**
     * Initializes a new instance of class that inherits AbstractSort.
     *
     * @param sortName        Sorting name.
     * @param sortDescription Sorting description.
     */
    public BubbleSort(String sortName, String sortDescription) {
        super(sortName, sortDescription);
    }

    @Override
    public void sort(Comparable[] arrayToSort) throws Exception {
        for(int i = 0; i < arrayToSort.length; i++) {
            for(int j = 1; j < arrayToSort.length; j++) {
                if(arrayToSort[j].compareTo(arrayToSort[j - 1]) == -1) {
                    Object o = arrayToSort[j - 1];
                    arrayToSort[j - 1] = arrayToSort[j];
                    arrayToSort[j] = (Comparable) o;
                }
            }
        }
    }
}
