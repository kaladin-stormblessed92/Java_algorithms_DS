package com.algos.sorting;

import com.Helper;

public class BubbleSort implements Sort {


    @Override
    public void sort(int[] arr){
        boolean isSorted = true;
        for(int i =0; i< arr.length;i++){
            isSorted = true;
            for(int j=0;j< arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    Helper.swap(arr,j,j+1 );
                    isSorted = false;
                }
            }
            if(isSorted){
                System.out.println("Sorted so Breaking the loop");
                break;
            }
            Helper.printArray(arr);
        }
    }

}
