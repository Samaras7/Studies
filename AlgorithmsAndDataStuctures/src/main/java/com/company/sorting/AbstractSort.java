package com.company.sorting;

import lombok.Getter;
import lombok.Setter;

/**
 * Sort class template.
 * @author mrcombajn
 * @since 02.12.2021
 * @version 0.0.1
 */
public abstract class AbstractSort implements Sort {

    @Getter
    @Setter
    protected String sortName;

    @Getter
    @Setter
    protected String sortDescription;

    /**
     * Initializes a new instance of class that inherits AbstractSort.
     * @param sortName Sorting name.
     * @param sortDescription Sorting description.
     */
    public AbstractSort(String sortName, String sortDescription) {
        this.sortName = sortName;
        this.sortDescription = sortDescription;
    }
}
