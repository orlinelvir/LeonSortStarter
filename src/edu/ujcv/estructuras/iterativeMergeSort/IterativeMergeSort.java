package edu.ujcv.estructuras.iterativeMergeSort;
import java.util.Arrays;
public class IterativeMergeSort
{
    public static void IterativeMerge(int[] A, int[] temp, int from, int mid, int to)
    {
        int k = from, i = from, j = mid +1;
        while (i <= mid && j <= to) {
            if (A[i] < A[j]) {
                temp[k++] = A[i++];
            } else {
                temp[k++] = A[j++];
            }
        }
    while (i<= mid){
        temp[k++] = A[i++];
    }
    for (i = from; i <= to; i++){
        A[i] = temp[i];
    }
}





