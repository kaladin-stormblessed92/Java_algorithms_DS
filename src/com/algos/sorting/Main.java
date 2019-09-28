package com.algos.sorting;

import com.Helper;
import com.algos.searching.BinarySearch;

public class Main {

    public static void main(String[] args) {

    int[] input = {9,4,5,2,1};

    Sort sortingAlgo = SortFactory.getSortAlgo("quicksort");
    try {
        sortingAlgo.sort(input);
    }catch (RuntimeException e){
        System.out.println("No suitable Algorithm Found for Sorting");
    }
    Helper.printArray(input);

    }





}
