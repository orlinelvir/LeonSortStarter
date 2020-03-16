package edu.ujcv.estructuras.iterativeMergeSort;

import java.util.PriorityQueue;

public class HeapSort implements SortTester {
    @Override
    public long sort(int[] array) {
        long start = System.nanoTime();

        heapSort(array);
        long end = System.nanoTime();

        return end - start;
    }


    public void heapSort(int[] array) {

        int n = array.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            Flotar(array, n, i);
            //Todo
        }


        for (int i = n - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            Flotar(array, i, 0);
        }
    }


