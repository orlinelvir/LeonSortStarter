package edu.ujcv.estructuras.iterativeMergeSort;

import java.util.ArrayList;
import java.util.Random;

public class ShuffleSort implements SortTester {
    @Override
    public long sort(int[] array) {
        long start = System.currentTimeMillis();
        shuffleSort(array);
        long end = System.currentTimeMillis();
        return end - start;
    }
    public int[] shuffleSort(int[] array) { // n * n ^n
        int [] temp = new int[array.length];
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {

            for (int i = 0; i < array.length; i++) {
                numbers.add(array[i]);
            }
            Random r = new Random();
            for (int i = 0; i < temp.length; i++) {
                temp[i] = numbers.remove(r.nextInt(numbers.size()));
            }
            boolean order = true;
            for (int i = 0; i < temp.length && order; i++) {
                for (int j = i; j < temp.length; j++) {
                    if (temp[i] > temp[j]) {
                        order = false;
                        numbers.clear();
                    }
                }
            }
            if(order){
                break;
            }

        }
        return temp;
    }
}

