package Filas;

public class fila_01 {

    private int[] dados;
    private int primeiro;
    private int ultimo;
    private int total;

    public fila_01() {
        dados = new int[10];
        primeiro = 0;
        ultimo = 0;
        total = 0;
    }

    public void inserir(int elemento) {
        if (isFull()) {
            throw new RuntimeException("Fila cheia!!");
        }
        dados[ultimo] = elemento;
        ultimo = (ultimo + 1) % dados.length;
        total++;
    }

    public int retirar() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia!!");
        }
        int elemento = dados[primeiro];
        primeiro = (primeiro + 1) % dados.length;
        total--;
        return elemento;

    }

    public boolean isEmpty() {
        return total==0;
    }

    public boolean isFull() {
        return total==dados.length;
    }
    
}
