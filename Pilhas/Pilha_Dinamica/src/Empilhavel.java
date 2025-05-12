// Diferença entre dinamica e estatica, é que a estática é alocada a medida que é necessário
// O empilhavel das duas é igual

/** Essa interface define os métodos que devem ser implementados por qualquer classe que represente uma pilha.
 * @author Ana Luiza
 * @version 1.0
 * @since 2025-05-11
 */
package Pilhas.Pilha_Dinamica.src;
public interface Empilhavel<T> {
    void empilhar(T dado);
    T desempilhar();
    T espiar();
    void atualizar(T novoDado);
    Boolean estaVazia();
    boolean estaCheia();
    String imprimir();

}