

public class QuickSort implements IOrdenacao {


    private void quickSort(int[] vetor, int inicio, int fim) {
        if (fim > inicio) {

            int x = intercala(vetor, inicio, fim);
            quickSort(vetor, inicio, x - 1);
            quickSort(vetor, x + 1, fim);
        }
    }

    private int intercala(int[] vetor, int inicio, int fim) {


        int x, ponteiroEsquerdo, ponteiroDireito = fim;
        ponteiroEsquerdo = inicio + 1;
        x = vetor[inicio];

        while (ponteiroEsquerdo <= ponteiroDireito) {

            while (ponteiroEsquerdo <= ponteiroDireito && vetor[ponteiroEsquerdo] <= x) {
                ponteiroEsquerdo++;
            }

            while (ponteiroDireito >= ponteiroEsquerdo && vetor[ponteiroDireito] > ponteiroEsquerdo) {
                ponteiroDireito--;
            }

            if (ponteiroEsquerdo < ponteiroDireito) {
                trocarElementosVetor(vetor, ponteiroDireito, ponteiroEsquerdo);
                ponteiroEsquerdo++;
                ponteiroDireito--;
            }
        }

        trocarElementosVetor(vetor, inicio, ponteiroDireito);
        return ponteiroDireito;

    }

    private void trocarElementosVetor(int[] vetor, int i, int j) {
        int temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
    }



    @Override
    public void ordenar(int[] valores) {
        quickSort(valores, 0, valores.length - 1);
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