public class Mergesort implements  IOrdenacao{

    private static void intercala(int[] vetor, int inicio, int meio, int fim) {

        int novoVetor[] = new int[fim - inicio];
        int i = inicio;
        int m = meio;
        int pos = 0;

        while(i < meio && m < fim) {
            if(vetor[i] <= vetor[m]) {
                novoVetor[pos] = vetor[i];
                pos = pos + 1;
                i = i + 1;

            } else {
                novoVetor[pos] = vetor[m];
                pos = pos + 1;
                m = m + 1;
            }
        }

        while(i < meio) {
            novoVetor[pos] = vetor[i];
            pos = pos + 1;
            i = i + 1;
        }

        while(m < fim) {
            novoVetor[pos] = vetor[m];
            pos = pos + 1;
            m = m + 1;
        }


        for(pos = 0, i = inicio; i < fim; i++, pos++) {
            vetor[i] = novoVetor[pos];
        }
    }


    @Override
    public void ordenar(int[] valores) {
     //ordenado de forma crescente
      mergeSort(valores.length,valores);


        }

    private static void mergeSort(int tamanho, int[] vetor) {

        int elementos = 1;
        int inicio, meio, fim;

        while(elementos < tamanho) {
            inicio = 0;
            while(inicio + elementos < tamanho) {
                meio = inicio + elementos;
                fim = inicio + 2 * elementos;
                if(fim > tamanho)
                    fim = tamanho;
                intercala(vetor, inicio, meio, fim);
                inicio = fim;
            }
            elementos = elementos * 2;
        }
    }



    @Override
    public void ordenarDecrescente(int[] valores) {
        for (int i = 1; i < valores.length; i++) {
            for (int j = 0; j < i; j++) {
                if (valores[i] > valores[j]) {
                    int temp = valores[i];
                    valores[i] =valores[j];
                    valores[j] = temp;
                }
            }
        }
    }


    }















