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
        int sub1 = i * 2 + 1;
        int sub2 = i * 2 + 2;
        if (sub1 < n && arr[sub1] > arr[boss]) {
            boss = sub1;
        }
        if (sub2 < n && arr[sub2] > arr[boss]) {
            boss = sub2;
        }
        if (boss != i) {
            int temp = arr[i];
            arr[i] = arr[boss];
            arr[boss] = temp;
            Flotar(arr, n, boss);
        }
    }
}