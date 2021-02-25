
import java.util.Arrays;

public class Principal {
    public static void main (String [] args){

       int [] v ={4,6,9,7,3,5,1,8,10};
        IOrdenacao m = new Mergesort();

        System.out.println(" vetor sem usar megersort ");
        for(int x : v) {
            System.out.print(x + " ");
        }

        m.ordenar(v);

        //Imprime os valores do vetor após ser ordenados pelo Merge Sort.
        System.out.println();
        System.out.println(" vetor usando megersort em ordem crescente");
        for(int x : v) {
            System.out.print(x + " ");
        }

        //Imprime os valores do vetor após ser ordenados pelo Em ordem descrecente.
        m.ordenarDecrescente(v);
        System.out.println();
        System.out.println(" vetor usando megersort em ordem descrescente");

        for(int x : v) {
            System.out.print(x + " ");
        }


        System.out.println(" \n \n ********************************************** \n  ");

/* Quisort teste*/


        int v1[] = {24,  1, 5, 9, 13, 16, 23, 13, 7, 55, 67, 92, 22, 33, 27, 19};
            QuickSort s = new QuickSort();

        System.out.println(" vetor sem quiksort ");
        for(int x : v1) {
            System.out.print(x + " ");
        }

          s.ordenar(v1);
        System.out.println(" \n vetor com quiksort crescente ");
        for(int x : v1) {
            System.out.print(x + ", ");
        }


        s.ordenarDecrescente(v1);
        System.out.println(" \n vetor com quiksort descrecente ");
        for(int x : v1) {
            System.out.print(x + ", ");
        }




        }






    }


