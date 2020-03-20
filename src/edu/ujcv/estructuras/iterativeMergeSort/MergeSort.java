package edu.ujcv.estructuras.iterativeMergeSort;

public class MergeSort  implements SortTester{
    @Override
    public long sort(int[] array) {
        long start = System.nanoTime();
        mergeSort(array);
        long end = System.nanoTime();
        return end - start;
    }
    public  static int[] mergeSort(int[] arr){
        //caso base.
        if(arr.length <= 1){
            return arr;
        }
        // caso recursivo.
        int medio = arr.length /2;
        int[] lower = new int[medio];
        int[] higher = new int[arr.length - medio];
        for (int i = 0; i < medio; i++) {
            lower[i] = arr[i];
        }
        for (int i = 0; i < higher.length ; i++) {
            higher[i] = arr[i + lower.length];
        }
        return  merge(mergeSort(lower), mergeSort(higher));
    }
    public static int[] merge(int[] a, int[] b){
        int[] retval = new int[a.length+ b.length];
        int s = 0;
        int n = 0;
        int c = 0;
        while (n < a.length && c < b.length ){
            if(a[n] < b[c]){
                retval[s++] = a[n++];
            }else{
                retval[s++] = b[c++];
            }
        }
        while (n < a.length){
            retval[s++] = a[n++];
        }
        while (c < b.length) {
            retval[s++] = b[c++];
        }
        return retval;
    }
}
