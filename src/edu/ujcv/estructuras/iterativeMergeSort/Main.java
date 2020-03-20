package edu.ujcv.estructuras.iterativeMergeSort;

public class Main {

    public static void main(String[] args) {
        int[] elementos = {0,55,67,17,20,10,99,27,9,2,1};

        IterativeMergeSort it = new IterativeMergeSort();
        it.IterativeSort(elementos);

        MergeSort m = new MergeSort();
        m.mergeSort(elementos);

        HeapSort h = new HeapSort();
        h.heapSort(elementos);

        BubleSort b = new BubleSort();
        b.bubleSort(elementos);

        System.out.println("\t\t\tPROYECTO ESTRUCTURAS DE DATOS\t\t\t");
        System.out.println("\t\t\tORLIN ELVIR\t\t\t");
        System.out.println("\t\t\t2017130065\t\t\t");
        System.out.println("\t\t\tSEGUNDO PARCIAL\t\t\t");
        System.out.println("\t\t\tFecha: 20/03/2020\t\t\t");

        for (int i = 0; i < elementos.length; i++) {
            System.out.println(elementos[i]);
        }
        System.out.println("\n \t\tEl Algoritmo Iterative Merge Sort tardó "+ it.sort(elementos)+ " Nanosegundos en ordenar el Arreglo");
        System.out.println("\t\tEl Algoritmo MergeSort tardó: " + m.sort(elementos) + " Nanosegundos en ordenar el Arreglo.");
        System.out.println("\t\tEl Algoritmo HeapSort tardó: " + h.sort(elementos) + " Nanosegundos en ordenar el Arreglo.");
        System.out.println("\t\tEl Algoritmo BubbleSort tardó: " + b.sort(elementos) + " Nanosegundos en ordenar el Arreglo.");

    }
}
