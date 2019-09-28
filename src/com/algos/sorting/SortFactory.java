package com.algos.sorting;

public class SortFactory {


    public static Sort getSortAlgo(String type){

        switch (type){
            case "bubble" : return new BubbleSort();
            case "selection" : return new SelectionSort();
            default : return null;

        }
    }
}