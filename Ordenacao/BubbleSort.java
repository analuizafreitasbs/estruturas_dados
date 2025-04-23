package Ordenacao;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) { // Passa por todos os elementos
            for (int j = 0; j < n - i - 1; j++) { // Compara elementos adjacentes, seu tirar o i ele ainda vai comparar o último elemento com o penúltimo, mas com mais comperação
                if (array[j] > array[j + 1]) { // Troca se estiver fora de ordem
                    // Troca os elementos
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {4,0,2,5,6,3,8,9};
        System.out.println("Array original:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        bubbleSort(array);

        System.out.println("\nArray ordenado:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}