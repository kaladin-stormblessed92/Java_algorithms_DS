package com.algos.sorting;

public class QuickSort implements Sort {

    @Override
    public void sort(int[] arr) {

        quickSort(arr,0,arr.length);

    }

    public void quickSort(int[] arr,int start,int end){

        if(end-start < 2)
            return;

        int pivotIndex = findPartition(arr,start,end);

        quickSort(arr,start,pivotIndex);
        quickSort(arr,pivotIndex+1,end);


    }

    private int findPartition(int[] arr, int start, int end) {

        int pivot = arr[start];
        int i = start;
        int j = end;

        while(i < j) {
            while (i < j && arr[--j] > pivot) ;

            if (i < j) {
                arr[i] = arr[j];
            }

            while (i < j && arr[++i] < pivot) ;

            if (i < j) {
                arr[j] = arr[i];
            }

        }
        arr[j] = pivot;
        return j;

    }
}
