package com.algos.sorting;

import com.Helper;

public class SelectionSort implements  Sort {


     @Override
    public void sort(int[] arr) {
          boolean isSorted = true;
         for(int i = 0; i< arr.length;i++){
             int min = i;
             isSorted = true;
             for(int j = i+1; j < arr.length;j++){
                 if(arr[j] < arr[min]){
                     min = j;
                     isSorted = false;
                 }
             }
             if(isSorted){
                 System.out.println("Sorted so Breaking the loop");
                 break;
             }

             Helper.swap(arr,min,i);
             Helper.printArray(arr);
         }
    }
}
