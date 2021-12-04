package com.company.sorting;

/**
 * Basic interface to inherit in sorting classes.
 * @author mrcombajn
 * @version 0.0.1
 * @since 02.12.2021
 * @param <T> object of any class
 */
public interface Sort<T extends Comparable<T>> {
    /**
     * @author mrcombajn
     * @since 02.12.2021
     * @param arrayToSort Array send to the method.
     * @return Sorted array.
     * @throws Exception Throws when exception occurs.
     */
    void sort(T[] arrayToSort) throws Exception;
}
