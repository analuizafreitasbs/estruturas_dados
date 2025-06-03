package Arvores_Heap.Heap_Estatico;

public interface Amontoavel {
    void inserir(Object dado);
    Object obterRaiz();
    Object extrair();

    String imprimir();
    boolean estaCheia();
    boolean estaVazia();

}
