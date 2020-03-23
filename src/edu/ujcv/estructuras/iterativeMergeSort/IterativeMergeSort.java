package edu.ujcv.estructuras.iterativeMergeSort;
import java.lang.*;
public class IterativeMergeSort implements SortTester {
    @Override
    public long sort(int[] array) {
        long start = System.currentTimeMillis();
        new IterativeMergeSort();
        long end = System.currentTimeMillis();
        return end - start;
    }
    public static void IterativeSort(int[] array)
    {
        if(array == null)
        {
            return;
        }
        if(array.length > 1)
        {
            int mid = array.length / 2;
            int[] left = new int[mid];
            for(int i = 0; i < mid; i++)
            {
                left[i] = array[i];
            }
            int[] right = new int[array.length - mid];
            for(int i = mid; i < array.length; i++)
            {
                right[i - mid] = array[i];
            }
            IterativeSort(left);
            IterativeSort(right);
            int s = 0;
            int n = 0;
            int c = 0;
            while(s < left.length && n < right.length)
            {
                if(left[s] < right[n])
                {
                    array[c] = left[s];
                    s++;
                }
                else
                {
                    array[c] = right[n];
                    n++;
                }
                c++;
            }
            while(s < left.length)
            {
                array[c] = left[s];
                s++;
                c++;
            }
            while(n < right.length)
            {
                array[c] = right[n];
                n++;
                c++;
            }
        }
    }
    public void IterativeSort() {
    }
} 