package edu.ujcv.estructuras.iterativeMergeSort;
import java.util.Arrays;
import java.util.*;
import java.lang.*;

public class IterativeMergeSort implements SortTester {
    public long sort(int[] array) {
        long start = System.currentTimeMillis();
        new IterativeMergeSort();

        long end = System.currentTimeMillis();

        return end - start;
    }

    public static void iterativeMergesort(int[] array) {
        int current;
        int leftStart;
        int arraySize = array.length - 1;
        for (current = 1; current <= arraySize; current = 2 * current) {
            for (leftStart = 0; leftStart <= arraySize; leftStart += 2 * current) {

                int mid = leftStart + current - 1;
                int right = getMin(leftStart + 2 * current - 1, arraySize);

                mergeArray(array, leftStart, mid, right);
            }

        }

    }

    public static void mergeArray(int[] array, int left, int mid, int right) {

        int leftArraySize = mid - left + 1;
        int rightArraySize = right - mid;

        int[] leftArray = new int[leftArraySize];
        int[] rightArray = new int[rightArraySize];

        for (int i = 0; i < leftArraySize; i++)
            leftArray[i] = array[left + i];

        for (int i = 0; i < rightArraySize; i++)
            rightArray[i] = array[mid + 1 + i];

        int leftPtr = 0;
        int rightPtr = 0;
        int tempPtr = leftPtr;

        while (leftPtr < leftArraySize && rightPtr < rightArraySize) {

            if (leftArray[leftPtr] <= rightArray[rightPtr])
                array[tempPtr++] = leftArray[leftPtr++];

            else
                array[tempPtr++] = rightArray[rightPtr++];
        }

        while (leftPtr <= left)
            array[tempPtr++] = leftArray[leftPtr++];

        while (rightPtr < right)
            array[tempPtr++] = rightArray[rightPtr++];

    }

    public static int getMin(int left, int right) {
        if (left <= right) {
            return left;
        } else {
            return right;
        }
    }
}