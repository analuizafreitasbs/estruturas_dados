package Listas.Listas_Dinamica;

public class Listavel {
    private Object[] elementos;
    private int tamanho;
    private int capacidade;

    public Listavel(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }

    public void adicionar(Object elemento) {
        if (tamanho == capacidade) {
            aumentarCapacidade();
        }
        elementos[tamanho++] = elemento;
    }

    private void aumentarCapacidade() {
        capacidade *= 2;
        Object[] novosElementos = new Object[capacidade];
        System.arraycopy(elementos, 0, novosElementos, 0, tamanho);
        elementos = novosElementos;
    }

    public int getTamanho() {
        return tamanho;
    }

    public Object getElemento(int index) {
        if (index < 0 || index >= tamanho) {
            throw new IndexOutOfBoundsException("Índice fora dos limites: " + index);
        }
        return elementos[index];
    }
}
