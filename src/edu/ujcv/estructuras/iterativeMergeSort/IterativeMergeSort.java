package edu.ujcv.estructuras.iterativeMergeSort;
import java.util.Arrays;
import java.util.*;
import java.lang.*;

public class IterativeMergeSort implements SortTester {
    public long sort(int[] array) {
        long start = System.currentTimeMillis();
        new IterativeMergeSort(array);

        long end = System.currentTimeMillis();

        return end - start;
    }

    public static void IterativeMerge(String args[])
    {
        int[] nums = {7,8,9,4,6,5,2,4,3,1,6,8,7,9,2,4,3,5,6};

        printArray(nums);

        mergeSort(nums);

        printArray(nums);
    }

    public static void printArray(int[] nums) {
        for(Integer num : nums)
            System.out.print(num + " ");
        System.out.println();
    }

    public static void mergeSort(int[] nums) {
        if(nums == null) {
            return;
        }

        if(nums.length > 1) {
            int mid = nums.length / 2;

            // Split left part
            int[] left = new int[mid];
            for(int i = 0; i < mid; i++) {
                left[i] = nums[i];
            }

            // Split right part
            int[] right = new int[nums.length - mid];
            for(int i = mid; i < nums.length; i++) {
                right[i - mid] = nums[i];
            }

            mergeSort(left);
            mergeSort(right);

            int i = 0;
            int j = 0;
            int k = 0;

            // Merge left and right arrays
            while(i < left.length && j < right.length) {
                if(left[i] < right[j]) {
                    nums[k] = left[i];
                    i++;
                } else {
                    nums[k] = right[j];
                    j++;
                }
                k++;
            }

            // Collect remaining elements
            while(i < left.length) {
                nums[k] = left[i];
                i++; k++;
            }

            while(j < right.length) {
                nums[k] = right[j];
                j++; k++;
            }
        }
    }
}