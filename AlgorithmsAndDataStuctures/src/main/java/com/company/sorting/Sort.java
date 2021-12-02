package com.company.sorting;

/**
 * Basic interface to inherit in sorting classes.
 * @author mrcombajn
 * @version 0.0.1
 * @since 02.12.2021
 * @param <T> object of any class
 */
public interface Sort<T> {
    /**
     * @author mrcombajn
     * @version 0.0.1
     * @since 02.12.2021
     * @param arrayToSort
     * @return sorted array
     * @throws Exception
     */
    T[] sort(T[] arrayToSort) throws Exception;
}
