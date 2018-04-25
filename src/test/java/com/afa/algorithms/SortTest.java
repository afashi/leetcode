package com.afa.algorithms;

import org.junit.Test;

/**
 * Created by zhou on 2018-04-04.
 */
public class SortTest {
    int[] array = {3, 7, 8, 5, 2, 1, 9, 5, 4};

    @Test
    public void selectionSort() throws Exception {
        Sort.selectionSort(array);
    }

    @Test
    public void quickSort() throws Exception {
        Sort.quickSort(array,0,array.length-1);
    }

}