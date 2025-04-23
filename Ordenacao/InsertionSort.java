package Ordenacao;

public class InsertionSort {
    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) { // Começa do segundo elemento
            int key = array[i]; // O elemento a ser inserido na parte ordenada
            int j = i - 1; // Índice do último elemento da parte ordenada
            
            // Move os elementos da parte ordenada que são maiores que key para uma posição à frente
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            // Insere o key na posição correta
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] array = {4, 0, 2, 5, 6, 3, 8, 9};
        System.out.println("Array original:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        insertionSort(array);

        System.out.println("\nArray ordenado:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
    
}

