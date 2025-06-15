package Arvores_Heap.Heap_Estatico;

public interface Amontoavel<T> {
    void inserir(T dado);
    Object obterRaiz();
    Object extrair() throws Exception;

    String imprimir();
    boolean estaCheia();
    boolean estaVazia();


}
