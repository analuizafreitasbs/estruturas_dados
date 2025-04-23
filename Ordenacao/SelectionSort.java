package Ordenacao;

public class SelectionSort {
    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) { // Passa por todos os elementos
            int minIndex = i; // Assume que o primeiro elemento é o menor
            for (int j = i + 1; j < n; j++) { // Compara com os próximos elementos
                if (array[j] < array[minIndex]) { // Se encontrar um menor, atualiza o índice do menor
                    minIndex = j;
                }
            }
            // Troca o menor elemento encontrado com o primeiro elemento não ordenado
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {4, 0, 2, 5, 6, 3, 8, 9};
        System.out.println("Array original:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        selectionSort(array);

        System.out.println("\nArray ordenado:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
    
}
