package com.algos.sorting;

import com.Helper;

public class InsertionSort implements Sort{


    @Override
    public void sort(int[] arr) {

        for(int i = 1; i<arr.length;i++){
            int unSortedElement = i;
            for(int j = i-1;j>=0;j--){
                if(arr[j] >= arr[unSortedElement]){
                    Helper.swap(arr,j,unSortedElement);
                    unSortedElement = j ;
                }
            }
            Helper.printArray(arr);
        }
    }
}
