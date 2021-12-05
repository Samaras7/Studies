package com.company.sorting;

import jdk.jshell.spi.ExecutionControl;

import java.util.Arrays;

public class SortFacade<T extends Comparable<T>> {

    private SortFactory sortFactory;

    public SortFacade() {
        this.sortFactory = new SortFactory();
    }

    public void chooseSortOption(String sortName, T[] array) throws Exception {
        SortType [] types = SortType.values();

        Object [] s =  Arrays.stream(types).filter(name -> name.toString().equals(sortName)).toArray();

        Arrays.stream(s).forEach(System.out::println);

        if(s.length == 0) {
            throw new ExecutionControl.NotImplementedException("Sort algorithm for " + sortName + " is not implemented.");
        }

        sort(sortFactory.create((SortType) s[0]), array);
        sout(array);
    }

    private void sout(T[] array) {
        Arrays.stream(array).forEach(System.out::println);
    }

    private void sort(Sort sort, T[] array) throws Exception {
        sort.sort(array);
    }
}
