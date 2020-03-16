package edu.ujcv.estructuras.iterativeMergeSort;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] elementos = {3,2,4,5,6,7,9,9,10,3,5};
        ShuffleSort s = new ShuffleSort();
        elementos = s.shuffleSort(elementos);

        for (int i = 0; i < elementos.length; i++) {
            System.out.println(elementos[i]);
        }

        elementos = new int[]{3,2,4,5,6,7,9,9,10,3,5};
        System.out.println("SHUFFLE SORT");
        System.out.println("\n\ntarda "+ s.sort(elementos)+ " milisegundos");
    }
}
