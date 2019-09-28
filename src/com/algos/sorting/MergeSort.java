package com.algos.sorting;

import com.Helper;

public class MergeSort implements Sort {
    @Override
    public void sort(int[] arr) {
            mergeSort(arr,0,arr.length);
    }


    private void mergeSort(int[] arr, int start,int end){

        if(end-start < 2)
            return;

        int mid = (end+start)/2;

        mergeSort(arr,start,mid);
        mergeSort(arr,mid,end);
        merge(arr,start,mid,end);
        Helper.printArray(arr);
    }

    private void merge(int[] arr,int start,int mid,int end){

        if(arr[mid-1] <= arr[mid])
            return;

        int i = start;
        int j = mid;
        int index = 0;
        int[] tempArr = new int[end-start];

        while(i < mid && j < end){
            tempArr[index++] =    arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }

        System.arraycopy(arr,i,arr,start+index,mid-i);
        System.arraycopy(tempArr,0,arr,start,index);
    }
}
