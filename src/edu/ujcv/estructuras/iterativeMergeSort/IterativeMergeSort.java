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
    public static void mergesort(int[] A)
    {
        int low = 0;
        int high = A.length - 1;
        int[] temp = Arrays.copyOf(A, A.length);
        for (int m = 1; m <= high - low; m = 2*m)
        {
            for (int i = low; i < high; i += 2*m)
            {
                int from = i;
                int mid = i + m - 1;
                int to = Integer.min(i + 2 * m - 1, high);
                IterativeMerge(A, temp, from, mid, to);
            }
        }
    }