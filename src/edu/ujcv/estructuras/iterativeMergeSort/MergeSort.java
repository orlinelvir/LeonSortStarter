package edu.ujcv.estructuras.iterativeMergeSort;

public class MergeSort  implements SortTester{
    @Override
    public long sort(int[] array) {
        long start = System.currentTimeMillis();
        mergeSort(array);

        long end = System.currentTimeMillis();

        return end - start;
    }

    public static int[] mergeSort(int[] a){
        return new int[5];
    }

    public static int[] merge(int[] inf, int[] sup ){
        return new int[5];
    }


}
