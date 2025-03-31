// fila - fila circular = fila com dupla terminação (queue)

package Filas;

public interface Enfileiravel {
    // enfileirar // C enqueue
    // frente // R front
    // atualizar // U update
    // desenfileirar // D dequeue

    void enfileirar(Object dado);
    Object frente();
    void atualizarInicio(Object dado);
    void atualizarFim(Object dado);
    Object desenfileirar();
    
    boolean estaCheia();
    boolean estaVazia();
    String imprimir();
    
    // estaCheia
    // estaVazia
    // imprimir
    
}
