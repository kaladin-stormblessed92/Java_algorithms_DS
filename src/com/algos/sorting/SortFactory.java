package com.algos.sorting;

public class SortFactory {


    public static Sort getSortAlgo(String type,int ...args){



        switch (type){
            case "bubble" : return new BubbleSort();
            case "selection" : return new SelectionSort();
            case "insertion" : return new InsertionSort();
            case "merge" : return new MergeSort();
            case "counting":return new CountingSort(args[0],args[1]);
            default : return null;

        }
    }
}
