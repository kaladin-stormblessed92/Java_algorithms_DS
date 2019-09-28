package com.algos.sorting;

public class SortFactory {


    public static Sort getSortAlgo(String type){

        switch (type){
            case "bubble" : return new BubbleSort();
            case "selection" : return new SelectionSort();
            case "insertion" : return new InsertionSort();
            case "merge" : return new MergeSort();
            default : return null;

        }
    }
}
