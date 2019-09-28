package com.algos.searching;

public class BinarySearch {

    public static int search(int[] arr, int key, int start, int end) {


        int mid = (start + end) / 2;

        if (end - start < 2)
            return -1;
        if (key > arr[mid]) {
            return search(arr, key, mid, end);
        } else if (key < arr[mid]) {
            return search(arr, key, start, mid);
        } else if (key == arr[mid]) {
            return mid;
        }
        return -1;

    }


}
