package com.algos.sorting;

public class CountingSort implements Sort {

    private int min;
    private int max;

    public CountingSort(int min,int max){
        this.min = min;
        this.max = max;
    }

    @Override
    public void sort(int[] arr) {

    sort(arr,min,max);

    }


    public void sort(int[] arr,int start, int end){

        int[] countArr = new int[(end-start)+1];


        for(int i = 0; i< arr.length;i++){
            countArr[arr[i]-start] += 1;
        }

        int j=0;

        for(int i = start; i< end;i++){
                while(countArr[i-start] > 0) {
                    arr[j++] = i;
                    countArr[i-start]--;
                }
        }

    }
}
