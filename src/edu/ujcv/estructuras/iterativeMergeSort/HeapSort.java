package edu.ujcv.estructuras.iterativeMergeSort;
import java.util.PriorityQueue;
public class HeapSort implements SortTester {
    @Override
    public long sort(int[] array) {
        long start = System.currentTimeMillis();
        heapSort(array);
        long end = System.currentTimeMillis();
        return end - start;
    }
    public void heapSort(int[] array) {
        int n = array.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            Flotar(array, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            Flotar(array, i, 0);
        }
    }
    public void Flotar(int[] arr, int n, int i) {
        int boss = i;
        int d1 = i * 2 + 1;
        int i2 = i * 2 + 2;
        if (d1 < n && arr[d1] > arr[boss]) {
            boss = d1;
        }
        if (i2 < n && arr[i2] > arr[boss]) {
            boss = i2;
        }
        if (boss != i) {
            int temp = arr[i];
            arr[i] = arr[boss];
            arr[boss] = temp;
            Flotar(arr, n, boss);
        }
    }
}