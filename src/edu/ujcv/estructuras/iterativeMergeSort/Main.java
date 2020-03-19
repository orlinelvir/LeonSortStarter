package edu.ujcv.estructuras.iterativeMergeSort;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] elementos = {0,55,67,17,20,10,99,27,9,2,1};


//        IterativeMergeSort s = new IterativeMergeSort();
//        s.iterativeMergesort(elementos);

        MergeSort s = new MergeSort();
        s.mergeSort(elementos);

//        HeapSort s = new HeapSort();
//        s.heapSort(elementos);

//        BubleSort s = new BubleSort();
//        s.bubleSort(elementos);


        for (int i = 0; i < elementos.length; i++) {
            System.out.println(elementos[i]);
        }

        System.out.println("\n\nTarda "+ s.sort(elementos)+ " Nanosegundos");
    }
}
