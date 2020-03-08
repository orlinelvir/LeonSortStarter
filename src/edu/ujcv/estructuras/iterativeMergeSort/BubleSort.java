package edu.ujcv.estructuras.iterativeMergeSort;

public class BubleSort implements SortTester {
    @Override
    public long sort(int[] array) {
        long start = System.currentTimeMillis();
        bubleSort(array);

        long end = System.currentTimeMillis();

        return end - start;
    }

    public static int[] bubleSort(int[] a){
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a.length; j++) {
                if(a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }
}
