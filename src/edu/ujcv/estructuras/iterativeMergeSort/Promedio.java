package edu.ujcv.estructuras.iterativeMergeSort;

import java.util.Random;

public class Promedio {
    public static void main(String[] args){
        int [] arreglo1 = new int[100];
        int [] arreglo2 = new int[100];
        int [] arreglo3 = new int[100];
        int [] arreglo4 = new int[100];
        int [] arreglo5 = new int[100];
        Random random = new Random();
        for (int i = 0; i < arreglo1.length; i++) {
            arreglo1[i] = Math.abs(random.nextInt(1000));
            arreglo2[i] = Math.abs(random.nextInt(1000));
            arreglo3[i] = Math.abs(random.nextInt(1000));
            arreglo4[i] = Math.abs(random.nextInt(1000));
            arreglo5[i] = Math.abs(random.nextInt(1000));
        }
          BubleSort b = new BubleSort();
          ShuffleSort s = new ShuffleSort();
          MergeSort m = new MergeSort();
          IterativeMergeSort it = new IterativeMergeSort();
          HeapSort h = new HeapSort();
//       ShuffleSort s = new ShuffleSort();

        System.out.println("\t\t\tPROYECTO ESTRUCTURAS DE DATOS\t\t\t");
        System.out.println("\t\t\tORLIN ELVIR\t\t\t");
        System.out.println("\t\t\t2017130065\t\t\t");
        System.out.println("\t\t\tSEGUNDO PARCIAL\t\t\t");
        System.out.println("\t\t\tFecha: 20/03/2020\t\t\t");

        long t1 = it.sort(arreglo1);
        long t2 = it.sort(arreglo2);
        long t3 = it.sort(arreglo3);
        long t4 = it.sort(arreglo4);
        long t5 = it.sort(arreglo5);
        double pro1 = t1+t2+t3+t4+t5;
        System.out.println("\nEl Promedio del Iterative Merge Sort es de: " + (pro1/5+ " Nanosegundos"));

        long ti1 = m.sort(arreglo1);
        long ti2 = m.sort(arreglo2);
        long ti3 = m.sort(arreglo3);
        long ti4 = m.sort(arreglo4);
        long ti5 = m.sort(arreglo5);
        double pro2 = ti1+ti2+ti3+ti4+ti5;
        System.out.println("El Promedio del MergeSort Sort es de: " + (pro2/5+ " Nanosegundos"));

        long tie1 = h.sort(arreglo1);
        long tie2 = h.sort(arreglo2);
        long tie3 = h.sort(arreglo3);
        long tie4 = h.sort(arreglo4);
        long tie5 = h.sort(arreglo5);
        double pro3 = tie1+tie2+tie3+tie4+tie5;
        System.out.println("El Promedio del HeapSort Sort es de: " + (pro3/5+ " Nanosegundos"));

        long tiem1 = b.sort(arreglo1);
        long tiemp2 = b.sort(arreglo2);
        long tiemp3 = b.sort(arreglo3);
        long tiemp4 = b.sort(arreglo4);
        long tiemp5 = b.sort(arreglo5);
        double pro4 = tiem1+tiemp2+tiemp3+tiemp4+tiemp5;
        System.out.println("El Promedio del BubbleSort Sort es de: " + (pro4/5+ " Nanosegundos"));

        /*long tiempo1 = s.sort(Arreglo1);
        long tiempo2 = s.sort(Arreglo2);
        long tiempo3 = s.sort(Arreglo3);
        long tiempo4 = s.sort(Arreglo4);
        long tiempo5 = s.sort(Arreglo5);
        double pro5 = timin1+timin2+timin3+timin4+timin5;
        System.out.println("El Promedio del ShuffleSort Sort es de: " + (promedio5/5+ " Nanosegundos"));*/
    }
}
